package com.library.LibraryManagement;
import com.library.LibraryManagement.BookRepository;
public class BookService {

    private BookRepository bookRepository;

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        bookRepository.getAllBooks();
    }
}
