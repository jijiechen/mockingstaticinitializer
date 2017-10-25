package com.testapp.staticinitializer;

public class SomeStaticInitializer {

    static CoolConfiguration config;

    static {
        config = CoolConfiguration.getInstance();
    }

    public String getConfigValue(){
        return config.getInstanceName();
    }
}

