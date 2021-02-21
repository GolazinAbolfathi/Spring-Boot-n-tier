package com.example.assg4.DAO;

import com.example.assg4.Entity.book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.awt.print.Book;

public interface BookRepository extends MongoRepository<book, Integer> {
}
