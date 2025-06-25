package ar.edu.unpaspotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unpaspotify.model.Playlist;

/**
 * Repositorio para operaciones de persistencia de la entidad Playlist.
 * <p>
 * Extiende {@link org.springframework.data.jpa.repository.JpaRepository} para proveer
 * automáticamente todas las operaciones CRUD básicas. Desarrollado para la materia
 * Laboratorio de Programación de la Licenciatura en Sistemas de la Universidad Nacional
 * de la Patagonia Austral (UNPA).
 * </p>
 * 
 * <p>
 * Incluye operaciones estándar como:
 * <ul>
 *   <li>Guardar/actualizar playlists</li>
 *   <li>Buscar por ID</li>
 *   <li>Listar todas las playlists</li>
 *   <li>Eliminar playlists</li>
 * </ul>
 * </p>
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * @author Nicolás Butterfield
 * @version 1.0
 * @since 2025
 */
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    
    /**
     * Ejemplo de método personalizado (descomentar cuando sea necesario):
     * Busca playlists por título (coincidencia exacta)
     * 
     * @param titulo Título exacto a buscar
     * @return Lista de playlists que coinciden
     */
    // List<Playlist> findByTitulo(String titulo);
    
    /**
     * Ejemplo de query JPQL personalizada (descomentar cuando sea necesario):
     * 
     * @Query("SELECT p FROM Playlist p WHERE p.duracionTotal > :minDuracion")
     * List<Playlist> buscarPorDuracionMinima(
     *     @Param("minDuracion") BigDecimal minDuracion);
     */
}