package com.testapp.staticinitializer;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaticBlockTest {


    @Test
    public void shouldBeAbleToStuboutStaticBlock( ){
        new MockBaseStaticInitializer();
        SomeChildClass childClass = new SomeChildClass();

        assertEquals("Property value from child class.", childClass.getProp());
        assertNull(childClass.getConfig());
    }

    @Test
    public void stubbedStaticBlockWillBeAppliedToOtherCases( ){
        SomeChildClass childClass = new SomeChildClass();

        assertNull(childClass.getConfig());
    }

    @Test
    public void shouldBeAbleToStuboutAbstractBaseStaticBlock( ){
        new MockAbstractBaseStaticInitializer();
        SomeChildClassFromAbstractBase childClass = new SomeChildClassFromAbstractBase();

        assertEquals("Property value from child class.", childClass.getProp());
        assertNull(childClass.getConfig());
    }



    public static class MockBaseStaticInitializer extends MockUp<SomeStaticInitializer> {
        @Mock
        void $clinit(){

        }
    }

    public static class MockAbstractBaseStaticInitializer extends MockUp<SomeChildClassFromAbstractBase> {
        @Mock
        void $clinit(){

        }
    }
}
