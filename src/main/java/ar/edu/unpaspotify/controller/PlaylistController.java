package ar.edu.unpaspotify.controller;

import ar.edu.unpaspotify.model.Genre;
import ar.edu.unpaspotify.model.Playlist;
import ar.edu.unpaspotify.service.GenreService;
import ar.edu.unpaspotify.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para manejar las operaciones CRUD de playlists.
 * @author Nicolas Butterfield
 */
@Controller
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @Autowired
    private GenreService genreService;

    // Listar todas las playlists
    @GetMapping
    public String listPlaylists(Model model) {
        List<Playlist> playlists = playlistService.findAll();
        model.addAttribute("playlists", playlists);
        return "playlists/list";
    }

    // Mostrar formulario para crear nueva playlist
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("playlist", new Playlist());
        model.addAttribute("genres", genreService.findAll());
        return "playlists/form";
    }

    // Guardar una playlist
    @PostMapping
    public String savePlaylist(@ModelAttribute Playlist playlist) {
        playlistService.save(playlist);
        return "redirect:/playlists";
    }

    // Mostrar formulario para editar una playlist
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Playlist playlist = playlistService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid playlist ID"));
        model.addAttribute("playlist", playlist);
        model.addAttribute("genres", genreService.findAll());
        return "playlists/form";
    }

    // Eliminar una playlist
    @GetMapping("/delete/{id}")
    public String deletePlaylist(@PathVariable Integer id) {
        playlistService.deleteById(id);
        return "redirect:/playlists";
    }
}