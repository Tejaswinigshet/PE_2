package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {
    private ReversePalindrome palindrome;
    private String s;

    @Before
    public void setUp() throws Exception {


        palindrome = new ReversePalindrome();

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void givenEmptyString_ShouldReturn_true() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void givenMultipleWhiteSpace_ShouldReturn_true() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("Tej asw ini   ini wsa jet");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void givenSingleChar_ShouldReturn_true() throws Exception {
        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("I");
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void givenValidPalindrome_ShouldReturn_true() throws Exception {

        Boolean expectedValue = true;

        Boolean actualValue = palindrome.checkPalindrome("Gadag gadag");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void givenInvalidPalindrome_ShouldReturn_false() throws Exception {
        Boolean expectedValue = false;

        Boolean actualValue = palindrome.checkPalindrome("Hi Hello");
        assertEquals(expectedValue, actualValue);


    }

}