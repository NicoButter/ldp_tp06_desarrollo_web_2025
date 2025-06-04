package ar.edu.unpaspotify.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad que representa un género musical.
 * @author Nicolas Butterfield
 */
@Entity
@Table(name = "generos")
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 5)
    private Integer id;

    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

    // Constructor vacío
    public Genre() {}

    // Constructor con campos
    public Genre(String nombre) {
        this.nombre = nombre;
    }
}