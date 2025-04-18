import java.util.Scanner;

public class AddStudent {
    
    // Method to add student to the system
    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        try {
            // Validate the student data
            validateStudentData(rollNo, name, age);
            // Add student to database (simulated)
            StudentDatabase.addStudent(new Student(rollNo, name, age));
            System.out.println("Student added successfully.");
        } catch (DuplicateEntryException | EmptyFieldException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Method to validate student data
    private static void validateStudentData(int rollNo, String name, int age) throws DuplicateEntryException, EmptyFieldException {
        if (StudentDatabase.isStudentExists(rollNo)) {
            throw new DuplicateEntryException("Error: Student with this Roll Number already exists.");
        }
        if (name.isEmpty() || age <= 0) {
            throw new EmptyFieldException("Error: Name or Age cannot be empty or invalid.");
        }
    }
}
