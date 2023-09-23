/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211studentmanager;

/**
 *
 * @author dotha
 */
class Student {
 private static int idCounter = 1;

    private final int id;
    String studentName;
    private final int semester;
    private final String courseName;

    public Student(String studentName, int semester, String courseName) {
        this.id = idCounter++;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + studentName + ", Semester: " + semester + ", Course: " + courseName;
    }
}
