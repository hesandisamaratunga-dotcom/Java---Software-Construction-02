package lab2;

import java.util.Scanner;

public class NameManager {

    // Prints the stored data of one person
    public static void printPerson(Person person) {
        System.out.println(person.getFirstName() + " " + person.getLastName()
                + " | name change date: " + person.getChangeDay() + "."
                + person.getChangeMonth() + "." + person.getChangeYear());
    }

    // Asks for the new data and changes the person only if the three-year limit is met
    public static void changeName(Person person, Scanner scanner) {
        System.out.print("New first name: ");
        String newFirstName = scanner.nextLine();
        System.out.print("New last name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Valid from day: ");
        int newDay = scanner.nextInt();
        System.out.print("Valid from month: ");
        int newMonth = scanner.nextInt();
        System.out.print("Valid from year: ");
        int newYear = scanner.nextInt();

        // Three-year check: the new date must be at least three years after the stored date
        int yearDifference = newYear - person.getChangeYear();
        boolean allowed;
        if (yearDifference > 3) {
            allowed = true;
        } else if (yearDifference == 3) {
            // exactly three years: the month, and if equal the day, decides
            if (newMonth > person.getChangeMonth()) {
                allowed = true;
            } else if (newMonth == person.getChangeMonth() && newDay >= person.getChangeDay()) {
                allowed = true;
            } else {
                allowed = false;
            }
        } else {
            allowed = false;
        }

        if (allowed) {
            person.setFirstName(newFirstName);
            person.setLastName(newLastName);
            person.setChangeDay(newDay);
            person.setChangeMonth(newMonth); // the setter checks that the month is 1-12
            person.setChangeYear(newYear);
            System.out.println("Name changed successfully:");
            printPerson(person);
        } else {
            System.out.println("Error: A name can only be changed every three years. Nothing was changed.");
        }
    }

    public static void main(String[] args) {

        // Outputs the Hamburg greeting for "Good day!" on the console
        System.out.println("Moin!");

        // The persons are stored in an array instead of separate variables
        Person[] persons = new Person[3];
        persons[0] = new Person("Lena", "Meyer", 15, 3, 2020);
        persons[1] = new Person("Max", "Schmidt", 1, 7, 2023);
        persons[2] = new Person("Ines", "Becker", 10, 9, 2025);

        Scanner scanner = new Scanner(System.in);

        int choice = -1; // any value except 0 works and the loop starts
        while (choice != 0) {
            System.out.print("Which person (1, 2, 3) wants to change their name? "
                    + "(4 = show all, 5 = person count, 0 = exit): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= persons.length) {
                scanner.nextLine(); // clears the rest of the line after nextInt()

                // Array index starts at 0, so person 1 is at index 0
                Person selected = persons[choice - 1];
                changeName(selected, scanner);
            } else if (choice == 4) {
                // Goes through the whole array and prints every person
                for (Person p : persons) {
                    printPerson(p);
                }
            } else if (choice == 5) {
                // Static method is called on the class name, not on an object
                System.out.println("Total number of persons: " + Person.getPersonCount());
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}