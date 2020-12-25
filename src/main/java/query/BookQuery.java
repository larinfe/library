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

    public static String count = "select count(*) from books";


    public static String update = "update books set user = ? where id = ?";


    public static String insert = "insert into books (name,author,isbn) values(?,?)";

    public static String delete = "delete books where isbn = ?";

    public static String findById = "select * from books where id = ?";

    public static String findAll = "select * from books";
    
}
