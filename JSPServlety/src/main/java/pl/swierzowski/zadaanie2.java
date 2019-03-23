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

@WebServlet("/string")
public class zadaanie2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<String> lista = new ArrayList<>();
        lista.add("dasdasdasdasdasda");
        lista.add("dasd");
        lista.add("as");
        lista.add("dasdasd");
        lista.add("scbxc");
        lista.add("bxc");
        lista.add("cvxxcxc");
        lista.add("xcbxcbxcbxc");

        req.setAttribute("listaStr",lista);

        RequestDispatcher rd = req.getRequestDispatcher("jstl/zad2b.jsp");
        rd.forward(req,resp);
    }
}
