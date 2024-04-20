package com.ecommerce.selenium.utilities;

public enum PropKey {
    URL("url"),
    PORT("port"),
    BROWSER("browser");

    private String propVal;

    PropKey(String propVal) {
        this.propVal = propVal;
    }

    public String getPropVal() {
        return propVal;
    }
}
