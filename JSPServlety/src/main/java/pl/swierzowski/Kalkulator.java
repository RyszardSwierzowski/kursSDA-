package pl.swierzowski;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Kalkulator")
public class Kalkulator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("liczbaA"));
        double b = Double.parseDouble(req.getParameter("liczbaB"));
        String dzialanie = req.getParameter("dzialanie");
        double wynik;
        if(dzialanie.equals("+")){
            wynik=a+b;
        }else if(dzialanie.equals("-")){
            wynik=a-b;
        }else if(dzialanie.equals("*")){
            wynik=a*b;
        }else {
            wynik=a/b;
        }
        req.setAttribute("wynik",wynik);

        RequestDispatcher rd = req.getRequestDispatcher("/wynikLiczenia.jsp");
        rd.forward(req,resp);
    }
}
