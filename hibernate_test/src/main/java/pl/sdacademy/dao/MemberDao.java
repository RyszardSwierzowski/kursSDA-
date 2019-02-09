package pl.sdacademy.dao;

import pl.sdacademy.entity.Member;

import java.util.List;

public interface MemberDao {
    void save(Member member);
    void delete(Integer id);
    Member getMember(Integer id);
    List<Member> getAll();
}
