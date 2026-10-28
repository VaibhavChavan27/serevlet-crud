package com.itshaala.servlet;

import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.List;


@WebServlet("/students")
public class GetAllStudentServlet extends HttpServlet {

    private StudentController studentController = new StudentController();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> studentlist = studentController.getAllStudents();
        resp.getWriter().println(studentlist.toString());
    }
}
