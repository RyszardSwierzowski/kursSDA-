package pl.swierzowski;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pytania")
public class zadanie4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pytanie> pytania= new ArrayList<>();
        pytania.add(new Pytanie("Pytanie1","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie2","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie3","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie4","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie5","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie6","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie7","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie8","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie9","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie10","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie11","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie12","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie13","a","b","c","d",2));
        pytania.add(new Pytanie("Pytanie14","a","b","c","d",2));

        req.setAttribute("pytania", pytania);
        RequestDispatcher rd = req.getRequestDispatcher("jstl/zad2b.jsp");
        rd.forward(req,resp);

    }
}
