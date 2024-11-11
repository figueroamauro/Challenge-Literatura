package ar.com.old.literatura.controllers;

import ar.com.old.literatura.models.Author;
import ar.com.old.literatura.services.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAll() {
        List<Author> list = service.findAll();

    }
}
