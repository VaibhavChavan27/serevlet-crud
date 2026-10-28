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


@WebServlet("/addstudent")
public class AddStudentServlet extends HttpServlet {
        private StudentController studentController = new StudentController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setPhone(phone);

        studentController.addStudent(student);

        resp.sendRedirect("addstudent.html");
        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Student Added successfully</h2>");

    }
}
