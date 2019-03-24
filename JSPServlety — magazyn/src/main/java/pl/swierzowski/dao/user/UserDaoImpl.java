package pl.swierzowski.dao.user;

import pl.swierzowski.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static final String PERSISTENCE_NAME = "user";
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);


    @Override
    public List<User> findAll() {
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("from user");
        List<User> users = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return  users;
    }

    @Override
    public boolean create(User user) {

        final UserDao userDao = new UserDaoImpl();

        List<User> currentUsers = userDao.findAll();
        String newLogin = user.getLogin();
        String newEmail = user.getEmail();

        for( User u:currentUsers){
            if(     u.getLogin().equalsIgnoreCase(newLogin) ||
                    u.getEmail().equalsIgnoreCase(newEmail)   ) {
                return false;
            }
        }
            EntityManager em = FACTORY.createEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            em.close();
        return true;
    }

    @Override
    public void edit(User user) {

    }

    @Override
    public User findUser(String username, String pass) {
        List<User> users = new ArrayList<>();
        User user = new User();
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();;
        Query query = em.createQuery("FROM user u WHERE u.login = :login AND u.password = : password");
        query.setParameter("login",username);
        query.setParameter("password",pass);

        users = (List<User>)query.getResultList();
        em.getTransaction().commit();
        em.close();
        if(users.size()==0){
            return null;
        }
        else {

            user=users.get(0);
        }


//        Query query = em.createQuery("from user where :id");
//        em.createNativeQuery("select *from user where id = ")
//        query.setParameter(1, )
        //List<User> users = query.getResultList();

        return  user;
    }
}
