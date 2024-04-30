package com.example.bankingappd14cw2.service;

import com.example.bankingappd14cw2.model.AbdulBook;
import com.example.bankingappd14cw2.repository.AbdulBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbdulBookService {

    private final AbdulBookRepo bookRepo;

    @Autowired
    public AbdulBookService(AbdulBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public AbdulBook save(AbdulBook book) {
        return bookRepo.save(book);
    }

    public AbdulBook findById(int bookId) {
        return bookRepo.findById(bookId);
    }

    public void deleteById(int bookId) {
        bookRepo.deleteById(bookId);
    }

    public Iterable<AbdulBook> findAll() {
        return bookRepo.findAll();
    }
}
