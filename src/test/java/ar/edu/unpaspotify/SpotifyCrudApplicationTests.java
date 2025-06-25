package ar.edu.unpaspotify;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Clase de pruebas para verificar que el contexto de la aplicación se carga correctamente.
 * <p>
 * Esta prueba asegura que la configuración de Spring Boot se inicializa sin errores,
 * lo cual es fundamental para validar que la estructura básica de la aplicación funciona.
 * </p>
 *
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
@SpringBootTest
class SpotifyCrudApplicationTests {

    /**
     * Verifica que el contexto de Spring se cargue correctamente.
     * <p>
     * Este test pasa si la aplicación puede crear el contexto Spring sin errores.
     * No realiza aserciones explícitas ya que el éxito del arranque del contexto
     * implica que las configuraciones básicas son correctas.
     * </p>
     */
    @Test
    void contextLoads() {
    }

}