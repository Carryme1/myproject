package com.example.myproject.service.serviceImp;

import com.example.myproject.dao.BookDAO;
import com.example.myproject.entity.Book;
import com.example.myproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {
    @Autowired
    BookDAO bookDAO;
    @Override
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    public Book getBookByName(String name) {
        return bookDAO.getBookByName(name);
    }

    @Override
    public List<Book> deleteBook(int id) {
        return bookDAO.deleteBook(id);
    }
}
