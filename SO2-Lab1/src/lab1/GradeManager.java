/*lAB TASK 4: Grade Manager:

Create a Java program that calculates and manages student grades. This task will help you practice
working with arrays, loops, mathematical operations, and basic data processing in Java.
Your program should implement a simple grade management system that:
• Stores grades for multiple students
• Calculates statistics like average, highest, and lowest grades
• Determines letter grades based on numerical scores
• Provides a summary report*/

package lab1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {

        //Scanner and the number of students
        Scanner scanner = new Scanner(System.in);

        //01.Ask the user how many students they want to enter grades for
        System.out.print("How many students? ");
        int numberOfStudents = scanner.nextInt();

        //Create the array to store grades for the numberOfStudents
        double[] grades = new double[numberOfStudents];

        //03. Prompt the user to enter each student’s grade (0-100)
        System.out.println("Enter the grade of student (0-100)");

        //Read the grades (student 1 is stored at index 0)
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the grade of student " + (i + 1) + ":");
            grades[i] = scanner.nextDouble();
        }

        System.out.println();   // A line break
        System.out.println("=== Grade Report ====");

        //loop to find the grade and store teh letter in a string :)
        for (int i = 0; i < numberOfStudents; i++) {
            String letter;
            if (grades[i] >= 90) {
                letter = "A";
            } else if (grades[i] >= 80) {
                letter = "B";
            } else if (grades[i] >= 70) {
                letter = "C";
            } else if (grades[i] >= 60) {
                letter = "D";
            } else {
                letter = "F";
            }
            System.out.println("Student " + (i + 1) + ": " + grades[i] + "  (" + letter + ")");
        }

        System.out.println(); //line breaker
        System.out.println("=== Statistics ===");

        //declaring variables for statistics
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            sum += grades[i];
            if (grades[i] > highest) {    //finding the highest
                highest = grades[i];
            }
            if (grades[i] < lowest) {     //finding teh lowest
                lowest = grades[i];
            }
            if (grades[i] >= 60) {        //number of passed students
                passed++;
            } else {
                failed++;                 //number of failed students
            }
        }
        double average = sum / numberOfStudents;

        System.out.println("Average Grade: "+ average );
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Students Passed: " + passed);
        System.out.println("Students Failed: " + failed);

        scanner.close();
    }
}
