public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    public static int totalStudents;

    public Student(String firstName, String lastName, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        totalStudents++;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Grade: " + gradeLevel;
    }
}