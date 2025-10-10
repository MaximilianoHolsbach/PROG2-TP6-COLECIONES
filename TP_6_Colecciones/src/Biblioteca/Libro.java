package Biblioteca;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
        this.autor = autor;
    }
    public void setIsbn(String isbn) {
        try {
            if(isbn == null || isbn.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar un ID vacio");
            }
            this.isbn = isbn;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setTitulo(String titulo) {
        try {
            if(titulo == null || titulo.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar un ID vacio");
            }
            this.titulo = titulo;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = java.time.Year.now().getValue(); // Obtiene el año actual del sistema
        try {
            if(anioPublicacion < 0 || anioPublicacion > anioActual){
                throw new IllegalArgumentException("No se puede cargar un ID vacio");
            }
            this.anioPublicacion = anioPublicacion;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public String getAutor() {
        return autor.getNombre();
    }
    public void mostrarInfo(){
        System.out.println("Titulo: "+getTitulo()+"\nID: "+getIsbn()+"\nAutor: "+getAutor());
    }
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }  
}
