import java.util.Scanner;

public class DeleteStudent {
    
    // Method to delete a student
    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number to delete: ");
        int rollNo = scanner.nextInt();
        
        try {
            // Validate and delete student
            if (!StudentDatabase.isStudentExists(rollNo)) {
                throw new StudentNotFoundException("Error: Student not found.");
            }
            StudentDatabase.deleteStudent(rollNo);
            System.out.println("Student deleted successfully.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
