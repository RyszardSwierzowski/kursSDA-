package pl.swierzowski.servlet.admin;

import pl.swierzowski.model.User;
import pl.swierzowski.model.UserType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/magazyn")
public class Warehouse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user=(User)req.getSession().getAttribute("user");
        if(user==null){
            resp.sendRedirect("/projekt/index.jsp");
        }

        if(user.getTypUsera().equals(UserType.NORMAL_USER)){
            resp.sendRedirect("/projekt/magazyn.jsp");
        }else{
            resp.sendRedirect("/projekt/admin/magazyn.jsp");
        }
    }
}
