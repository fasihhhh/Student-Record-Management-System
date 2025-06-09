 Student Records Management System (Java)
This is a console-based Student Records Management System built using Java. It uses a singly linked list data structure to store and manage student information such as name, roll number, CGPA, and department.

 Features
 -Add Student Record: Insert a new student into the record.

 -View Records: Display all student records in a formatted list.

 -Search by Roll Number: Look up a student’s details using their roll number.

 -Delete Record: Remove a student from the record based on their roll number.

 -Duplicate Check: Prevent adding a student if the roll number already exists.

 How It Works
Student data is stored in a custom singly linked list (WholeRecordLinkedList).
-addNewStudent(String name, int rollNumber, double cgpa, String department)
Adds a new student record to the end of the linked list.

-printingList()
Prints all the student records in a formatted list, along with a total record count.

-searchingStudentByRollnoMethod(int rollNumber)
Searches for a student by roll number and displays their full details if found.

-deletingStudentByRollno(int rollNumber)
Deletes a student record from the list by roll number, if it exists.

-traversingMethod(int rollNumber)
Checks if a roll number already exists in the list (used to prevent duplicates).

Each student is represented as a Node with attributes:

studentName

rollNumber

cgpa

department

The list is traversed for search, delete, and duplicate check operations.

 Program Flow
Upon execution, the user is greeted with a menu:

-------Welcome to Student Records Management System-------
-> Press 1 to VIEW existing students Record
-> Press 2 to ADD new student in Record
-> Press 3 to SEARCH for a student in the Record
-> Press 4 to DELETE any Record
-> Press 5 to EXIT
The program includes some pre-added dummy records for demonstration and testing.

 Sample Data Preloaded
Name	Roll No	CGPA	Department
Fasih	1052	3.59	Computer Science
Abdullah	1043	1.60	Computer Science
Ali	1044	1.90	Biotechnology
Irtaza	1057	3.90	Computer Science
Basim	1019	3.29	Biomedical Engineering
Jawad	1023	2.50	Artificial Intelligence
Ehsan	1067	3.50	Computer Science
Johar	1017	3.60	Bs Nursing
Khizer	1233	3.50	Computer Science

Technologies Used
-Java (Console-based)
-OOP Concepts: Encapsulation, Classes
-Data Structures: Singly Linked List

Java Utilities: Scanner for user input

 To Improve / Next Steps
Add file-based saving/loading for persistent data.

Replace linked list with ArrayList or HashMap for efficiency.

Create a GUI version using JavaFX or Swing.

Implement sorting/filtering functionality.

