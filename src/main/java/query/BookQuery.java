package query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookQuery {
    //    public static void main (String[] args) {
//        try {
//            String url = "jdbc:postgresql://localhost:5432";
//            Connection conn = DriverManager.getConnection(url,"","");
//            Statement stmt = conn.createStatement();
//            ResultSet rs;
//
//            rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");
//            while ( rs.next() ) {
//                String lastName = rs.getString("Lname");
//                System.out.println(lastName);
//            }
//            conn.close();
//        } catch (Exception e) {
//            System.err.println("Got an exception! ");
//            System.err.println(e.getMessage());
//        }
//    }
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void count(String[] args) {
        String query = "select count(*) from books";
    }

    public static void update(String[] args) {
        String query = "update books set user = ? where id = ?";
    }

    public static void insert(String[] args) {
        String query = "insert into books (name,author,isbn) values(?,?)";
    }

    public static void delete(String[] args) {
        String query = "delete books where isbn = ?";
    }

    public static void findById(String[] args) {
        String query = "select * from books where id = ?";
    }

    public static void findAll(String[] args) {
        String query = "select * from books";
    }
}
