package pl.swierzowski.sesje_i_ciasteczka;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("/loguj")
public class Logowanie extends HttpServlet {

    private final String user="User";
    private final String pass="Pass";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            Optional<Cookie> cookie = Arrays.stream(cookies)
                    .filter(c->c.getName().equals("isLog"))
                    .findFirst();
            if(cookie.isPresent()){
                RequestDispatcher rd = req.getRequestDispatcher("sesja/panel.jsp");
                rd.forward(req,resp);
            }else{
                RequestDispatcher rd = req.getRequestDispatcher("sesja/logowanie.jsp");
                rd.forward(req,resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String corectUser = req.getParameter("userName");
        String corectPass=req.getParameter("password");


            if(corectUser.equals(user) && corectPass.equals(pass)){
                Cookie cookie =new Cookie("isLog",user);
                cookie.setMaxAge(30*60);
                resp.addCookie(cookie);

                resp.sendRedirect("/sesja/panel.jsp");
            }
            else{
                resp.sendRedirect("/sesja/logowanie.jsp");
            }



    }
}
