package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void addStudent(Student student) throws SQLException {
        studentService.addStudent(student);
    }

    public void editStudent(Student student) throws SQLException{
        studentService.editStudent(student);
    }

    public void deleteStudent(int id) throws SQLException{
        studentService.deleteStudent(id);
    }

    public Student getStudentById(int id) throws SQLException{
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudents() throws SQLException{
        return studentService.getAllStudents();
    }
}
