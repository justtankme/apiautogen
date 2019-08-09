package com.tank.apiautogen.pojogen;

public enum PropertyTypeEnum {
    STRING("string");

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    PropertyTypeEnum(String type) {
        this.type = type;
    }
}
