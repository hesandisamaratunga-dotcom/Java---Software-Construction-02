/*Task 2: Number Guessing Game
Create a Java program that implements a number guessing game where the computer generates a
random number and the player tries to guess it. This task will help you practice loops, conditionals,
random number generation, and user input handling in Java.
The program should work as follows:
• Generate a random number between 1 and 100 (inclusive)
• Display a welcome message explaining the game rules
• Repeatedly ask the user to guess the number
• For each guess, provide feedback:
‣ “Too small!” if the guess is lower than the target number
‣ “Too big!” if the guess is higher than the target number
‣ “You guessed it!” if the guess is correct
• Keep track of the number of attempts
• When the correct number is guessed, display a congratulatory message and the number of attempts it
took
• The program ends when the correct number is guessed*/

package lab1;

import java.util.Random; //import for random number generation
import java.util.Scanner; //import for Simple user input with Scanner

public class NumberGuessingGame {
    public static void main(String[] args){

        //01.Use the Random class for generating random numbers
        //Generate a random number between 1 and 100 (inclusive)
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // generates 1-100
        System.out.println(randomNumber); //test print

        // Display a welcome message explaining the game rules
        System.out.println("Helloww:) Welcome to the Number Guessing Game");
        System.out.println("Guess a number in between 1 and 100 (including)!!");
        System.out.println("We'll see how many tries it takes you to guess the correct number");
        System.out.println("Use the hints from your wrong guesses as a helper :) ");
        System.out.println("GOOD LUCK!");

        // 02.Use Scanner class for user input
        Scanner scanner = new Scanner(System.in);

        //Basic loop structure:
        boolean gameRunning = true;
        int attempts = 0;

        // 03.Use a loop structure to keep asking for guesses until correct
        while (gameRunning) {

            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;  //Keep track of the number of attempts

            // 04.Display clear and user-friendly messages
            // Repeatedly ask the user to guess the number
            // Assume the user will always enter valid integers
            if(userGuess<randomNumber) {
                System.out.println("Too small!");
            }else if(userGuess>randomNumber) {
                System.out.println("Too big!");
            }else if (userGuess == randomNumber) {
                gameRunning = false; //The program ends when the correct number is guessed
            }
        }

        //When the correct number is guessed, display a congratulatory message and the number of attempts it took
        System.out.println("You guessed it!");
        System.out.println("Congratulations!! Number of attempts : " + attempts);
    }
}