package pl.swierzowski.servlet;

import pl.swierzowski.dao.PostDao;
import pl.swierzowski.dao.PostDaoImpl;
import pl.swierzowski.model.Post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/addPost")
public class AddPostServlet extends HttpServlet {


    private static PostDao daoPost = new PostDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titeParam
                = req.getParameter("title");

        String contentParam
                = req.getParameter("content");

        Post post = new Post();
        post.setTitle(titeParam);
        post.setContent(contentParam);
        post.setCreatedAt(LocalDateTime.now());

        daoPost.create(post);

        resp.sendRedirect("/home");

    }
}
