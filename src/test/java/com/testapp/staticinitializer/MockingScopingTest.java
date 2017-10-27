package com.testapp.staticinitializer;

import mockit.Mock;
import mockit.MockUp;
import mockit.integration.junit4.JMockit;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JMockit.class)
public class MockingScopingTest {


    @Test
    public void shouldMockImpl(){
        new MockChildClassWithFunctionality();

        ChildClassWithFunctionality instance = new ChildClassWithFunctionality();
        assertEquals("mocked value.", instance.getProp());
    }

    @Test
    public void shouldNotMockImpl(){
        ChildClassWithFunctionality instance = new ChildClassWithFunctionality();
        assertEquals("Property value from real class.", instance.getProp());
    }



    static class MockChildClassWithFunctionality extends MockUp<ChildClassWithFunctionality>{
        @Mock
        public String getProp(){
            return "mocked value.";
        }
    }
}
