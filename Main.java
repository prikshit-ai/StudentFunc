// Name: Prikshit
// PRN: 23070126094
// Batch: AIML B-1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu for student data entry system
        while(true) {
            System.out.println("\n==== Student Data Entry System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch(choice) {
                case 1:
                    AddStudent.addStudent();
                    break;
                case 2:
                    ViewStudent.viewStudent();
                    break;
                case 3:
                    UpdateStudent.updateStudent();
                    break;
                case 4:
                    DeleteStudent.deleteStudent();
                    break;
                case 5:
                    ListStudents.listStudents();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
