package ar.edu.unpaspotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unpaspotify.model.Playlist;
import ar.edu.unpaspotify.service.GenreService;
import ar.edu.unpaspotify.service.PlaylistService;

/**
 * Controlador para las operaciones CRUD de playlists de Spotify.
 * <p>
 * Maneja todas las peticiones HTTP relacionadas con playlists bajo la ruta base
 * "/playlists".
 * Desarrollado para la materia Laboratorio de Programación de la Licenciatura
 * en Sistemas
 * de la Universidad Nacional de la Patagonia Austral (UNPA).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@Controller
@RequestMapping("/playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @Autowired
    private GenreService genreService;

   /**
     * Muestra la lista de todas las playlists disponibles en la aplicación.
     * <p>
     * Este método maneja las solicitudes GET a las rutas raíz "" o "/list" dentro del contexto de playlists.
     * Carga los datos necesarios para renderizar la vista usando Thymeleaf, incluyendo la lista completa de playlists,
     * estilos específicos, scripts y el título de la página.
     * </p>
     *
     * @param model Objeto {@link Model} utilizado para pasar atributos a la vista Thymeleaf
     * @return El nombre de la vista "playlists/list", que representa la plantilla HTML a renderizar
     */
    @GetMapping({ "", "/list" })
    public String listPlaylists(Model model) {
        model.addAttribute("playlists", playlistService.findAll());

        model.addAttribute("title", "Lista de Playlists");

        model.addAttribute("headSection", "playlists/list :: estilos");
        model.addAttribute("bodyContent", "playlists/list :: contenido");
        model.addAttribute("bodyScripts", "playlists/list :: scripts");

        return "playlists/list";
    }

    /**
     * Muestra el formulario para crear una nueva playlist.
     * 
     * @param model Modelo que contiene los datos para el formulario
     * @return Vista "playlists/form" con el formulario vacío
     */
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("playlist", new Playlist());
        model.addAttribute("genres", genreService.findAll());
        return "playlists/form";
    }

    /**
     * Procesa el envío del formulario para guardar una nueva playlist.
     * 
     * @param playlist Playlist a guardar (mapeada desde el formulario)
     * @return Redirección a la lista de playlists después de guardar
     */
    @PostMapping
    public String savePlaylist(@ModelAttribute Playlist playlist) {
        playlistService.save(playlist);
        return "redirect:/playlists";
    }

    /**
     * Muestra el formulario para editar una playlist existente.
     * 
     * @param id    ID de la playlist a editar
     * @param model Modelo que contiene los datos para el formulario
     * @return Vista "playlists/form" con los datos de la playlist
     * @throws IllegalArgumentException Si no se encuentra la playlist con el ID
     *                                  proporcionado
     */
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Playlist playlist = playlistService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid playlist ID"));
        model.addAttribute("playlist", playlist);
        model.addAttribute("genres", genreService.findAll());
        return "playlists/form";
    }

    /**
     * Elimina una playlist específica.
     * 
     * @param id ID de la playlist a eliminar
     * @return Redirección a la lista de playlists después de eliminar
     */
    @GetMapping("/delete/{id}")
    public String deletePlaylist(@PathVariable Integer id) {
        playlistService.deleteById(id);
        return "redirect:/playlists";
    }
}