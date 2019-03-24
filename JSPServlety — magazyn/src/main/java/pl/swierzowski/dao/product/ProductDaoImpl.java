package pl.swierzowski.dao.product;

import pl.swierzowski.dao.user.UserDao;
import pl.swierzowski.dao.user.UserDaoImpl;
import pl.swierzowski.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ProductDaoImpl implements ProductDao{

    private static final String PERSISTENCE_NAME = "product";
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);

    final ProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> findAll() {
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("from products");
        List<Product> productList = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return  productList;
    }

    @Override
    public void create(Product product) {
        EntityManager em = FACTORY.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void edit(Product post) {

    }

    @Override
    public void remove(Product product) {

    }
}
