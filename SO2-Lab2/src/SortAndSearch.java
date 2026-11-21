package lab2;

import java.util.Random;
import java.util.Scanner;

public class SortAndSearch {

    // Counters for the number of comparisons of the last search
    private static int linearComparisons = 0;
    private static int binaryComparisons = 0;

    // Prints all elements of the array in one line
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Sorts the array in ascending order using bubble sort
    public static void bubbleSort(int[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            // After each pass the largest remaining number is at the end,
            // so the inner loop can stop one position earlier each time
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap the two neighbours
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Checks every element from the start; returns the index or -1 if not found
    public static int linearSearch(int[] arr, int target) {
        linearComparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            linearComparisons++;
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Halves the search area each step; array must be sorted; returns index or -1
    public static int binarySearch(int[] arr, int target) {
        binaryComparisons = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            binaryComparisons++;

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                left = middle + 1;   // target can only be in the right half
            } else {
                right = middle - 1;  // target can only be in the left half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Fills the array with random numbers from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // nextInt(100) gives 0-99, +1 gives 1-100
        }

        System.out.print("Random array: ");
        printArray(numbers);

        bubbleSort(numbers);
        System.out.print("Sorted array: ");
        printArray(numbers);

        // Lets the user search for values until 0 is entered
        int target = -1;
        while (target != 0) {
            System.out.println();
            System.out.print("Enter a number to search for (0 = exit): ");
            target = scanner.nextInt();

            if (target != 0) {
                int linearIndex = linearSearch(numbers, target);
                int binaryIndex = binarySearch(numbers, target);

                if (linearIndex == -1) {
                    System.out.println(target + " was not found in the array.");
                } else {
                    System.out.println(target + " was found at index " + linearIndex + ".");
                }

                System.out.println("Linear search: " + linearComparisons + " comparisons");
                System.out.println("Binary search: " + binaryComparisons + " comparisons");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}