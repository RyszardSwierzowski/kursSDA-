package pl.swierzowski;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("key_name");
       if(name.length()>3){
           RequestDispatcher rd = req.getRequestDispatcher("/validName.jsp");
           rd.forward(req,resp);
       }
       else {
           RequestDispatcher rd = req.getRequestDispatcher("/wrongName.jsp");
           rd.forward(req,resp);
       }


    }
}
