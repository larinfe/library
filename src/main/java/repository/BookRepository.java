package repository;

import entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {


//    List<Book> findAll();

    int findById(Long id);

    int count();

    int insert(Book book);

    int update(Book book);

    int deleteById(Long id);


}
