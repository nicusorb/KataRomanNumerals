package org.kata.romannumerals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RomanNumerals {
    private List<RomanNumeralEncoder> myEncoders = new LinkedList<RomanNumeralEncoder>();

    public RomanNumerals() {
//        myEncoders.add(new RomanMEncoder());
//        myEncoders.add(new RomanDEncoder());
//        myEncoders.add(new RomanCEncoder());
//        myEncoders.add(new RomanLEncoder());
//        myEncoders.add(new RomanXEncoder());
//        myEncoders.add(new RomanVEncoder());
        myEncoders.add(new RomanIEncoder());
    }

    public String getRomanNumerals(int number) {
        StringBuffer sb = new StringBuffer();
        for (RomanNumeralEncoder encoder : myEncoders) {
            number = encoder.parseNumber(number, sb);
        }

        return sb.toString();
    }
}