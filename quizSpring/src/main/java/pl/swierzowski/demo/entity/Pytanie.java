package pl.swierzowski.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

//@Entity
@Setter
@Getter
public class Pytanie {

//    @Id
//    @GeneratedValue
    private long id;
    private String content;
    private List<String> pytania;
    private String odp;

    public Pytanie() {
    }

    public Pytanie(long id, String content, List<String> pytania, String odp) {
        this.id = id;
        this.content = content;
        this.pytania = pytania;
        this.odp = odp;
    }
}
