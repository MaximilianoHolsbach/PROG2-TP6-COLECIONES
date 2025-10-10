# Trabajo Práctico 6: Colecciones

---

## Contenido

1. Caso Práctico 1: Sistema Stock  
2. Caso Práctico 2: Biblioteca y Libros  
3. Caso Práctico 3: Universidad, Profesor y Curso (bidireccional 1 a N)

---

## Caso Práctico 1: Sistema Stock

Sistema que gestiona productos en una tienda, utilizando colecciones dinámicas y enumeraciones en Java.

- Clase `CategoriaProducto`: Enum que define categorías como ALIMENTOS, ELECTRONICA, ROPA y HOGAR, con descripciones asociadas.
- Clase `Producto`: Representa un producto con atributos como ID, nombre, precio, cantidad y categoría. Incluye validaciones y métodos de acceso.
- Clase `Inventario`: Administra una colección de productos. Permite agregar, listar, buscar, eliminar, actualizar stock, filtrar por categoría o precio, y obtener estadísticas.
- Clase `Principal`: Simula la interacción con el inventario. Crea productos, los agrega al inventario y ejecuta operaciones como búsqueda, filtrado, eliminación y actualización.

---

## Caso Práctico 2: Biblioteca y Libros

Sistema de gestión de una biblioteca con relación de composición 1 a N entre Biblioteca y Libros.

- Clase `Autor`: Representa un autor con ID, nombre y nacionalidad. Incluye validaciones y métodos de visualización.
- Clase `Libro`: Modela un libro con ISBN, título, año de publicación y autor. Incluye validaciones y métodos de acceso.
- Clase `Biblioteca`: Administra una colección de libros. Permite agregar, listar, buscar, eliminar, filtrar por año y mostrar autores disponibles.
- Clase `Principal`: Crea autores y libros, los agrega a una biblioteca, y ejecuta operaciones como búsqueda por ISBN, eliminación, filtrado por año y listado de autores.

---

## Caso Práctico 3: Universidad, Profesor y Curso (bidireccional 1 a N)

Sistema académico que modela la relación bidireccional entre profesores y cursos, gestionado por una universidad.

- Clase `Curso`: Representa un curso con código, nombre y profesor asignado. Permite establecer y obtener el profesor responsable.
- Clase `Profesor`: Modela un profesor con ID, nombre, especialidad y lista de cursos. Permite agregar y eliminar cursos, listar y mostrar información.
- Clase `Universidad`: Administra profesores y cursos. Permite agregar, eliminar, buscar, asignar profesores a cursos y filtrar cursos por profesor.
- Clase `Principal`: Crea profesores y cursos, los agrega a la universidad, asigna profesores a cursos, y muestra listados y filtrados. También prueba la eliminación de cursos y su impacto en la relación bidireccional.

---
