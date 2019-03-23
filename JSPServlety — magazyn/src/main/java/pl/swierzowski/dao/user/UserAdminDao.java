package pl.swierzowski.dao.user;

import pl.swierzowski.model.User;

import java.util.List;

public interface UserAdminDao {
    List<User> findAll();
    void create(User user);
    void edit(User user);
    void remove(User user);
}
