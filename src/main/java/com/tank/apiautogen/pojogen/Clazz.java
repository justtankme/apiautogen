package com.tank.apiautogen.pojogen;

import java.util.List;

public class Clazz {
    private String packageName;
    private String author;
    private String className;
    private List<ClazzAttr> attrs;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ClazzAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<ClazzAttr> attrs) {
        this.attrs = attrs;
    }
}
