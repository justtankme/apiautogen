package com.tank.apiautogen;

import com.tank.apiautogen.pojogen.PojoGen;
import freemarker.template.TemplateException;
import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import java.io.IOException;

public class PojoGenTest {

    @Test
    public void test() throws IOException, TemplateException {
        PojoGen pojoGen = new PojoGen();
        pojoGen.genByExcel(SystemUtils.getUserDir() + "/src/test/java/com/tank/apiautogen/工作簿1.xls",
                "com.wiselong.thirdparty.takeout.subway.bean",
                "duanzw",
                "SubwayShopInfo",
                SystemUtils.getUserDir() + "/src/test/java/com/tank/apiautogen/",
                "SubwayShopInfo.java");
    }
}
