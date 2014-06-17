package controller;

import model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class StudentController extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // тут мы получаем параметры
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        Student student = new Student (id, name, address);

        request.setAttribute("student", student);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
