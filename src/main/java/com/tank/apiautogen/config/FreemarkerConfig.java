package com.tank.apiautogen.config;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.SystemUtils;

import java.io.File;
import java.io.IOException;

public class FreemarkerConfig {
    private static Configuration cfg = null;

    static {
        // Create your Configuration instance, and specify if up to what FreeMarker
        // version (here 2.3.22) do you want to apply the fixes that are not 100%
        // backward-compatible. See the Configuration JavaDoc for details.
        cfg = new Configuration(Configuration.VERSION_2_3_22);

        // Specify the source where the template files come from. Here I set a
        // plain directory for it, but non-file-system sources are possible too:
        try {
            cfg.setDirectoryForTemplateLoading(new File(SystemUtils.getUserDir() + "/src/main/resources/freemarker"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set the preferred charset template files are stored in. UTF-8 is
        // a good choice in most applications:
        cfg.setDefaultEncoding("UTF-8");

        // Sets how errors will appear.
        // During web page *development* TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    }

    public static Configuration getInstance() {
        return cfg;
    }

    public static Template getTemplate(String tempName) throws IOException {
        Configuration cfg = FreemarkerConfig.getInstance();
        return cfg.getTemplate(tempName);
    }
}
