package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.EqvalsString;

/**
 * Created by Жека on 11.06.2014.
 */
public class Second extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // String a = req.getParameter("firstName");
       // String b = req.getParameter("firstName");
       // EqvalsString summa = new EqvalsString(a, b);

      //  req.setAttribute("name", summa);



        req.setAttribute("name", req.getParameter("firstName"));
        req.getRequestDispatcher("success2.jsp").forward(req, resp);
    }
}
