package Biblioteca;
import java.util.ArrayList;
public class Principal {
    public static void main(String[]args){
        ArrayList<Libro> filtradoXanio;
        //Creamos autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Haruki Murakami", "Japonesa");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        Autor autor4 = new Autor("A004", "Jorge Luis Borges", "Argentina");
        Autor autor5 = new Autor("A005", "Jane Austen", "Británica");
        Autor autor6 = new Autor("A006", "Chinua Achebe", "Nigeriana");
        //Creamos Libros
        /*
        "ISBN001", "Cien años de soledad", 1967, autor1;
        "ISBN002", "Tokio Blues", 1987, autor2;
        "ISBN003", "La casa de los espíritus", 1982, autor3;
        "ISBN004", "Ficciones", 1944, autor4;
        "ISBN005", "Orgullo y prejuicio", 1813, autor5;
        "ISBN006", "Todo se desmorona", 1958, autor6;
        */
        //Creamos una biblioteca nueva
        Biblioteca biblioteca1 = new Biblioteca("Herrera");
        //Agregamos los libros a la biblioteca
        biblioteca1.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca1.agregarLibro("ISBN002", "Tokio Blues", 1982, autor2);
        biblioteca1.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor3);
        biblioteca1.agregarLibro("ISBN004", "Ficciones", 1944, autor4);
        biblioteca1.agregarLibro("ISBN005", "Orgullo y prejuicio", 1813, autor5);
        biblioteca1.agregarLibro("ISBN006", "Todo se desmorona", 1958, autor6);
        //Listamos los libros agregados a la biblioteca
        System.out.println("Listamos los libros");
        biblioteca1.listarLibros();
        System.out.println("Buscamos libro por isbn");
        //Buscamos libro por isbn
        System.out.println(biblioteca1.buscarLibroPorIsbn("ISBN003"));
        //Eliminamos libro por isbn
        System.out.println("Eliminamos libro por isbn: ISBN005");
        biblioteca1.eliminarLibro("ISBN005");
        System.out.println("Recorremos los libros para probar");
        //Recorremos los libros para probar
        biblioteca1.listarLibros();
        System.out.println("Filtramos los libros por año");
        //Filtramos los libros por año
        filtradoXanio = biblioteca1.filtrarLibrosPorAnio(1982);
        for (Libro libro : filtradoXanio) {
            libro.mostrarInfo();
        }
        System.out.println("Mostramos autores disponibles");
        //Mostramos autores disponibles
        biblioteca1.mostrarAutoresDisponibles();
    }
}
