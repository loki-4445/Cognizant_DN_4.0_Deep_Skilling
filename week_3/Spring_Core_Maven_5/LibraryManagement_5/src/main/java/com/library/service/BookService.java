package com.library.service;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Inside BookService...");
        bookRepository.getAllBooks();
    }
}
