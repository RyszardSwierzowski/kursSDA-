package com.swierzowski.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }


    @Autowired
    ProductRepository productRepository;
    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

//        productRepository.save(new Product("snickers", "przeterminowany smak dzieciństwa"));
//        List<Product> productsList = productRepository.fetchAllByName("snickers");
//        productsList.forEach(System.out::println);
//        Author author = new Author();
//            author.setName("Jan");
//            author.setSurname("Kowalski");
//            author.setBooks(new ArrayList<Book>());
//        Book book = new Book();
//            book.setAuthor(author);
//            book.setPrice(15.10);
//            book.setTitle("FirstBook");

      //  bookRepository.save(book);
        Book book = new Book();
        book.setTitle("programowanie I");
        book.setNumberOfPeges("250");

        Author author = new Author();
        author.setName("Jan");
        author.setLastName("Nowak");
        author.setHight(170);

        book.setAuthor(author);
        author.setBook(book);

        bookRepository.save(book);


    }
}
