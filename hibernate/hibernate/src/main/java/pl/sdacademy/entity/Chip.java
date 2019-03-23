package pl.sdacademy.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Chip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String serial;
    private Date addedDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "run_id")
    private Run run;

    public Chip() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }
}
