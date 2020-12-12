package com.demo.Interview_Questions;

public class Roman_Numerals_To_Arabic_Ints {

    public static void main(String[] args) {
        /**
         * 1903 => MCMIII
         * MMM CM XC IX => 3999
         */
        String roman = "MMXXI";

        int i = 0;      // A position in the string, roman
        int arabic = 0; // Initial value of arabic

        while (i < roman.length()) {

            char letter = roman.charAt(i);
            int number = letterToNumber(letter);

            i++;

            if (i == roman.length()) {
                // There is no letter in the string following the one we have just processed.
                // So just add the number corresponding to the single letter to arabic.
                arabic += number;
            }
            else {
                // Look at the next letter in the string.  If it has a larger Roman numeral
                // equivalent than number, then the two letters are counted together as
                // a Roman numeral with value (nextNumber - number).
                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {
                    // Combine the two letters to get one value, and move on to next position in string.
                    arabic += (nextNumber - number);
                    i++;
                }
                else {
                    // Don't combine the letters.  Just add the value of the one letter onto the number.
                    arabic += number;
                }
            }
        }
        System.out.println(arabic);
    }

    private static int letterToNumber(char letter) {
        switch (letter) {
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            case 'D':  return 500;
            case 'M':  return 1000;
            default:   return -1;
        }
    }
}
