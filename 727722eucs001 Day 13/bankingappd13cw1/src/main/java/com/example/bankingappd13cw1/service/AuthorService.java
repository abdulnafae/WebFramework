package com.example.bankingappd13cw1.service;

import com.example.bankingappd13cw1.model.Author;
import com.example.bankingappd13cw1.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Optional<Author> getAuthorById(int id) {
        return authorRepository.findById(id);
    }

    public Author updateAuthor(int id, Author author) {
        Author existingAuthor = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + id));

        existingAuthor.setAddress(author.getAddress());
        existingAuthor.setEmail(author.getEmail());
        existingAuthor.setPhoneNumber(author.getPhoneNumber());

        return authorRepository.save(existingAuthor);
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }
}
