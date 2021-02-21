package com.example.assg4.service;

import com.example.assg4.DAO.BookDAO;
import com.example.assg4.Entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.awt.print.Book;
import java.util.Collection;

@Service
public class BookService {


    @Autowired
    private BookDAO bookDAO; // obj of the class BookDAO

    public Collection<book> getBooks()
    {
        return bookDAO.getBooks();
    }
    public book createBook(book bkobj) {
        return bookDAO.createBook(bkobj);
    }

}
