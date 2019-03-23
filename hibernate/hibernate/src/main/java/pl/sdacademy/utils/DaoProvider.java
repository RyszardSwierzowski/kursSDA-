package pl.sdacademy.utils;

import pl.sdacademy.dao.MemberDao;
import pl.sdacademy.dao.RunDao;
import pl.sdacademy.daoimpl.MemberDaoImpl;
import pl.sdacademy.daoimpl.RunDaoImpl;

public class DaoProvider {
    private static DaoProvider ourInstance = new DaoProvider();

    private RunDao runDao;
    private MemberDao memberDao;

    public static DaoProvider getInstance() {
        return ourInstance;
    }

    private DaoProvider() {
        runDao = new RunDaoImpl();
        memberDao = new MemberDaoImpl();
    }

    public RunDao getRunDao() {
        return runDao;
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }
}
