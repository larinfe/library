package repository;

import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class JdbcBookRepository implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int count() {
        return jdbcTemplate.update("select count(*) from books", Integer.class);
    }

    @Override
    public int update(Book book) {
        return jdbcTemplate.update(
                "update books set user = ? where id = ?",
                book.getName(), book.getIsbn());
    }

    @Override
    public int insert(Book book) {
        return jdbcTemplate.update(
                "insert into books (name,author,isbn) values(?,?)",
                book.getName(), book.getIsbn());
    }

    @Override
    public int deleteById(Long isbn) {
        return jdbcTemplate.update(
                "delete books where isbn = ?", isbn);

    }

    @Override
    public int findById(Long isbn) {
        return jdbcTemplate.update(
                "select * from books where id = ?", isbn);

    }

//    @Override
//    public List<Book> findAll() {
//        return jdbcTemplate.query(
//                "select * from books"
//        );
//    }
}
