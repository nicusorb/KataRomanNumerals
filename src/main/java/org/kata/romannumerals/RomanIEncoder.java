package org.kata.romannumerals;

/**
 * Create by: nicubucalaete
 * Date: 4/20/12
 */
public class RomanIEncoder implements RomanNumeralEncoder {
    public int parseNumber(int number, StringBuffer romanNr) {
        if (number < 4) {
            for (int j = 0; j < number; j++) {
                romanNr.append("I");
            }
        } else {
            romanNr.append("IV");
        }
        return 0;
    }
}
