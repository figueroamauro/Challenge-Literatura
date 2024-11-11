package ar.com.old.literatura.controllers;

import ar.com.old.literatura.models.Author;
import ar.com.old.literatura.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAll() {
        try {
            List<Author> list = service.findAll();
            return ResponseEntity.ok(list);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Author author) {
        try {
            Author authorTemp = service.save(author);
            return ResponseEntity.ok(authorTemp);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
