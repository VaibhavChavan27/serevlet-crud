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


@WebServlet("/getbyid")
public class GetStudentByIDServlet extends HttpServlet {
    private StudentController studentController = new StudentController();

    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Student student = studentController.getStudentById(id);

        resp.setContentType("text.html");
        resp.getWriter().println("Student by id is retrieved" +"\n"+student.toString());
    }
}
