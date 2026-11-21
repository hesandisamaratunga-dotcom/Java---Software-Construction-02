package lab2;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {

    // Custom comparator: sorts students alphabetically by name
    public static final Comparator<Student> BY_NAME =
            (a, b) -> a.getName().compareTo(b.getName());

    // Custom comparator: sorts students by ID
    public static final Comparator<Student> BY_ID =
            (a, b) -> Integer.compare(a.getStudentID(), b.getStudentID());

    // Prints every student of the array on its own line
    public static void printStudents(Student[] students) {
        for (Student s : students) {
            System.out.println("  " + s);
        }
    }

    // Prints every pair of students that are equal (same ID)
    public static void findDuplicates(Student[] students) {
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].equals(students[j])) {
                    System.out.println("  Duplicate: " + students[i] + " and " + students[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("  No duplicates found.");
        }
    }

    // Returns the first student with this ID, or null if none exists
    public static Student searchByID(Student[] students, int id) {
        for (Student s : students) {
            if (s.getStudentID() == id) {
                return s;
            }
        }
        return null;
    }

    // Returns the first student with this name (ignores upper/lower case), or null
    public static Student searchByName(Student[] students, String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // 1. Array of students with sample data (ID 101 appears twice on purpose)
        Student[] students = {
                new Student(103, "Max", 2.3),
                new Student(101, "Lena", 1.7),
                new Student(105, "Ines", 3.0),
                new Student(102, "Tom", 1.3),
                new Student(101, "Lena", 1.7),
                new Student(104, "Anna", 2.0)
        };

        System.out.println("=== All students ===");
        printStudents(students);

        // 2. Equality: == compares references, equals() compares the student ID
        Student a = students[1];
        Student b = students[4];   // same data as a, but a different object
        Student c = students[0];

        System.out.println();
        System.out.println("=== Equality ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a == b:      " + (a == b));        // false: two objects
        System.out.println("a.equals(b): " + a.equals(b));     // true: same ID
        System.out.println("a.equals(c): " + a.equals(c));     // false: different ID
        System.out.println("a.hashCode() == b.hashCode(): " + (a.hashCode() == b.hashCode()));

        // 3. Sort by grade: natural ordering from compareTo()
        Student[] byGrade = Arrays.copyOf(students, students.length);
        Arrays.sort(byGrade);
        System.out.println();
        System.out.println("=== Sorted by grade (natural ordering) ===");
        printStudents(byGrade);

        // 4. Sort by name: custom comparator
        Student[] byName = Arrays.copyOf(students, students.length);
        Arrays.sort(byName, BY_NAME);
        System.out.println();
        System.out.println("=== Sorted by name (comparator) ===");
        printStudents(byName);

        // Extra: sort by ID with the second comparator
        Student[] byID = Arrays.copyOf(students, students.length);
        Arrays.sort(byID, BY_ID);
        System.out.println();
        System.out.println("=== Sorted by ID (comparator) ===");
        printStudents(byID);

        // 5. Find duplicates
        System.out.println();
        System.out.println("=== Duplicates ===");
        findDuplicates(students);

        // 6. Search by ID and by name (found and not found)
        System.out.println();
        System.out.println("=== Search ===");
        System.out.println("Search ID 102:     " + searchByID(students, 102));
        System.out.println("Search ID 999:     " + searchByID(students, 999));
        System.out.println("Search name 'ines': " + searchByName(students, "ines"));
        System.out.println("Search name 'Paul': " + searchByName(students, "Paul"));
    }
}