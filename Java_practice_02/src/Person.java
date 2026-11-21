public class Person {
    String firstName, surname;

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String toString() {
        return firstName + " " + surname;
    }
}
