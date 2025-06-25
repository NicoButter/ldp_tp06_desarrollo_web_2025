package ar.edu.unpaspotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unpaspotify.model.Genre;

/**
 * Repositorio para operaciones de base de datos con la entidad Genre.
 * <p>
 * Provee acceso a todas las operaciones CRUD básicas a través de la extensión
 * de JpaRepository. Desarrollado para la materia Laboratorio de Programación
 * de la Licenciatura en Sistemas de la Universidad Nacional de la Patagonia
 * Austral (UNPA).
 * </p>
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
public interface GenreRepository extends JpaRepository<Genre, Integer> {
    // Spring Data JPA provee automáticamente:
    // save(), findById(), findAll(), count(), delete(), deleteById(), etc.
}