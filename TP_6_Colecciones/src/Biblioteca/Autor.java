package Biblioteca;
public class Autor {
    private String id; 
    private String nombre; 
    private String nacionalidad;
    public Autor(String id, String nombre, String nacionalidad) {
        setId(id);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }
    public void setId(String id) {
        try {
            if(id == null || id.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar un ID vacio");
            }
            this.id = id;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setNombre(String nombre) {
        try {
            if(id == null || id.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar un nombre vacio");
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setNacionalidad(String nacionalidad) {
        try {
            if(id == null || id.trim().isEmpty()){
                throw new IllegalArgumentException("No se puede cargar una nacionalidad vacia");
            }
            this.nacionalidad = nacionalidad;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void mostrarInfo(){
        System.out.println("Autor: "+getNombre()+"\nID: "+getId()+"\nNacionalidad: "+getNacionalidad());
    }
    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    } 
}
