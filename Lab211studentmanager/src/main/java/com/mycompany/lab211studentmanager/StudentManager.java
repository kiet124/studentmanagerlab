/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211studentmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author dotha
 */
class StudentManager {
     private final ArrayList<Student> students = new ArrayList<>();

    public void createStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Semester: ");
        int semester = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter Course Name (Java, .Net, C/C++): ");
        String course = input.nextLine();

        Student student = new Student(name, semester, course);
        students.add(student);

        System.out.println("Student added successfully! Student ID: " + student.getId());
    }

    public void findAndSortStudents() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name or a part of Student Name: ");
        String searchName = input.nextLine();

        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().contains(searchName)) {
                result.add(student);
            }
        }

        if (result.isEmpty()) {
            System.out.println("No matching students found.");
            return;
        }

        Collections.sort(result, Comparator.comparing(Student::getStudentName));

        System.out.println("Sorted Students by Name:");
        for (Student student : result) {
            System.out.println(student);
        }
    }

    public void updateOrDeleteStudent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID to update or delete: ");
        int id = input.nextInt();
        input.nextLine(); 

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                found = true;
                System.out.print("Do you want to update (U) or delete (D) this student? ");
                String choice = input.nextLine();
                if (choice.equalsIgnoreCase("U")) {
                    System.out.print("Enter new Student Name: ");
                    String newName = input.nextLine();
                    student.studentName = newName;
                    System.out.println("Student updated successfully!");
                } else if (choice.equalsIgnoreCase("D")) {
                    students.remove(student);
                    System.out.println("Student deleted successfully!");
                } else {
                    System.out.println("Invalid choice. No changes made.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

   public void generateReport() {
    System.out.println("Student Report:");
    for (Student student : students) {
        int totalCourses = 0;
        for (Student s : students) {
            if (s.getStudentName().equals(student.getStudentName())) {
                totalCourses++;
            }
        }
        System.out.println(student.getStudentName() + " | " + student.getCourseName() + " | " + totalCourses);
    }
}

}

