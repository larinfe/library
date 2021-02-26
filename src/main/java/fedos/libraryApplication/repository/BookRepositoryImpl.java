package fedos.libraryApplication.repository;

import fedos.libraryApplication.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import fedos.libraryApplication.query.BookQuery;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository

public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Book book) {
        return jdbcTemplate.update(BookQuery.INSERT, book.getIsbn(), book.getName(), book.getAuthor());
    }

    @Override
    public int update(Book b) {
        return jdbcTemplate.update(BookQuery.UPDATE, b);
    }

    @Override
    public int count() {
        return jdbcTemplate.queryForObject(BookQuery.COUNT, Integer.class);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.queryForObject(BookQuery.DELETE, Integer.class);
    }

    @Override
    public Book findById(String isbn) {
        return jdbcTemplate.queryForObject(BookQuery.FIND_BY_ID, new Mapper(), isbn);
    }


}

class Mapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        String name = rs.getString("name");
        String author = rs.getString("author");
        String isbn = rs.getString("ISBN");
        System.out.println(rs);
        Book book = new Book();
        book.setAuthor(author);
        book.setName(name);
        book.setIsbn(isbn);

        return book;
    }
}