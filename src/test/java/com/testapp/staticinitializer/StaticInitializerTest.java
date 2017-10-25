package com.testapp.staticinitializer;


import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StaticInitializerTest {
    @Test
    public void SampleTest(){
       assertTrue(true);
    }

    @Test
    public void TestStaticInitlializer(){
        new MockupConfig();
        SomeChildClass child = new SomeChildClass();

        assertEquals("test instance", child.getConfigValue());
        assertEquals("Property value from child class.", child.getProp());
    }


    static class MockupConfig extends MockUp<CoolConfiguration> {
        @Mock
        public static CoolConfiguration getInstance() {
            return new CoolConfiguration("test instance");
        }
    }
}
