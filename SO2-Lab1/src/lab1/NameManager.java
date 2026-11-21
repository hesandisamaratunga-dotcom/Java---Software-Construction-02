package lab1;

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
            person.setChangeMonth(newMonth);
            person.setChangeYear(newYear);
            System.out.println("Name changed successfully:");
            printPerson(person);
        } else {
            System.out.println("Error: A name can only be changed every three years. Nothing was changed.");
        }
    }

    public static void main(String[] args) {

        //testing the class Person
        Person person1 = new Person("Hezz", "Samarathunga", 15, 3, 2020);

        System.out.println(person1.getFirstName() + " " + person1.getLastName());
        System.out.println(person1.getChangeDay() + " " + person1.getChangeMonth() + " " + person1.getChangeYear());

        person1.setFirstName("Buzz");

        System.out.println(person1.getFirstName() + " " + person1.getLastName());
        System.out.println(person1.getChangeDay() + " " + person1.getChangeMonth() + " " + person1.getChangeYear());

        //02. outputs the Hamburg greeting for "Good day!" on the console.
        System.out.println("Moin!");

        //03. creates three objects of the Person class, named: person_1, person_2, and person_3.
        Person person_1 = new Person("Lena", "Meyer", 15, 3, 2020);
        Person person_2 = new Person("Max", "Schmidt", 1, 7, 2023);
        Person person_3 = new Person("Ines", "Becker", 10, 9, 2025);

        //04. Then your program asks which person (1,2 or 3) wants to change their name.
        Scanner scanner = new Scanner(System.in);

        int choice = -1; //any value except 0 works and loop starts
        while (choice != 0) {
            System.out.print("Which person (1, 2, 3) wants to change their name? (4 = show all, 0 = exit): ");
            choice = scanner.nextInt();
            System.out.println("You entered \"" + choice + "\""); // test line

            if (choice >= 1 && choice <= 3) {
                scanner.nextLine(); // clears the rest of the line after nextInt()

                // selected holds a reference to the same object as person_1, person_2 or person_3
                Person selected;
                if (choice == 1) {
                    selected = person_1;
                } else if (choice == 2) {
                    selected = person_2;
                } else {
                    selected = person_3;
                }
                changeName(selected, scanner);
            } else if (choice == 4) {
                printPerson(person_1);
                printPerson(person_2);
                printPerson(person_3);
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}