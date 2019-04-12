package x.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private int numberOfPages;

    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_id")
    private List<Receznent> recenzenci;




}
