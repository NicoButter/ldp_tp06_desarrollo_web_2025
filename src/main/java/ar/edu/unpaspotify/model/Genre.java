package ar.edu.unpaspotify.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad que representa un género musical en el sistema Spotify CRUD.
 * <p>
 * Mapea la tabla "generos" en la base de datos y contiene los atributos
 * básicos de un género musical. Desarrollado para la materia Laboratorio 
 * de Programación de la Licenciatura en Sistemas de la Universidad Nacional
 * de la Patagonia Austral (UNPA).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@Entity
@Table(name = "generos")
public class Genre {

    /**
     * Identificador único del género en la base de datos.
     * Se genera automáticamente mediante estrategia de identidad.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 5)
    private Integer id;

    /**
     * Nombre del género musical.
     * <p>
     * Campo obligatorio con longitud máxima de 20 caracteres.
     * </p>
     */
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

    /**
     * Constructor por defecto requerido por JPA.
     */
    public Genre() {}

    /**
     * Constructor con parámetro para crear nuevos géneros.
     * 
     * @param nombre Nombre del género musical
     */
    public Genre(String nombre) {
        this.nombre = nombre;
    }

    // ============= MÉTODOS ACCESORES =============

    /**
     * Establece el ID del género.
     * 
     * @param id Identificador único
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Establece el nombre del género.
     * 
     * @param nombre Nombre del género musical
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del género.
     * 
     * @return Identificador único
     */
    public Integer getId() {
        return id;
    }

    /**
     * Obtiene el nombre del género.
     * 
     * @return Nombre del género musical
     */
    public String getNombre() {
        return nombre;
    }
}