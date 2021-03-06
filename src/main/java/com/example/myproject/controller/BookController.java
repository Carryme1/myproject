package com.example.myproject.controller;

import com.example.myproject.entity.Book;
import com.example.myproject.service.BookService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @DeleteMapping("/book/{id}")
    public void delteBookById(@PathVariable("id") int id){
        bookService.deleteBook(id);
    }

    @GetMapping("/book")
    public List<Book> getBookByName(@RequestParam("name") String name) {
        List<Book> results = (List<Book>) bookService.getBookByName(name);
        return results;
    }

    @PostMapping("/book1")
    @ResponseBody
    public void updateDescription(@RequestParam("name") String name,@RequestParam("description") String d){
        Book book = new Book();
        book.setDescription(d);
        book.setName(name);
        bookService.updateBook(book);
    }

}
