package com.library.service;
import com.library.repository.BookRepository;
public class BookService {

	 private String libraryName; // Injected via constructor
	    private BookRepository bookRepository; // Injected via setter

	    // Constructor injection
	    public BookService(String libraryName) {
	        this.libraryName = libraryName;
	    }

	    // Setter injection
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void displayBooks() {
	        System.out.println("Library Name: " + libraryName);
	        bookRepository.getAllBooks();
	    }
}
