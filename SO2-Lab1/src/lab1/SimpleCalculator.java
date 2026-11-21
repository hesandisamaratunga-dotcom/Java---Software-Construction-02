/*Task 5: Simple Calculator with Methods
Create a Java program that implements a basic calculator using methods. This task will help you practice
method creation, parameter passing, return values, and program organization in Java.
Your calculator should be able to perform basic arithmetic operations (addition, subtraction,
multiplication, division) and be organized using separate methods for each operation.*/

package lab1;

import java.util.Scanner;

public class SimpleCalculator {

    // One method per operation: two parameters in, one result out
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!"); //special case:)
            return 0;
        }
        return a / b;
    }

    //main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0; // any value except 5, so the loop starts

        // The menu is inside the loop, so it appears again after each calculation
        while (choice != 5) {
            //01.Display a menu of available operations to the user
            System.out.println("=== Simple Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Substraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            //02. Ask the user to select an operation
            System.out.print("Choose an operation (1-5): ");
            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using the calculator!"); //exit :(
            } else if (choice >= 1 && choice <= 4) {
                // Numbers are only asked for when a calculation is chosen other than exit
                System.out.print("Enter first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = scanner.nextDouble();

                //assign and declaring variables
                double result = 0;
                String sign = "";


                if (choice == 1) {
                    result = add(firstNumber, secondNumber);
                    sign = "+";
                } else if (choice == 2) {
                    result = subtract(firstNumber, secondNumber);
                    sign = "-";
                } else if (choice == 3) {
                    result = multiply(firstNumber, secondNumber);
                    sign = "*";
                } else {
                    result = divide(firstNumber, secondNumber);
                    sign = "/";
                }
                System.out.println("Result: " + firstNumber + " " + sign + " " + secondNumber + " = " + result);
                System.out.println();
            } else {
                System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                System.out.println();
            }
        }

        scanner.close();
    }
}

            /*
            //initial try to get done without methods:(

            //02. Ask the user to select an operation
            System.out.println("Choose an operation (1-5):");
            Scanner scanner0 = new Scanner(System.in);
            int operand = scanner.nextInt();
            // System.out.println(operand);  //test

            System.out.println("Enter first number: ");
            Scanner scanner1 = new Scanner(System.in);
            double firstNumber = scanner.nextInt();
            //System.out.println(firstNumber);  //test

            System.out.println("Enter second number: ");
            Scanner scanner2 = new Scanner(System.in);
            double secondNumber = scanner.nextInt();
            //System.out.println(secondNumber);  //test

            double result = 0;
            String sign;

            while ((1 <= operand) && (operand <= 5)) {
                if (operand == 1) {
                    result = firstNumber + secondNumber;
                    sign = "+";
                } else if (operand == 2) {
                    result = firstNumber - secondNumber;
                    sign = "-";
                } else if (operand == 3) {
                    result = firstNumber * secondNumber;
                    sign = "*";
                } else if (operand == 4) {
                    result = firstNumber / secondNumber;
                    sign = "/";
                }
                System.out.println("Result: " + firstNumber + " " + sign + " " + secondNumber);
            }

             */


