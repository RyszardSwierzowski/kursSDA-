package pl.swierzowski.servlet;

import pl.swierzowski.dao.user.UserDao;
import pl.swierzowski.dao.user.UserDaoImpl;
import pl.swierzowski.model.User;
import pl.swierzowski.model.UserType;

import javax.jws.soap.SOAPBinding;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logowanie")
public class SignIn extends HttpServlet {

    private final UserDao userDao = new UserDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName") ;
        String pass= req.getParameter("password") ;

        User user = userDao.findUser(username,pass);
        if(user==null){
            //resp.sendRedirect("/projekt/temp.jsp");

            req.setAttribute("accessDenied",true);
            RequestDispatcher rd = req.getRequestDispatcher("/projekt/index.jsp");
            rd.forward(req,resp);
        }
        else{
            User userForSession = new User(user.getId(),user.getTypUsera(),user.getEmail(),user.getLogin());
            req.getSession().setAttribute("user",userForSession);
            req.getSession().setMaxInactiveInterval(50);



                RequestDispatcher rd = req.getRequestDispatcher("/home");
                rd.forward(req,resp);



        }





    }
}
