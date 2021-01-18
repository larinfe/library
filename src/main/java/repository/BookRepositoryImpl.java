package repository;

import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import query.BookQuery;

@Repository

public class BookRepositoryImpl implements BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Book insert(Book b) {
        return jdbcTemplate.queryForObject(BookQuery.INSERT, Book.class);
    }

    @Override
    public int update(Book b) {
        return jdbcTemplate.update(BookQuery.UPDATE, Book.class);
    }

    @Override
    public int count() {
        return jdbcTemplate.queryForObject(BookQuery.COUNT, Integer.class);
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.queryForObject(BookQuery.DELETE, Integer.class);
    }

}
