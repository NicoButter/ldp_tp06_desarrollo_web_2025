package ar.edu.unpaspotify.service;

import ar.edu.unpaspotify.model.Playlist;
import ar.edu.unpaspotify.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio para manejar la lógica de negocio de playlists.
 * @author Nicolas Butterfield
 */
@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }

    public Optional<Playlist> findById(Integer id) {
        return playlistRepository.findById(id);
    }

    public Playlist save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public void deleteById(Integer id) {
        playlistRepository.deleteById(id);
    }
}