package Universidad;
import java.util.ArrayList;

public class Profesor {
    private String id; //Identificador único.
    private String nombre; //Nombre completo.
    private String especialidad; //Área principal.
    private ArrayList<Curso> cursos; //Cursos que dicta.

    public Profesor(String id, String nombre, String especialidad) {
        setId(id);
        setNombre( nombre);
        setEspecialidad( especialidad);
        this.cursos = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        try {
            if(id == null || id.trim().isEmpty()){
                throw new IllegalArgumentException("EL id no puede ser un campo vacio");
            }
            this.id = id;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setNombre(String nombre) {
        try {
            if(nombre == null || nombre.trim().isEmpty()){
                throw new IllegalArgumentException("EL nombre no puede ser un campo vacio");
            }
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } 
    }
    public void setEspecialidad(String especialidad) {
        try {
            if(especialidad == null || especialidad.trim().isEmpty()){
                throw new IllegalArgumentException("La especialidad no puede ser un campo vacio");
            }
            this.especialidad = especialidad;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void setCursos(Curso curso) {
            this.cursos.add(curso);
            curso.setProfesor(this);
    }
    public void eliminarCurso(Curso curso){
        try {
            if(!this.cursos.contains(curso)){
                throw new IllegalArgumentException("El profesor: "+this.nombre+", no tiene asignado el curso: "+curso.getNombre());
            }
            this.cursos.remove(curso);
            curso.setProfesor(null);
            System.out.println("Curso eliminado");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    public void mostrarInfo(){
        System.out.println("Profesor: "+ this.nombre+"\nEspecialidad: "+this.especialidad+"\nTotal de cursos: "+totalCursos());
    }
    public int totalCursos(){
        return this.cursos.size();
    }
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad +'}';
    }  
}
