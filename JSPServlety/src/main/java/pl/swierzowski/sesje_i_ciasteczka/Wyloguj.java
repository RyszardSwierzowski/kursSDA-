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

@WebServlet("/wyloguj")
public class Wyloguj extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            Optional<Cookie> cookie = Arrays.stream(cookies)
                    .filter(c->c.getName().equals("isLog"))
                    .findFirst();


        }


        resp.sendRedirect("/loguj");
    }


}
