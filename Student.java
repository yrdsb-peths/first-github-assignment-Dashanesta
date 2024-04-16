public class Student {
    public String firstName;
    public String lastName;
    public int gradeLevel;

    public Student(String first, String last, int grade) {
        firstName = first;
        lastName = last;
        gradeLevel = grade;
    }

    public String ToString() {
        return "Name: " + firstName + " " + lastName + ", Grade: " + gradeLevel;
    }
}