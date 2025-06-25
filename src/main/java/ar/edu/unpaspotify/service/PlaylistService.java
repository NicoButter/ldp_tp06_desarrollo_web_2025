package ar.edu.unpaspotify.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unpaspotify.model.Playlist;
import ar.edu.unpaspotify.repository.PlaylistRepository;

/**
 * Servicio para manejar la lógica de negocio relacionada con las playlists.
 * <p>
 * Esta clase implementa las operaciones básicas de CRUD (Crear, Leer, Actualizar y Eliminar)
 * para las playlists. Actúa como intermediario entre los controladores y el repositorio de datos.
 * Desarrollado para la materia Laboratorio de Programación de la Licenciatura en Sistemas de la
 * Universidad Nacional de la Patagonia Austral (UNPA).
 * </p>
 *
 * @author Nicolas Butterfield
 * @version 1.0
 * @since 2025
 */
@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    /**
     * Obtiene todas las playlists disponibles.
     * 
     * @return Lista de todas las playlists ordenadas según la implementación del repositorio
     */
    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    /**
     * Busca una playlist por su identificador único.
     * 
     * @param id Identificador de la playlist a buscar
     * @return Optional que contiene la playlist si existe, o vacío si no se encuentra
     * @throws IllegalArgumentException si el ID proporcionado es nulo
     */
    public Optional<Playlist> findById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");
        }
        return playlistRepository.findById(id);
    }

    /**
     * Guarda o actualiza una playlist en la base de datos.
     * 
     * @param playlist Playlist a guardar o actualizar
     * @return Playlist guardada con su ID generado/actualizado
     * @throws IllegalArgumentException si la playlist proporcionada es nula
     */
    public Playlist save(Playlist playlist) {
        if (playlist == null) {
            throw new IllegalArgumentException("La playlist no puede ser nula");
        }
        return playlistRepository.save(playlist);
    }

    /**
     * Elimina una playlist por su identificador único.
     * 
     * @param id Identificador de la playlist a eliminar
     * @throws IllegalArgumentException si el ID proporcionado es nulo o si no existe la playlist
     */
    public void deleteById(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo");
        }
        if (!playlistRepository.existsById(id)) {
            throw new IllegalArgumentException("No existe una playlist con el ID proporcionado");
        }
        playlistRepository.deleteById(id);
    }
}