package pl.swierzowski.servlet;


import pl.swierzowski.dao.PostDao;
import pl.swierzowski.dao.PostDaoImpl;
import pl.swierzowski.model.Post;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/home")
public class DashboardServlet extends HttpServlet {

    private final PostDao postDao = new PostDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Post> posts =  postDao.findAll();
        if(posts.isEmpty()){
            Post post = new Post();
            post.setTitle("Servlety i JSP");
            post.setCreatedAt(LocalDateTime.now());
            post.setContent("xxx");
            postDao.create(post);
            posts.add(post);


            Post post2 = new Post();
            post2.setTitle("Post2");
            post2.setCreatedAt(LocalDateTime.now());
            post2.setContent("xx");
            postDao.create(post2);
            posts.add(post2);

            Post post3 = new Post();
            post3.setTitle("Post3");
            post3.setCreatedAt(LocalDateTime.now());
            post3.setContent("xxxxx");
            postDao.create(post3);
            posts.add(post3);



        }

        req.setAttribute("posts",posts);








        RequestDispatcher rd = req.getRequestDispatcher("/projekt/index.jsp");
        rd.forward(req,resp);
    }
}
