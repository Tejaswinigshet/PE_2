package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber evenNum;

    @Before
    public void setUp() throws Exception {
        evenNum=new EvenNumber();
    }

    @After
    public void tearDown() throws Exception {
        evenNum=null;
    }

    @Test
    public void givenEvenPositiveNumber_ShouldReturn_EvenNumber() {
        boolean expectedValue=true;
        boolean actualValue=evenNum.isEven(112);
        assertEquals(expectedValue,actualValue);

    }
    @Test
    public void givenoddPositiveNumber_ShouldReturn_OddNumber() {
        boolean expectedValue=true;
        boolean actualValue=evenNum.isEven(113);
        assertNotEquals(expectedValue,actualValue);
    }

    }
