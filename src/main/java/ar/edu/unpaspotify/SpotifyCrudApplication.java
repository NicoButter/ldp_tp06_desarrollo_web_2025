package ar.edu.unpaspotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Spring Boot para el caso de estudio asignado -> CRUD de Playlists de Spotify.
 * <p>
 * Desarrollo para la materia Laboratorio de Programación de la Licenciatura en Sistemas
 * de la Universidad Nacional de la Patagonia Austral.
 * </p>
 * 
 * <p>
 * Esta clase inicia el contexto de Spring y configura la aplicación automáticamente
 * mediante la anotación @SpringBootApplication (que combina @Configuration,
 * @EnableAutoConfiguration y @ComponentScan).
 * </p>
 * 
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@SpringBootApplication
public class SpotifyCrudApplication {

    /**
     * Punto de entrada principal para la aplicación Spring Boot.
     * 
     * @param args Argumentos de línea de comandos (no utilizados en esta implementación)
     */
    public static void main(String[] args) {
        SpringApplication.run(SpotifyCrudApplication.class, args);
    }

}