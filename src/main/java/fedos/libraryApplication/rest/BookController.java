package fedos.libraryApplication.rest;

import fedos.libraryApplication.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fedos.libraryApplication.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(value = "/count")
    public int count() {
        return bookRepository.count();
    }

    @GetMapping(value = "/{isbn}")
    public Book findById(@PathVariable String isbn) {
        return bookRepository.findById(isbn);
    }
}