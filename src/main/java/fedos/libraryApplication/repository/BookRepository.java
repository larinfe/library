package fedos.libraryApplication.repository;

import fedos.libraryApplication.entity.Book;


public interface BookRepository {

    public int count();

    public int insert(Book b);

    public int update(Book b);

    public int delete(int id);

    public Book findById(String isbn);
}
