package com.tank.apiautogen.tools;

import com.tank.apiautogen.config.FreemarkerConfig;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;

public class PojoGenTool {


    public static void genFileWithData(String tempName, Object clazz, String destPath, String destName) throws IOException, TemplateException {
        Template temp = FreemarkerConfig.getTemplate(tempName);
        File dir = new File(destPath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        OutputStream fos = new FileOutputStream( new File(dir, destName));
        Writer out = new OutputStreamWriter(fos);
        temp.process(clazz, out);
        fos.flush();
        fos.close();
        System.out.println("gen code success!");
    }
}
