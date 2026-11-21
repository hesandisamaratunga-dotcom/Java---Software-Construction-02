package lab1;

/*01.create a class called Person that contains the following attributes: first_name, last_name,
name_change_date (separated by day, month, and year).*/

public class Person {

    //Five fields
    private String firstName;
    private String lastName;
    private int changeDay;
    private int changeMonth;
    private int changeYear;

    //The constructor
    public Person(String firstName, String lastName, int changeDay, int changeMonth, int changeYear) {
        this.firstName = firstName;   //this.firstName is teh field, firstName is teh parameter
        this.lastName = lastName;
        this.changeDay = changeDay;
        this.changeMonth = changeMonth;
        this.changeYear = changeYear;
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

    public void setChangeMonth(int changeMonth) {
        this.changeMonth = changeMonth;
    }

    //getter and setter for ChangeYear
    public int getChangeYear() {
        return changeYear;
    }

    public void setChangeYear(int changeYear) {
        this.changeYear = changeYear;
    }
}
