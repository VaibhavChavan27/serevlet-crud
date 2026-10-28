package com.itshaala.servlet;

import com.itshaala.controller.StudentController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;

import java.io.IOException;

@WebServlet("/deletestudent")
public class DeleteStudentServlet extends HttpServlet {

    private StudentController studentController = new StudentController();

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       int id = Integer.parseInt(req.getParameter("id"));
        studentController.deleteStudent(id);

        resp.setContentType("text/html");
        resp.getWriter().println("deleted successfully");
    }
}
