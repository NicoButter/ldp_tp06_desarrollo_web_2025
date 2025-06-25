package ar.edu.unpaspotify.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entidad que representa una playlist musical en el sistema Spotify CRUD.
 * <p>
 * Mapea la tabla "playlist" en la base de datos y contiene los atributos
 * básicos de una lista de reproducción. Desarrollado para la materia Laboratorio 
 * de Programación de la Licenciatura en Sistemas de la Universidad Nacional
 * de la Patagonia Austral (UNPA).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@Entity
@Table(name = "playlist")
public class Playlist {

    /**
     * ID único de la playlist generado automáticamente.
     * Estrategia: Generación por identidad de base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 5)
    private Integer id;

    /**
     * Título de la playlist (obligatorio, máximo 50 caracteres).
     */
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    /**
     * Intérprete o creador principal de la playlist (máximo 40 caracteres).
     */
    @Column(name = "interprete", length = 40)
    private String interprete;

    /**
     * Cantidad de temas que contiene la playlist (máximo 3 dígitos).
     */
    @Column(name = "cantidad_temas", length = 3)
    private Integer cantidadTemas;

    /**
     * Duración total en horas con precisión decimal (formato 7,2).
     * Ejemplo: 3.50 representa 3 horas y 30 minutos.
     */
    @Column(name = "duracion_total", precision = 7, scale = 2)
    private BigDecimal duracionTotal;

    /**
     * Género musical principal asociado a la playlist (relación ManyToOne).
     * Campo obligatorio que referencia a la tabla de géneros.
     */
    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false)
    private Genre genre;

    /**
     * Constructor por defecto requerido por JPA.
     */
    public Playlist() {}

    /**
     * Constructor completo para crear nuevas playlists.
     * 
     * @param titulo Título de la playlist (no nulo)
     * @param interprete Artista/creador principal
     * @param cantidadTemas Número de canciones incluidas
     * @param duracionTotal Duración total en horas decimales
     * @param genre Género musical asociado (no nulo)
     */
    public Playlist(String titulo, String interprete, Integer cantidadTemas, 
                   BigDecimal duracionTotal, Genre genre) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.cantidadTemas = cantidadTemas;
        this.duracionTotal = duracionTotal;
        this.genre = genre;
    }

    // ============ MÉTODOS ACCESORES ============

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public Integer getCantidadTemas() {
        return cantidadTemas;
    }

    public void setCantidadTemas(Integer cantidadTemas) {
        this.cantidadTemas = cantidadTemas;
    }

    public BigDecimal getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(BigDecimal duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}