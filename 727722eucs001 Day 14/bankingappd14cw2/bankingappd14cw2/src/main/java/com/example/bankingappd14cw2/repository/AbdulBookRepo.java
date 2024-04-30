package com.example.bankingappd14cw2.repository;

import com.example.bankingappd14cw2.model.AbdulBook;

public interface AbdulBookRepo {
    AbdulBook save(AbdulBook book);
    AbdulBook findById(int bookId);
    void deleteById(int bookId);
    Iterable<AbdulBook> findAll();
}
