public class Student {
    public String firstName;
    public String lastName;
    public int gradeLevel;

    public Student(String firstName, String lastName, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    public String ToString() {
        return "Name: " + firstName + " " + lastName + ", Grade: " + gradeLevel;
    }
}