package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService  {

    private StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) throws SQLException {
        studentDao.addStudent(student);
    }

    public void editStudent(Student student) throws SQLException{
        studentDao.editStudent(student);
    }

    public void deleteStudent(int id) throws SQLException{
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id) throws SQLException{
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudents() throws SQLException{
        return studentDao.getAllStudents();
    }

}
