package com.example.myproject.dao;

import com.example.myproject.entity.Book;

import java.util.List;


public interface BookDAO {
    void addBook(Book book);

    List<Book> deleteBook(int id);

    Book getBookByName(String name);
}
