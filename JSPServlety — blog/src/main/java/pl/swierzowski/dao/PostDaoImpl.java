package pl.swierzowski.dao;

import com.mysql.cj.QueryResult;
import pl.swierzowski.model.Post;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class PostDaoImpl implements PostDao {

    private static final String PERSISTENCE_NAME = "store";
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);

    @Override
    public List<Post> findAll() {
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("from posts");
        List<Post> users = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return  users;
    }

    @Override
    public boolean create(Post post) {
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();
        em.persist(post);
        em.getTransaction().commit();
        em.close();
        return true;
    }

}
