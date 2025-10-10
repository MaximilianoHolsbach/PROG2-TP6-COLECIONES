package Biblioteca;
import java.util.ArrayList;
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    public Biblioteca(String nombre) {
        setNombre(nombre);
        this.libros = new ArrayList<>();
    }
    public void setNombre(String nombre) {
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar un nombre vacio");
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
    } 
    public void listarLibros(){
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libroBuscado = null;
        int i = 0;
        while(i < this.libros.size() && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
            i++;
        }
        if(i < this.libros.size()){
            libroBuscado = this.libros.get(i);
        }
        return libroBuscado;
    }
    public Libro eliminarLibro(String isbn){
        Libro libroEliminado = buscarLibroPorIsbn(isbn);
        this.libros.remove(libroEliminado);
        return libroEliminado;
    }
    public int obtenerCantidadLibros(){
        return this.libros.size();
    }
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> librosXanio = new ArrayList<>();
        for (Libro libro : this.libros) {
            if(anio == libro.getAnioPublicacion()){
                librosXanio.add(libro);
            }
        }
        return librosXanio;
    }
    public void mostrarAutoresDisponibles(){
        for (Libro libro : libros) {
            System.out.println("Autores: "+libro.getAutor());
        }
    }
}
