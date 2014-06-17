package controller;


        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
/**
 * Created by Жека on 12.06.2014.
 */
public class Action extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("name", req.getParameter("firstName"));
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
