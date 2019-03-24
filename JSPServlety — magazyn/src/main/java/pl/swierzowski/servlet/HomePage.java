package pl.swierzowski.servlet;

import pl.swierzowski.model.User;
import pl.swierzowski.model.UserType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class HomePage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user")!=null){
            User user = (User)req.getSession().getAttribute("user");
            if(user.getTypUsera().equals(UserType.ADMIN)){
                resp.sendRedirect("projekt/admin/home.jsp");
            }
            else if(user.getTypUsera().equals(UserType.NORMAL_USER)){
                resp.sendRedirect("projekt/home.jsp");
            }
        }else{
            resp.sendRedirect("projekt/index.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user")==null){
            resp.sendRedirect("projekt/index.jsp");
        }else{
            resp.sendRedirect("projekt/home.jsp");
        }

    }
}
