package ar.edu.unpaspotify.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa una playlist de Spotify.
 * @author Nicolas Butterfield
 */
@Entity
@Table(name = "playlist")
@Getter
@Setter
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 5)
    private Integer id;

    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "interprete", length = 40)
    private String interprete;

    @Column(name = "cantidad_temas", length = 3)
    private Integer cantidadTemas;

    @Column(name = "duracion_total", precision = 7, scale = 2)
    private BigDecimal duracionTotal;

    @ManyToOne
    @JoinColumn(name = "genero_id", nullable = false)
    private Genre genre;

    // Constructor vacío
    public Playlist() {}

    // Constructor con campos
    public Playlist(String titulo, String interprete, Integer cantidadTemas, BigDecimal duracionTotal, Genre genre) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.cantidadTemas = cantidadTemas;
        this.duracionTotal = duracionTotal;
        this.genre = genre;
    }
}