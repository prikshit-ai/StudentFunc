import java.util.Scanner;

public class ViewStudent {
    
    // Method to view student data by roll number
    public static void viewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        
        try {
            // Validate the roll number and view student
            Student student = StudentDatabase.getStudent(rollNo);
            System.out.println("Student Details: ");
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
        } catch (StudentNotFoundException | InvalidRollNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
