package ar.edu.unpaspotify.repository;

import ar.edu.unpaspotify.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio para operaciones CRUD de la entidad Playlist.
 * @author Nicolas Butterfield
 */
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
}