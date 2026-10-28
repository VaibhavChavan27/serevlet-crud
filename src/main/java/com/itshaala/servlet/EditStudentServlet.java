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


@WebServlet("/editstudent")
public class EditStudentServlet extends HttpServlet {
    private StudentController studentController = new StudentController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setEmail(email);
        student.setPhone(phone);

        studentController.editStudent(student);

        resp.sendRedirect("editStudent.html");
        resp.setContentType("text/html");
        resp.getWriter().println("Student edited successfully");
    }
}
