package com.example.myproject.service;

import com.example.myproject.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void addBook(Book book);
    Book getBookByName(String name);
    List<Book> deleteBook(int id);
}
