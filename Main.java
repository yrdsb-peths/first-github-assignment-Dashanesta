public class Main {
    public static void main(String[] args) {

        while(true) {
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

            String repeat = System.console().readLine("Would you like to continue adding students? ");

            while(true) {
                if(!repeat.equalsIgnoreCase("yes") ^ !repeat.equalsIgnoreCase("no")) break;
                repeat = System.console().readLine("Invalid input, please try again: ");
            }

            if (repeat.equalsIgnoreCase("no")) break;
        }

        System.out.println("Total Students: " + Student.totalStudents);
    }
}
