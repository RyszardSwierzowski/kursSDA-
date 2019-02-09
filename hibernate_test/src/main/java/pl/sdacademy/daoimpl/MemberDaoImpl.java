package pl.sdacademy.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sdacademy.dao.MemberDao;
import pl.sdacademy.entity.Member;
import pl.sdacademy.entity.Run;
import pl.sdacademy.utils.HibernateUtils;

import javax.persistence.NoResultException;
import java.util.List;

public class MemberDaoImpl implements MemberDao {

    public void save(Member member) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(member);
        session.getTransaction().commit();

        session.close();
    }

    public void delete(Integer id) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.createQuery("delete Member where id=:id")
                .setParameter("id", id)
                .executeUpdate();

        session.getTransaction().commit();
        session.close();
    }

    public Member getMember(Integer id) {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();
        Session session = factory.getCurrentSession();
        try {

            session.beginTransaction();

            Member member = (Member) session
                    .createQuery("from Member where id=:id")
                    .setParameter("id", id)
                    .getSingleResult();
            session.getTransaction().commit();
            session.close();

            return member;
        } catch (NoResultException ex) {
            session.getTransaction().rollback();
            System.out.println("no results for " + id);
        }
        session.close();

        return null;
    }

    public List<Member> getAll() {
        SessionFactory factory = HibernateUtils.getInstance()
                .getSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Member> result = session
                .createQuery("from Member")
                .list();

        session.getTransaction().commit();
        session.close();

        return result;
    }
}
