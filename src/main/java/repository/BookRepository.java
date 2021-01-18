package repository;

import entity.Book;


public interface BookRepository {

    public int count();

    public Book insert(Book b);

    public int update(Book b);

    public int delete(int id);
}
