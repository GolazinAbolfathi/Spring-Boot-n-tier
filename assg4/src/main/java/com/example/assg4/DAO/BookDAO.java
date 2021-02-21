package com.example.assg4.DAO;

import com.example.assg4.Entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository repository;

    public Collection<book> getBooks()
    {
        return repository.findAll();
    }


    public book createBook(book bkObj) {
        return repository.insert(bkObj);
    }
}
