package lab2;

public class Student implements Comparable<Student> {

    private int studentID;
    private String name;
    private double grade;

    public Student(int studentID, String name, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // Two students are equal if they have the same student ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;                  // same object in memory
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;                 // null or not a Student
        }
        Student other = (Student) obj;
        return studentID == other.studentID;
    }

    // Equal objects must have equal hash codes, so it uses the same field as equals()
    @Override
    public int hashCode() {
        return Integer.hashCode(studentID);
    }

    // Natural ordering: by grade, ascending
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

    // Readable output, e.g. "Student[ID=101, name=Lena, grade=1.7]"
    @Override
    public String toString() {
        return "Student[ID=" + studentID + ", name=" + name + ", grade=" + grade + "]";
    }
}