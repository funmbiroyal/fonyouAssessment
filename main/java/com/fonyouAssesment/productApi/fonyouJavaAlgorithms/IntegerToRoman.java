package com.fonyouAssesment.productApi.fonyouJavaAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class IntegerToRoman {

    public static List<String> convertToRomanList(int[] numbers) {
        List<String> romanNumerals = new ArrayList<>();

        for (int num : numbers) {
            String romanNumeral = intToRoman(num);
            romanNumerals.add(romanNumeral);
        }

        return romanNumerals;
    }

    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            return "Invalid input";
        }

        // Arrays to store the Roman numeral symbols and their corresponding values
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        // Loop through the values and append the corresponding symbols to the result
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3549, 123, 2019, 999,10};
        List<String> romanNumerals = convertToRomanList(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Roman numeral for " + numbers[i] + " is: " + romanNumerals.get(i));
        }
    }
}
