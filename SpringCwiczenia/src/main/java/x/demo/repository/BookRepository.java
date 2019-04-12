package x.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import x.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
}
