package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFOurTest {
    PowerOfFOur power;
    int number;

    @Before
    public void setUp() throws Exception {
        power = new PowerOfFOur();

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void givenValidPowerOfFour_ShouldResturn_true() throws Exception {

        Boolean expectedValue =true;

        Boolean actualValue = power.isPower(16);
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void givenInvalidPowerOfFour_ShouldReturn_false() throws Exception {

        Boolean expectedValue =false;

        Boolean actualValue = power.isPower(43);
        assertEquals(expectedValue, actualValue);

    }

}