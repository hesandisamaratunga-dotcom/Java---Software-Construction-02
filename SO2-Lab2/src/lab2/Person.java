package lab2;

/*01.create a class called Person that contains the following attributes: first_name, last_name,
name_change_date (separated by day, month, and year).*/

public class Person {

    //• Make all instance variables in the Person class private
    //Five fields
    private String firstName;
    private String lastName;
    private int changeDay;
    private int changeMonth;
    private int changeYear;

    // Class variable: shared by all Person objects, counts how many were created
    private static int personCount = 0;

    //The constructor
    public Person(String firstName, String lastName, int changeDay, int changeMonth, int changeYear) {
        this.firstName = firstName;   //this.firstName is teh field, firstName is teh parameter
        this.lastName = lastName;
        this.changeDay = changeDay;
        this.changeMonth = changeMonth;
        this.changeYear = changeYear;
        personCount++; // every new Person increases the counter by 1
    }

    //getter and setter for FirstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter and setter for LastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter and setter for ChnageDay
    public int getChangeDay() {
        return changeDay;
    }

    public void setChangeDay(int changeDay) {
        this.changeDay = changeDay;
    }

    //getter and setter for ChangeMonth
    public int getChangeMonth() {
        return changeMonth;
    }

    /*
    public void setChangeMonth(int changeMonth) {
        this.changeMonth = changeMonth;
    } */

    //requirement 03
    //• Add validation in the setter for month (must be between 1-12)
    public void setChangeMonth(int changeMonth) {
        if (changeMonth >= 1 && changeMonth <= 12) {
            this.changeMonth = changeMonth;
        } else {
            System.out.println("Invalid month! Must be between 1-12.");
        }
    }

    //getter and setter for ChangeYear
    public int getChangeYear() {
        return changeYear;
    }

    public void setChangeYear(int changeYear) {
        this.changeYear = changeYear;
    }

    // Class method: returns the total number of Person objects
    public static int getPersonCount() {
        return personCount;
    }
}
