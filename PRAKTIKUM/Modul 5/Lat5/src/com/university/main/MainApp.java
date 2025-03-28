package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        // Inisialisasi data dummy
        students[0] = new Student("S001", "Alice", 20, 3.8);
        students[1] = new Student("S002", "Bob", 22, 3.6);
        students[2] = new Student("S003", "Charlie", 21, 3.9);


        // Mencetak data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.printf("ID: %s, Nama: %s, Umur: %d, GPA: %.1f%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getAge(),
                    student.getGpa());
        }
    }
}