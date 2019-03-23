package pl.swierzowski.sesje_i_ciasteczka;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/Licz")
public class LiczKlikniecia extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
       // List temp = (List) session.getAttributeNames();
        Integer wynik = (Integer) session.getAttribute ("wynik");
        if(wynik == null){
            session.setAttribute("wynik",0);
        }else{
            session.setAttribute("wynik",55);
        }





        RequestDispatcher rd = req.getRequestDispatcher("sesja/licznik.jsp");
        rd.forward(req, resp);


//        String wynik="";
//
//
//        HttpSession session = req.getSession();
//        List<String> temp = (List<String>) session.getAttributeNames();
////        if (req.getSession().isNew()) {
////             wynik = "0";
////        } else {
////             wynik = (String) req.getAttribute("wynik")+1;
////        }
//
//        session.setAttribute("wynik", temp);
//        if(req.getSession().isNew()){
//            req.getSession().setAttribute("wynik",0);
//        }else{
//            req.getSession().setAttribute(
//                    "wynik",((int)req.getSession().getAttribute("wynik")+1)
//            );
//        }
//        RequestDispatcher rd = req.getRequestDispatcher("sesja/licznik.jsp");
//        rd.forward(req, resp);
    }
}
