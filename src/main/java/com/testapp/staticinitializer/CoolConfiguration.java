package com.testapp.staticinitializer;

public class CoolConfiguration {
    private String instanceName;

    public CoolConfiguration(String name) {
        instanceName = name;
    }

    public static CoolConfiguration getInstance() {
        CoolConfiguration instance = new CoolConfiguration("instance name in prod code");
        return instance;
    }

    public String getInstanceName() {
        return instanceName;
    }
}
