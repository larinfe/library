package query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookQuery {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static String count = "select count(*) from books";


    public static String update = "update books set user = ? where id = ?";


    public static String insert = "insert into books (name,author,isbn) values(?,?)";

    public static String delete = "delete books where isbn = ?";

    public static String findById = "select * from books where id = ?";

    public static String findAll = "select * from books";

}
