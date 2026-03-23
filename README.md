# Student Management System (Java File Handling)

## Overview

This is a simple **Student Management System** developed using **Java** that performs basic **CRUD operations** using **file handling**.

The application allows users to:

* Add a student
* View students
* Update student details
* Delete a student

All data is stored in a **text file (`students.txt`)**.

---

## Features

* Add new student records
* View all students
* Update student information
* Delete student records
* Persistent storage using file handling

---

## Technologies Used

* Java
* File Handling (BufferedReader, FileWriter)
* Object Oriented Programming

---

## Project Structure

```
StudentManagementSystem
│
├── Main.java
├── Student.java
├── CreateStudent.java
├── ReadStudent.java
├── updateStudent.java
├── deleteStudent.java
└── students.txt
```

---

## How It Works

### Add Student

Stores student data in the format:

```
id,name,age
```

Example:

```
1,Mano,22
2,Arun,21
```

### View Students

Reads the `students.txt` file and displays all student records.

### Update Student

Finds the student by **ID** and replaces the record with updated values.

### Delete Student

Removes the student record based on the provided **ID**.

---

## How to Run

1. Clone the repository

```
git clone https://github.com/Mano6383/student-management-system.git
```

2. Open the project in **IntelliJ IDEA / Eclipse / VS Code**

3. Compile and run:

```
javac Main.java
java Main
```

---

## Sample Menu

```
1 -> Add Student
2 -> View Students
3 -> Update Student
4 -> Delete Student
5 -> Exit
```

---

## Author

Mano T

---

## Future Improvements

* Add validation for duplicate student IDs
* Improve user interface
* Store data using a database (MySQL)
* Convert to GUI application
