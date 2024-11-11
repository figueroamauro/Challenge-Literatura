package ar.com.old.literatura.services;

import ar.com.old.literatura.models.Author;
import ar.com.old.literatura.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> findAll() {
        List<Author> list = repository.findAll();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("No se encontraron datos");
        }
        return list;
    }

    public Author findById(Long id) throws IllegalArgumentException{
        Optional<Author> opt = repository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            throw new IllegalArgumentException("el autor no se encuentra en la base de datos");
        }
    }

    public Author save(Author author) {
        return repository.save(author);
    }
}
