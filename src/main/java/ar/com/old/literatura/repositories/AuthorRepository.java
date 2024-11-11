package ar.com.old.literatura.repositories;

import ar.com.old.literatura.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
