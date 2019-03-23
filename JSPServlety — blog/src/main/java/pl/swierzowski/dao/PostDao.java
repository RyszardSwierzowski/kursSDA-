package pl.swierzowski.dao;

import pl.swierzowski.model.Post;

import java.util.List;

public interface PostDao {

    List<Post> findAll();
    boolean create(Post post);

}
