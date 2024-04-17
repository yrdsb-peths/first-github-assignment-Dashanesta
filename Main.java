public class Main {
    public static void main(String[] args) {

        String firstName = System.console().readLine("Enter a student's first name: ");
        String lastName = System.console().readLine("Enter a student's last name: ");
        int gradeLevel = Integer.valueOf(System.console().readLine("Enter a student's grade level: "));
        Student student = new Student(firstName, lastName, gradeLevel);
        System.out.println(student.ToString());
    }
}
