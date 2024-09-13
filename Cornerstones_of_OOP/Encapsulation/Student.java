package Cornerstones_of_OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int ID;
    private List<Integer> grades;  // Use ArrayList for dynamic size

    // Constructor to initialize name, ID, and an empty list for grades
    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.grades = new ArrayList<>();  // Initialize with an empty list
    }

    // Method to add a grade to the student's grade list
    public void addGrade(int score) {
        if (score >= 0 && score <= 100) {
            this.grades.add(score);
            System.out.println("Score added");
        } else {
            System.out.println("Invalid grade. Please enter a value between 0 and 100.");
        }
    }

    // Method to calculate the average grade
    public double avgGrade() {
        if (this.grades.isEmpty()) {
            System.out.println("No grades available.");
            return 0;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / (double) this.grades.size();  // Return average as a double
    }

    // Getter methods for name and ID
    public String getStudentName() {
        return this.name;
    }

    public int getStudentID() {
        return this.ID;
    }

    // Optional: Method to display all grades
    public void displayGrades() {
        System.out.println("Grades for " + this.name + ": " + this.grades);
    }
}
