import java.util.Scanner;

public class UpdateStudent {
    
    // Method to update student details
    public static void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter New Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter New Age: ");
        int age = scanner.nextInt();
        
        try {
            // Validate and update student data
            validateUpdateData(rollNo, name, age);
            StudentDatabase.updateStudent(new Student(rollNo, name, age));
            System.out.println("Student updated successfully.");
        } catch (StudentNotFoundException | EmptyFieldException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Method to validate update data
    private static void validateUpdateData(int rollNo, String name, int age) throws StudentNotFoundException, EmptyFieldException {
        if (!StudentDatabase.isStudentExists(rollNo)) {
            throw new StudentNotFoundException("Error: Student not found.");
        }
        if (name.isEmpty() || age <= 0) {
            throw new EmptyFieldException("Error: Name or Age cannot be empty or invalid.");
        }
    }
}
