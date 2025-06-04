package ar.edu.unpaspotify.repository;

import ar.edu.unpaspotify.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para operaciones CRUD de la entidad Genre.
 * @author Nicolas Butterfield
 */
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}