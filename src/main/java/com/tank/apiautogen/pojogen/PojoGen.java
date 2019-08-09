package com.tank.apiautogen.pojogen;

import com.tank.apiautogen.tools.PojoGenTool;
import freemarker.template.TemplateException;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PojoGen {

    public void gen(Clazz pojo, String destPath, String destName) throws IOException, TemplateException {
        PojoGenTool.genFileWithData("pojogen.ftl", pojo, destPath, destName);
        return;
    }

    public void genByExcel(String srcFilePathAndName, String packageName, String author, String className, String destPath, String destName) throws IOException, TemplateException {
        try (InputStream is = new FileInputStream(srcFilePathAndName);) {
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
            for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
                HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
                if (hssfSheet == null) {
                    continue;
                }
                Clazz clazz = new Clazz();
                clazz.setPackageName(packageName);
                clazz.setAuthor(author);
                clazz.setClassName(className);
                List<ClazzAttr> clazzAttrs = new ArrayList<>();
                for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow == null) {
                        continue;
                    }
                    ClazzAttr clazzAttr = new ClazzAttr();
                    for (int cellNum = 0; cellNum < hssfRow.getLastCellNum(); cellNum++) {
                        HSSFCell xssfCell = hssfRow.getCell(cellNum);
                        if (null != xssfCell) {
                            xssfCell.setCellType(Cell.CELL_TYPE_STRING);
                        }
                        String valueStr = StringUtils.trim(getValue(xssfCell));
                        if (cellNum == 0) {
                            clazzAttr.setLevel(valueStr);
                        }
                        if (cellNum == 1) {
                            clazzAttr.setName(valueStr);
                        }
                        if (cellNum == 2) {
                            clazzAttr.setRemark(valueStr);
                        }
                        if (cellNum == 3) {
                            clazzAttr.setRequired(valueStr);
                        }
                        if (cellNum == 4) {
                            clazzAttr.setType(valueStr);
                        }
                        if (cellNum == 5) {
                            clazzAttr.setDetail(valueStr);
                        }
                    }
                    clazzAttrs.add(clazzAttr);
                }
                clazz.setAttrs(clazzAttrs);
                gen(clazz,destPath,destName);
            }
        }
    }
        private String getValue(HSSFCell xssfCell) {
            if (null == xssfCell) {
                return null;
            }
            if (xssfCell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN) {
                return String.valueOf(xssfCell.getBooleanCellValue()).trim();
            } else if (xssfCell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
                String v = xssfCell.getNumericCellValue() + "";
                return String.valueOf(v.replace(".0", "")).trim();
            } else {
                return String.valueOf(xssfCell.getStringCellValue()).trim();
            }
        }
}
