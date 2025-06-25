package ar.edu.unpaspotify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unpaspotify.model.Genre;
import ar.edu.unpaspotify.repository.GenreRepository;

/**
 * Servicio para manejar la lógica de negocio relacionada con géneros musicales.
 * <p>
 * Esta clase implementa las operaciones CRUD y actúa como intermediario entre
 * los controladores y el repositorio de datos. Desarrollado para la materia
 * Laboratorio de Programación de la Licenciatura en Sistemas de la Universidad
 * Nacional de la Patagonia Austral (UNPA).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    /**
     * Obtiene todos los géneros musicales existentes.
     * 
     * @return Lista de todos los géneros ordenados según la implementación del repositorio
     */
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    /**
     * Busca un género musical por su identificador único.
     * 
     * @param id Identificador del género a buscar
     * @return Optional que contiene el género si existe, o vacío si no se encuentra
     * @throws IllegalArgumentException si el ID proporcionado es nulo
     */
    public Optional<Genre> findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");
        }
        return genreRepository.findById(id);
    }

    /**
     * Guarda o actualiza un género musical en la base de datos.
     * 
     * @param genre Género a guardar o actualizar
     * @return Género guardado con su ID generado/actualizado
     * @throws IllegalArgumentException si el género proporcionado es nulo
     */
    public Genre save(Genre genre) {
        if (genre == null) {
            throw new IllegalArgumentException("El género no puede ser nulo");
        }
        return genreRepository.save(genre);
    }

    /**
     * Elimina un género musical por su identificador único.
     * 
     * @param id Identificador del género a eliminar
     * @throws IllegalArgumentException si el ID proporcionado es nulo o si no existe el género
     */
    public void deleteById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");
        }
        if (!genreRepository.existsById(id)) {
            throw new IllegalArgumentException("No existe un género con el ID proporcionado");
        }
        genreRepository.deleteById(id);
    }
}