package Universidad;
import Universidad.Curso;
import Universidad.Profesor;
import java.util.ArrayList;
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public Curso buscarCursoPorCodigo(String codigo){
        int i = 0;
        Curso buscarXcodigo = null;
        while(i < cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
            i++;
        }
        if(i < cursos.size()){
            buscarXcodigo = cursos.get(i);
        }
        return buscarXcodigo;
    }
    public Profesor buscarProfesorPorCodigo(String codigo){
        int i = 0;
        Profesor buscarXcodigo = null;
        while(i < profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(codigo)){
            i++;
        }
        if(i < profesores.size()){
            buscarXcodigo = profesores.get(i);
        }
        return buscarXcodigo;
    }
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }
    public void listarCursos(){
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso cursoXasignar = buscarCursoPorCodigo(codigoCurso);
        Profesor profesorXasignar = buscarProfesorPorCodigo(idProfesor);
        try {
            if(cursoXasignar == null || profesorXasignar == null){
                throw new IllegalArgumentException("Controlar los codigos ingresados no son correctos\nCurso: "+cursoXasignar+"\nProfesor: "+profesorXasignar);
            }else{
                profesorXasignar.setCursos(cursoXasignar);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void eliminarCurso(String codigo){
        Curso cursoBuscado = buscarCursoPorCodigo(codigo);
        this.cursos.remove(cursoBuscado);
    }
    public void eliminarProfesor(String codigo){
        Profesor profesorBuscado = buscarProfesorPorCodigo(codigo);
        for (Curso curso : cursos) {
            if(curso.getProfesor()==profesorBuscado){
                curso.setProfesor(null);
            }
        }
        this.profesores.remove(profesorBuscado);
    }
    public ArrayList<Curso> filtrarCursoXprof(String idProfesor){
        ArrayList<Curso> listaFiltrada = new ArrayList<>();
        Profesor profesorXasignar = buscarProfesorPorCodigo(idProfesor);
        for (Curso curso : cursos) {
            if(curso.getProfesor() == profesorXasignar){
                listaFiltrada.add(curso);
            }
        }
        return listaFiltrada;
    }
}
