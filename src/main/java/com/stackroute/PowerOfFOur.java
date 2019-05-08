/*Write a Java method to check if a given number is power of 4*/
package com.stackroute;
import java.lang.Math;

public class PowerOfFOur {
    public  boolean isPower(int n)
    {
        if(n==0)
            return false;
        while(n!=1)
        {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
            return true;
        }
    }
