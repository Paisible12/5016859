package com.example.test;

import com.example.controller.StudentController;
import com.example.model.Student;
import com.example.view.StudentView;

public class MVCPatternTest {
    public static void main(String[] args) {
     
        Student student = new Student("John Doe", "1", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
