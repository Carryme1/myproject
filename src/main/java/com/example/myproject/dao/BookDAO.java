package com.example.myproject.dao;

import com.example.myproject.entity.Book;

import java.util.List;


public interface BookDAO {
    void addBook(Book book);

    void deleteBook(int id);

    List<Book> getBookByName(String name);
}
