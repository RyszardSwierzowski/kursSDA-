package pl.swierzowski;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet("/SortServlet")
public class SortServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String str = req.getParameter("str");

        String[] tab = str.split(",");
        List<String> list = Arrays.stream(tab).sorted().collect(Collectors.toList());
        //System.out.println(list.size());
        req.setAttribute("lista", list);

        RequestDispatcher rd = req.getRequestDispatcher("zad2resp.jsp");
        rd.forward(req,resp);
    }
}
