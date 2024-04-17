public class Main {
    public static void main(String[] args) {

    String repeat = "yes";

        while(repeat.equalsIgnoreCase("yes")) {
            
            NewStudent();

            repeat = System.console().readLine("Would you like to continue adding students? ");
            while(!(repeat.equalsIgnoreCase("yes") || repeat.equalsIgnoreCase("no"))) {
                repeat = System.console().readLine("Invalid input, please try again: ");
            }
        }

        System.out.println("Total Students: " + Student.totalStudents);
    }

    public static void NewStudent() {
        String firstName = System.console().readLine("Enter a student's first name: ");
        String lastName = System.console().readLine("Enter the student's last name: ");
        int gradeLevel;
        
        while(true) {
            try {
                gradeLevel = Integer.valueOf(System.console().readLine("Enter the student's grade level: "));
                break;
            } catch(Exception e) {
                System.out.print("Invalid grade level. ");
            }
        }

        Student student = new Student(firstName, lastName, gradeLevel);
        System.out.println(student.toString());
    }
}
