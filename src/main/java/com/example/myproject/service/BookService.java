package com.example.myproject.service;

import com.example.myproject.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void addBook(Book book);
    List<Book> getBookByName(String name);
    void deleteBook(int id);
    void updateBook(Book book);
}
