/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab211studentmanager;

import java.util.Scanner;

/**
 *
 * @author dotha
 */
     public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create\n2. Find and Sort\n3. Update/Delete\n4. Report\n5. Exit");
            System.out.print("Please choose an option (1-5): ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    manager.createStudent();
                    break;
                case 2:
                    manager.findAndSortStudents();
                    break;
                case 3:
                    manager.updateOrDeleteStudent();
                    break;
                case 4:
                    manager.generateReport();
                    break;
                case 5:
                    continueProgram = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

