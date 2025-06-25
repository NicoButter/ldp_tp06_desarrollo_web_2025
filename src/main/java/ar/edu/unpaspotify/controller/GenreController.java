package ar.edu.unpaspotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unpaspotify.model.Genre;
import ar.edu.unpaspotify.service.GenreService;

/**
 * Controlador para las operaciones CRUD de géneros musicales de Spotify.
 * <p>
 * Maneja todas las peticiones HTTP relacionadas con géneros bajo la ruta base "/genres".
 * Desarrollado para la materia Laboratorio de Programación de la Licenciatura en Sistemas
 * de la Universidad Nacional de la Patagonia Austral (UNPA).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@Controller
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    /**
     * Muestra la lista de todos los géneros musicales disponibles.
     * 
     * @param model Modelo para pasar datos a la vista
     * @return Vista "genres/list" con la lista de géneros
     */
    @GetMapping
    public String listGenres(Model model) {
        List<Genre> genres = genreService.findAll();
        model.addAttribute("genres", genres);
        return "genres/list";
    }

    /**
     * Muestra el formulario para crear un nuevo género musical.
     * 
     * @param model Modelo que contiene los datos para el formulario
     * @return Vista "genres/form" con el formulario vacío
     */
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("genre", new Genre());
        return "genres/form";
    }

    /**
     * Procesa el envío del formulario para guardar un nuevo género.
     * 
     * @param genre Género a guardar (mapeado desde el formulario)
     * @return Redirección a la lista de géneros después de guardar
     */
    @PostMapping
    public String saveGenre(@ModelAttribute Genre genre) {
        genreService.save(genre);
        return "redirect:/genres";
    }

    /**
     * Muestra el formulario para editar un género existente.
     * 
     * @param id ID del género a editar
     * @param model Modelo que contiene los datos para el formulario
     * @return Vista "genres/form" con los datos del género
     * @throws IllegalArgumentException Si no se encuentra el género con el ID proporcionado
     */
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Genre genre = genreService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid genre ID"));
        model.addAttribute("genre", genre);
        return "genres/form";
    }

    /**
     * Elimina un género específico.
     * 
     * @param id ID del género a eliminar
     * @return Redirección a la lista de géneros después de eliminar
     */
    @GetMapping("/delete/{id}")
    public String deleteGenre(@PathVariable Integer id) {
        genreService.deleteById(id);
        return "redirect:/genres";
    }
}