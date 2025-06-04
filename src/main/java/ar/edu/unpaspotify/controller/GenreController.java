package ar.edu.unpaspotify.controller;

import ar.edu.unpaspotify.model.Genre;
import ar.edu.unpaspotify.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para manejar las operaciones CRUD de géneros musicales.
 * @author Nicolas Butterfield
 */
@Controller
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    // Listar todos los géneros
    @GetMapping
    public String listGenres(Model model) {
        List<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        return "genres/list";
    }

    // Mostrar formulario para crear nuevo género
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("genre", new Genre());
        return "genres/form";
    }

    // Guardar un género
    @PostMapping
    public String saveGenre(@ModelAttribute Genre genre) {
        genreService.save(genre);
        return "redirect:/genres";
    }

    // Mostrar formulario para editar un género
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Genre genre = genreService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid genre ID"));
        model.addAttribute("genre", genre);
        return "genres/form";
    }

    // Eliminar un género
    @GetMapping("/delete/{id}")
    public String deleteGenre(@PathVariable Integer id) {
        genreService.deleteById(id);
        return "redirect:/genres";
    }
}