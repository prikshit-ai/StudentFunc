import java.util.List;

public class ListStudents {
    
    // Method to list all students
    public static void listStudents() {
        List<Student> students = StudentDatabase.getAllStudents();
        
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("==== List of Students ====");
            for (Student student : students) {
                System.out.println("Roll Number: " + student.getRollNo());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("==========================");
            }
        }
    }
}
