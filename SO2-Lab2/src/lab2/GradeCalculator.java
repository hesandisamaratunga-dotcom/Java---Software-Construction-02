package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class GradeCalculator {

    // Constant: a grade of 60 or more counts as passed
    private static final int PASSING_GRADE = 60;

    // Adds all grades and divides by the number of grades
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Starts with the first grade and replaces it whenever a bigger one is found
    public static int findHighest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Same idea, but looks for a smaller one
    public static int findLowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Counts how many grades are at least PASSING_GRADE
    public static int countPassing(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade >= PASSING_GRADE) {
                count++;
            }
        }
        return count;
    }

    // Returns a new array in which every grade appears only once
    public static int[] deduplicatedGrades(int[] grades) {
        // Step 1: count how many different grades there are
        int uniqueCount = 0;
        for (int i = 0; i < grades.length; i++) {
            if (isFirstOccurrence(grades, i)) {
                uniqueCount++;
            }
        }

        // Step 2: create an array of exactly that size and fill it
        int[] result = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < grades.length; i++) {
            if (isFirstOccurrence(grades, i)) {
                result[index] = grades[i];
                index++;
            }
        }
        return result;
    }

    // Helper: true if grades[position] did not appear earlier in the array
    private static boolean isFirstOccurrence(int[] grades, int position) {
        for (int j = 0; j < position; j++) {
            if (grades[j] == grades[position]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];

        // Reads one grade per student into the array
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade for student " + (i + 1) + " (0-100): ");
            int grade = scanner.nextInt();

            // Asks again until the grade is between 0 and 100
            while (grade < 0 || grade > 100) {
                System.out.print("Invalid grade! Enter a value between 0 and 100: ");
                grade = scanner.nextInt();
            }
            grades[i] = grade;
        }

        // Prints all results with clear labels
        System.out.println();
        System.out.println("===== Results =====");
        System.out.println("All grades:          " + Arrays.toString(grades));
        System.out.printf("Average grade:       %.2f%n", calculateAverage(grades));
        System.out.println("Highest grade:       " + findHighest(grades));
        System.out.println("Lowest grade:        " + findLowest(grades));
        System.out.println("Passed (>= 60):      " + countPassing(grades) + " of " + grades.length);
        System.out.println("Deduplicated grades: " + Arrays.toString(deduplicatedGrades(grades)));

        scanner.close();
    }
}