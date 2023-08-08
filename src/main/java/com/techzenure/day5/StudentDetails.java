package com.techzenure.day5;

import java.util.Scanner;

class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    
    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }
}

public class StudentDetails  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student's Id: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student's Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student's Address: ");
        String studentAddress = sc.nextLine();

        System.out.print("Whether the student is from NIT (Yes/No): ");
        String nitInput = sc.nextLine().toLowerCase();

        Student student;

        if (nitInput.equals("yes")) {
            student = new Student(studentId, studentName, studentAddress);
        } else if (nitInput.equals("no")) {
            System.out.print("Enter the college name: ");
            String collegeName = sc.nextLine();
            student = new Student(studentId, studentName, studentAddress, collegeName);
        } else {
            System.out.println("Wrong Input! Please enter either 'Yes' or 'No'.");
            return;
        }

        System.out.println("\nStudent id: " + student.getStudentId());
        System.out.println("Student name: " + student.getStudentName());
        System.out.println("Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
        sc.close();
    }
}
