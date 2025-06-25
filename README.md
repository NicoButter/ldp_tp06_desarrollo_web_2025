
<p align="center">
  <img src="img/logo_UNPA.png" alt="Logo UNPA" height="120">
</p>

<h1 align="center">Trabajo Práctico N°6 - Laboratorio de Programación - 2025</h1>
<h3 align="center">Licenciatura en Sistemas - Universidad Nacional de la Patagonia Austral</h3>

---

## 🎧 CRUD de Playlists de Spotify

Este proyecto consiste en el desarrollo de una aplicación web basada en **Spring Boot** que permite realizar operaciones CRUD (crear, leer, actualizar, eliminar) sobre playlists al estilo Spotify.

Forma parte del **Trabajo Práctico N°6** de la materia *Laboratorio de Programación* de la **Licenciatura en Sistemas** en la **UNPA (Universidad Nacional de la Patagonia Austral)**.

---

## 🧠 Tema de estudio

> Desarrollo de un CRUD de playlists musicales, permitiendo al usuario crear su biblioteca de listas, editarlas, eliminarlas y explorarlas. Cada playlist contiene nombre, descripción, imagen representativa, y listado de canciones.

---

## ⚙️ Tecnologías utilizadas

- 💻 **Spring Boot**
- 🐘 **PostgreSQL**
- 🎨 **HTML + CSS**
- 🧠 **Thymeleaf**
- 💾 **JPA / Hibernate**
- 🧰 **Visual Studio Code**
- 🐧 **OpenSUSE Tumbleweed**
- 🌐 **Java 17+**

---

## 📦 Estructura del proyecto

- `src/main/java`: Código fuente Java (controladores, servicios, modelos, repositorios)
- `src/main/resources/templates`: Vistas HTML con Thymeleaf
- `src/main/resources/application.properties`: Configuraciones del proyecto
- `static`: Archivos estáticos (CSS, JS, imágenes)

```
📁 src
└── 📁 main
├── 📁 java
│ └── 📁 ar.edu.unpaspotify
│ ├── 📁 controller
│ │    ├── GenreController.java
│ │    └── PlaylistController.java
│ ├── 📁 model
│ │    ├── Genre.java
│ │    └── Playlist.java
│ ├── 📁 repository
│ │    ├── GenreRepository.java
│ │    └── PlaylistRepository.java
│ ├── 📁 service
│ │    ├── GenreService.java
│ │    └── PlaylistService.java
│ └── SpotifyCrudApplication.java
└── 📁 resources
├── application.properties
├── 📁 static
│   ├── 📁 css
│   ├── 📁 img
│   └── 📁 video
└── 📁 templates
├── 📁 fragments
│   └── layout.html
├── 📁 genres
│   ├── form.html
│   └── list.html
├── index.html
└── 📁 playlists
├── form.html
└── list.html

```
---

## 🚀 ¿Cómo correr el proyecto?

1. Cloná este repositorio:

   ```bash
   git clone https://github.com/nicobutter/tp6-crud-playlists.git
   cd tp6-crud-playlists
   ```

2. Configurá tu base de datos PostgreSQL:

   ```sql
   CREATE DATABASE spotify_crud;
   ```

3. Modificá `application.properties` con tus credenciales de DB si hace falta.

4. Corré la app:

   ```bash
   ./mvnw spring-boot:run
   ```

5. Accedé desde tu navegador en:

   ```
   http://localhost:8080
   ```

---

## 👤 Autor

- **Nicolás Butterfield**
- ✉️ nicobutter@gmail.com
- 🖥️ Desarrollado en un Victus D16 con OpenSUSE Tumbleweed

---

## 📄 Licencia

Este proyecto está licenciado bajo la [Licencia MIT](https://opensource.org/licenses/MIT).

---

## 🕹️ Bonus Track

<p align="center">
  <img src="img/Javik.png" alt="Epic Gamer Quote" width="500"><br>
  <strong>"Stand in the ashes of a trillion dead souls and ask the ghosts if honor matters. The silence is your answer."</strong><br>
  <em>– Javik, Mass Effect 3</em>
</p>
