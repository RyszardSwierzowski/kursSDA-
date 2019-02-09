package pl.sdacademy.run;

import pl.sdacademy.dao.MemberDao;
import pl.sdacademy.dao.RunDao;
import pl.sdacademy.daoimpl.RunDaoImpl;
import pl.sdacademy.entity.Member;
import pl.sdacademy.entity.Run;
import pl.sdacademy.utils.DaoProvider;
import pl.sdacademy.utils.HibernateUtils;

import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String args[]) {

        RunDao dao = DaoProvider.getInstance().getRunDao();
        MemberDao memberDao = DaoProvider.getInstance().getMemberDao();


        Run run1 = new Run();
        run1.setName("Run 1");
        run1.setPlace("Place 1");
        dao.save(run1);

        Run run2 = new Run();
        run2.setName("Run 2");
        run2.setPlace("Place 2");
        dao.save(run2);


        Member member1 = new Member();
        member1.setName("member 1");
        member1.setLastName("last name member 2");
        memberDao.save(member1);

        Member member2 = new Member();
        member2.setName("member 1");
        member2.setLastName("last name member 2");
        memberDao.save(member2);


        member1.getRuns().add(run1);
        member1.getRuns().add(run2);
        memberDao.save(member1);

        member2.getRuns().add(run1);
        member2.getRuns().add(run2);
        memberDao.save(member2);


        HibernateUtils.getInstance()
                .getSessionFactory()
                .close();
    }
}
