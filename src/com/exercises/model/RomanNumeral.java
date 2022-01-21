package com.exercises.model;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    //Method to convert an Integer to Roman Numeral
    public String convertIntegerToRomanNumeral(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        if (number <= 0 || number > 3000) {
            return "This number cannot be converted to roman numeral";
        }

        for (int i = 0; i <= values.length - 1; i++) {
            while (number >= values[i]) {
                number = number - values[i];
                romanNumeral.append(roman[i]);
            }
        }
        return romanNumeral.toString();
    }

    //Method to store all the roman Numerals
    public Map romanNumeralsMap() {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('M', 1000);
        romanNumerals.put('D', 500);
        romanNumerals.put('C', 100);
        romanNumerals.put('L', 50);
        romanNumerals.put('X', 10);
        romanNumerals.put('V', 5);
        romanNumerals.put('I', 1);
        return romanNumerals;
    }

    //Method to convert RomanNumeralToInteger
    public int convertRomanNumeralToInteger(String roman) {
        int number = 0;
        Map<Character, Integer> map = romanNumeralsMap();
        if (roman == null || roman.length() == 0) {
            return -1;
        }

        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 == roman.length() || map.get(roman.charAt(i)) >= map.get(roman.charAt(i + 1))) {
                number = number + map.get(roman.charAt(i));
            } else {
                number = number - map.get(roman.charAt(i));
            }

        }
        return number;
    }
}
