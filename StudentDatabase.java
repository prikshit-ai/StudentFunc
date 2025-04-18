import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    
    private static List<Student> students = new ArrayList<>();
    
    // Method to add a student
    public static void addStudent(Student student) {
        students.add(student);
    }
    
    // Method to check if student exists
    public static boolean isStudentExists(int rollNo) {
        return students.stream().anyMatch(student -> student.getRollNo() == rollNo);
    }
    
    // Method to get student by roll number
    public static Student getStudent(int rollNo) throws StudentNotFoundException {
        return students.stream().filter(student -> student.getRollNo() == rollNo)
                       .findFirst().orElseThrow(() -> new StudentNotFoundException("Student not found."));
    }
    
    // Method to update student
    public static void updateStudent(Student student) throws StudentNotFoundException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == student.getRollNo()) {
                students.set(i, student);
                return;
            }
        }
        throw new StudentNotFoundException("Student not found.");
    }
    
    // Method to delete student
    public static void deleteStudent(int rollNo) throws StudentNotFoundException {
        students.removeIf(student -> student.getRollNo() == rollNo);
    }
    
    // Method to list all students
    public static List<Student> getAllStudents() {
        return students;
    }
}
