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
 * Entidad que representa una playlist de Spotify.
 * @author Nicolas Butterfield
 */
@Entity
@Table(name = "playlist")
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

    // Getters y Setters manuales
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