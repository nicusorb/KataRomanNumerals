package org.kata.romannumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRomanNumerals {
    private final RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void printI_forNumber1() {
        assertEquals("I", romanNumerals.getRomanNumerals(1));
    }

    @Test
    public void printIII_forNumber3() {
        assertEquals("III", romanNumerals.getRomanNumerals(3));
    }

    @Test
    public void printIV_forNumber4(){
        assertEquals("IV", romanNumerals.getRomanNumerals(4));
    }

    @Test
    public void printV_forNumber5(){
        assertEquals("V", romanNumerals.getRomanNumerals(5));
    }

    @Test
    public void printX_forNumber10(){
        assertEquals("X", romanNumerals.getRomanNumerals(10));
    }


}

