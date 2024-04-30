package com.example.bankingappd14cw2.controller;

import com.example.bankingappd14cw2.model.AbdulBook;
import com.example.bankingappd14cw2.service.AbdulBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class AbdulBookController {

    private final AbdulBookService bookService;

    @Autowired
    public AbdulBookController(AbdulBookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<AbdulBook> createBook(@RequestBody AbdulBook book) {
        AbdulBook savedBook = bookService.save(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<AbdulBook> updateBook(@PathVariable int bookId, @RequestBody AbdulBook book) {
        AbdulBook existingBook = bookService.findById(bookId);
        if (existingBook == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        book.setBookId(bookId);
        AbdulBook updatedBook = bookService.save(book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<AbdulBook>> getAllBooks() {
        Iterable<AbdulBook> books = bookService.findAll();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<AbdulBook> getBookById(@PathVariable int bookId) {
        AbdulBook book = bookService.findById(bookId);
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}
