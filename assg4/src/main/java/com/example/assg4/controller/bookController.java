package com.example.assg4.controller;

import com.example.assg4.Entity.book;
import com.example.assg4.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Collection;

@RestController
@RequestMapping("/books")
public class bookController {

    @Autowired
    private BookService bookService;

    //Annotation is: identify the method if it is for GET
    @GetMapping
    public Collection<book> getBooks()
    {
        return bookService.getBooks();
    }

    @PostMapping()
    public book postBook(@RequestBody book bkObj)
    {
        return bookService.createBook(bkObj);
    }
}
