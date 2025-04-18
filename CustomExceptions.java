// Custom exception for invalid roll number
public class InvalidRollNumberException extends Exception {
    public InvalidRollNumberException(String message) {
        super(message);
    }
}

// Custom exception for duplicate entry
public class DuplicateEntryException extends Exception {
    public DuplicateEntryException(String message) {
        super(message);
    }
}

// Custom exception for student not found
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

// Custom exception for empty fields
public class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}
