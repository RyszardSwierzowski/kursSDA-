package x.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import x.demo.model.Author;
import x.demo.model.Book;
import x.demo.model.Receznent;
import x.demo.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        Author author = new Author();
            author.setName("Tomasz");
            author.setSurname("Krawczyk");
        Receznent receznent1 = new Receznent();
            receznent1.setName("Jan");
            receznent1.setSurname("Kowalski");
        Receznent receznent2 = new Receznent();
            receznent2.setName("Jakub");
            receznent2.setSurname("Nowak");
        Receznent receznent3 = new Receznent();
            receznent3.setName("Zenon");
            receznent3.setSurname("Kowalski");
        List<Receznent> recenzenci = new ArrayList<>();
            recenzenci.add(receznent1);
            recenzenci.add(receznent2);
            recenzenci.add(receznent3);

            book.setAuthor(author);
            book.setRecenzenci(recenzenci);

//            bookRepository.save(book);


    }
}
