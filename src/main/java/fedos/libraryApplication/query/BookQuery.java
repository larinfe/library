package fedos.libraryApplication.query;


public class BookQuery {


    public static final String COUNT = "select count(*) from books";

    public static final String UPDATE = "update books set user = ? where id = ?";

    public static final String INSERT = "insert into books (isbn,name,author) values(?,?,?)";

    public static final String DELETE = "delete books where isbn = ?";

    public static final String FIND_BY_ID = "select isbn,name,author from books where isbn = ?";

    public static final String FIND_ALL = "select * from books";

}
