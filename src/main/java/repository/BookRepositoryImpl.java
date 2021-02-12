package repository;

import entity.Book;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import query.BookQuery;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository

public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Book b) {
        return jdbcTemplate.update(BookQuery.INSERT, b);
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
//        String name = rs.getString("name");
//        String author = rs.getString("author");
//        String isbn = rs.getString("ISBN");
//        User user = rs.getObject("user");
        System.out.println(rs);
//        Book book = new Book(name, author, isbn);
//        book.setAuthor(author);
//        book.setName(name);
//        book.setUser(user);
//        book.setIsbn(isbn);

        return null;
    }
}