package pl.swierzowski.servlet;


import pl.swierzowski.dao.user.UserDao;
import pl.swierzowski.dao.user.UserDaoImpl;
import pl.swierzowski.model.User;
import pl.swierzowski.model.UserType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/rejestracja")
public class SignUp extends HttpServlet {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/projekt/signUp.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newLogin = req.getParameter("userName");
        String newPass = req.getParameter("password");
        String repeatPass = req.getParameter("repeatPassword");
        String newEmail = req.getParameter("email");
        String repeatEmail = req.getParameter("repeatEmail");

        User user = new User();

        if (newPass.equals(repeatPass) && newEmail.equals(repeatEmail)) {
            user.setLogin(newLogin);
            user.setPassword(newPass);
            user.setEmail(newEmail);
            user.setTypUsera(UserType.NORMAL_USER);
        } else {
            req.setAttribute("wrongValues", true);
            RequestDispatcher rd = req.getRequestDispatcher("/projekt/signUp.jsp");
            rd.forward(req, resp);
        }
        try {
            if (userDao.create(user) == true) {
                userDao.create(user);

                String username = req.getParameter("userName");
                String pass = req.getParameter("password");

                User userForSesion = userDao.findUser(username, pass);

                User userForSession = new User(user.getId(), user.getTypUsera(), user.getEmail(), user.getLogin());
                req.getSession().setMaxInactiveInterval(60*5);
                req.getSession().setAttribute("user", userForSession);

                RequestDispatcher rd = req.getRequestDispatcher("/home");
                rd.forward(req, resp);
            } else {
                req.setAttribute("userExist", true);
                RequestDispatcher rd = req.getRequestDispatcher("/projekt/signUp.jsp");
                rd.forward(req, resp);
            }
        } catch (Exception e) {

        }


    }
}
