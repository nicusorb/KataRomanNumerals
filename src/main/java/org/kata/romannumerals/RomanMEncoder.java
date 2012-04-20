package org.kata.romannumerals;

/**
 * Create by: nicubucalaete
 * Date: 4/20/12
 */
public class RomanMEncoder implements RomanNumeralEncoder {

    public int parseNumber(int nr, StringBuffer romanNr) {
        if (nr >= 1000){
            int m = nr / 1000;
            for(int i=0;i<m;i++){
                romanNr.append("M");
            }
            return nr % 1000;
        }
        return nr;
    }
}
