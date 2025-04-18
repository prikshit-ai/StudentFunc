# Student Data Entry System

This Java-based Student Data Entry System allows you to manage student information with functionalities like adding, viewing, updating, deleting, and listing students. The system is modular and uses custom exceptions to handle various error scenarios effectively.

## Features

1. **Add Student**: Add a new student by entering their Roll Number, Name, and Age.
2. **View Student**: View details of a student by entering their Roll Number.
3. **Update Student**: Update the information of an existing student.
4. **Delete Student**: Delete a student record by Roll Number.
5. **List Students**: Display all student records.

## Custom Exceptions Used

- **DuplicateEntryException**: Thrown when an attempt is made to add a student with an already existing Roll Number.
- **EmptyFieldException**: Thrown when any of the required fields (Name, Age) are empty or invalid.
- **StudentNotFoundException**: Thrown when the student with the specified Roll Number is not found.
- **InvalidRollNumberException**: Thrown when an invalid Roll Number is provided.

## Project Structure

- **Main.java**: Main menu-driven application to interact with the student data entry system.
- **AddStudent.java**: Contains the functionality to add a student.
- **ViewStudent.java**: Contains the functionality to view a student's details.
- **UpdateStudent.java**: Contains the functionality to update student details.
- **DeleteStudent.java**: Contains the functionality to delete a student.
- **ListStudents.java**: Contains the functionality to list all students.
- **Student.java**: A class representing a student entity with Roll Number, Name, and Age.
- **StudentDatabase.java**: A class simulating a database (in-memory list) to store student information.
- **CustomExceptions.java**: Contains all custom exceptions used throughout the system.

## How to Use

1. **Run the `Main.java` file** to start the student data entry system.
2. **Follow the menu options** to perform various operations like adding, viewing, updating, or deleting student records.
3. The program will validate your input and handle errors like duplicate entries or invalid data using custom exceptions.


## Running the Application

1. Download or clone this repository.
2. Compile and run the `Main.java` file in your Java environment or IDE.
3. Follow the on-screen prompts to interact with the system.

## Author Information

- **Name**: Prikshit
- **PRN**: 23070126094
- **Batch**: AIML B-1

## Exception Handling

- **DuplicateEntryException**: Prevents the addition of a student with an existing Roll Number.
- **EmptyFieldException**: Prevents invalid or empty student details (Name, Age).
- **StudentNotFoundException**: Prevents operations on non-existing students.
- **InvalidRollNumberException**: Ensures that the Roll Number provided is valid.


