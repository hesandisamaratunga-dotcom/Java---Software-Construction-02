/*Task 6: Word Counter Program
Create a Java program that analyzes text input and counts various statistics about words and characters.
This task will help you practice string manipulation, character analysis, and data processing in Java.
Your program should analyze a sentence or paragraph entered by the user and provide detailed statistics
about the text.*/

package lab1;

import java.util.Scanner;

public class WordCounterProgram {

    public static void main(String[] args) {

        //01. Ask the user to enter a sentence or paragraph
        System.out.println("Enter sentence or paragraph to analyze: ");

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //02. Count and display:

        int vowelCount = 0;
        int consonantCount = 0;
        int totalChars = text.length();
        int charsWithoutSpaces = 0;
        int wordCount = 0;
        int sentenceCount = 0;
        String currentWord = "";   // the word being read right now
        String longestWord = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                charsWithoutSpaces++;

                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
                currentWord = currentWord + c;   // the word grows by one letter
            } else {
                if (c != ' ') {
                    charsWithoutSpaces++;        // count non-space, non-letter characters
                }
                // a space or punctuation mark ends the current word
                if (currentWord.length() > 0) {
                    wordCount++;
                    if (currentWord.length() > longestWord.length()) {
                        longestWord = currentWord;
                    }
                    currentWord = "";
                }
            }

            if (c == '.' || c == '!' || c == '?') {
                sentenceCount++;
            }
        }

        // the last word, if the text does not end with a space or punctuation
        if (currentWord.length() > 0) {
            wordCount++;
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }

        System.out.println();
        System.out.println("=== TEXT ANALYSIS REPORT ===");
        System.out.println();
        System.out.println("Original text: \"" + text + "\"");
        System.out.println();
        System.out.println("Character Statistics:");
        System.out.println("- Total characters (with spaces): " + totalChars);
        System.out.println("- Total characters (without spaces): " + charsWithoutSpaces);
        System.out.println("- Number of vowels: " + vowelCount);
        System.out.println("- Number of consonants: " + consonantCount);
        System.out.println();
        System.out.println("Word Statistics:");
        System.out.println("- Total number of words: " + wordCount);
        System.out.println("- Longest word: \"" + longestWord + "\"");
        System.out.println();
        System.out.println("Sentence Statistics:");
        System.out.println("- Total number of sentences: " + sentenceCount);

        scanner.close();

    }

    //method isVowel
    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}