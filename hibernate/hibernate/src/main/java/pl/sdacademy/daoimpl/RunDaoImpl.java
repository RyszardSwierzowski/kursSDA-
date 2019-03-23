package pl.sdacademy.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sdacademy.dao.RunDao;
import pl.sdacademy.entity.Run;
import pl.sdacademy.utils.HibernateUtils;

import javax.persistence.NoResultException;
import java.util.List;

public class RunDaoImpl implements RunDao {

    public void save(Run run) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(run);
        session.getTransaction().commit();

        session.close();
    }

    public void delete(Integer id) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.createQuery("delete Run where id=:id")
                .setParameter("id", id)
                .executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    public Run getRun(Integer id) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();

            Run run = (Run) session
                    .createQuery("from Run where id=:id")
                    .setParameter("id", id)
                    .getSingleResult();
            session.getTransaction().commit();
            session.close();

            return run;
        } catch (NoResultException ex) {
            session.getTransaction().rollback();
            System.out.println("no results for " + id);
        }
        session.close();

        return null;
    }

    public List<Run> getAll() {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Run> result = session
                .createQuery("from Run")
                .list();

        session.getTransaction().commit();
        session.close();

        return result;
    }
}
