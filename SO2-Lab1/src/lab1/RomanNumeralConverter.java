/*Task 3: Roman Numeral Converter
Create a Java program that converts Roman numerals to integers. This task will help you practice working
with strings, character processing, and conditional logic.
Roman numerals use seven different symbols with specific values:
• I = 1
• V = 5
• X = 10
• L = 50
• C = 100
• D = 500
• M = 1000*/

package lab1;

import java.util.Scanner;

public class RomanNumeralConverter {

    // Returns the value of one Roman symbol, or 0 for any other character
    public static int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }

    public static void main(String[] args) {

        //01. Asks the user to enter a Roman numeral as a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman numeral as a string:");
        String roman = scanner.nextLine();

        //02. Converts it to an integer
        int total = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentValue = getValue(roman.charAt(i));

            if (i < roman.length() - 1) {
                // there is a next letter, so compare with it
                int nextValue = getValue(roman.charAt(i + 1));
                if (currentValue < nextValue) {
                    total = total - currentValue;   // e.g. the I in IV
                } else {
                    total = total + currentValue;
                }
            } else {
                // last letter: nothing to compare with, always add
                total = total + currentValue;
            }
        }


        System.out.println();

        // 4. Print the result once, after the loop
        System.out.println("Result: " + total);

        scanner.close();
    }
}

/*First approach:


        char firstChar = roman.charAt(0);
        int length = roman.length(); //length of the string


 int integer = 0;

if (roman == "I") {
                integer = 1;
            } else if (roman == "V") {
                integer = 5;
            } else if (roman == "X") {
                integer = 10;
            } else if (roman == "L") {
                integer = 50;
            } else if (roman == "C") {
                integer = 100;
            } else if (roman == "D") {
                integer = 500;
            } else if (roman == "M") {
                integer = 1000;
            }
 */