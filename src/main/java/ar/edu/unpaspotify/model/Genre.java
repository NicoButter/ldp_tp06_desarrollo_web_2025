package ar.edu.unpaspotify.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entidad que representa un género musical.
 * @author Nicolas Butterfield
 */
@Entity
@Table(name = "generos")
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}