package com.testapp.staticinitializer;

public class SomeStaticInitializer {

    static CoolConfiguration config;

    static {
        System.out.println("Static initializer executing...");
        config = CoolConfiguration.getInstance();
    }

    public String getConfigValue(){
        return config.getInstanceName();
    }

    public CoolConfiguration getConfig(){
        return config;
    }
}

