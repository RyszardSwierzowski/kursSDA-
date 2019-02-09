package pl.sdacademy.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Run {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String place;
    private Date startDate;
    private Integer membersLimit;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "runs")
    private Set<Member> members = new HashSet<Member>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "run")
    private Set<Chip> chips = new HashSet<Chip>();

    public Run() {
    }

    public Set<Chip> getChips() {
        return chips;
    }

    public void setChips(Set<Chip> chips) {
        this.chips = chips;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Integer getMembersLimit() {
        return membersLimit;
    }

    public void setMembersLimit(Integer membersLimit) {
        this.membersLimit = membersLimit;
    }
}
