package Universidad;

import java.util.ArrayList;

public class Principal {
    public static void main(String[]args){
        //Creamos los cursos y los profesores
        Curso c1 = new Curso("INF101", "Introducción a la Informática");
        Curso c2 = new Curso("MAT202", "Álgebra Lineal");
        Curso c3 = new Curso("PROG301", "Programación Orientada a Objetos");
        Curso c4 = new Curso("BD401", "Bases de Datos Relacionales");
        Curso c5 = new Curso("EST502", "Estadística Aplicada");
        Curso c6 = new Curso("AGIL601", "Metodologías Ágiles y Scrum");
        Profesor p1 = new Profesor("P001", "Laura Méndez", "Bases de Datos");
        Profesor p2 = new Profesor("P002", "Carlos Ramírez", "Programación Orientada a Objetos");
        Profesor p3 = new Profesor("P003", "Sofía Torres", "Estadística Aplicada");
        Profesor p4 = new Profesor("P004", "Martín González", "Álgebra Lineal");
        Profesor p5 = new Profesor("P005", "Valeria Suárez", "Metodologías Ágiles");
        Profesor p6 = new Profesor("P006", "Julián Herrera", "Introducción a la Informática");
        //Creamos la universidad
        Universidad u1 = new Universidad("UTN-RESISTENCIA");
        //Agregarmos profesores a la entidad educativa
        u1.agregarProfesor(p1);
        u1.agregarProfesor(p2);
        u1.agregarProfesor(p3);
        u1.agregarProfesor(p6);
        //Agregamos cursos a la curricula de la universidad
        u1.agregarCurso(c1);
        u1.agregarCurso(c2);
        u1.agregarCurso(c3);
        u1.agregarCurso(c4);
        u1.agregarCurso(c5);
        u1.agregarCurso(c6);
        //Listamos los cursos y los profesores disponibles en la Universidad
        u1.listarProfesores();
        u1.listarCursos();
        //Conectamos profesores y asignaturas
        u1.asignarProfesorACurso("INF101", "P001");
        u1.asignarProfesorACurso("MAT202", "P002");
        u1.asignarProfesorACurso("PROG301", "P001");
        u1.asignarProfesorACurso("BD401", "P003");
        u1.asignarProfesorACurso("EST502", "P001");
        u1.asignarProfesorACurso("AGIL601", "P006");
        System.out.println("");
        //Listamos los cursos por profesor
        System.out.println("Filtramos los cursos id del profesor ejemplo: P001");
        ArrayList<Curso> listaCursoXprofe = u1.filtrarCursoXprof("P001");
        for (Curso curso : listaCursoXprofe) {
            System.out.println(curso);
        }
        //Eliminamos el PROG301 que esta asignado al profesor P001
        u1.eliminarCurso("PROG301");
        //Listamos los cursos por profesor para probar que el profesor P001, ya no tiene asignado el curso PROG301
        System.out.println("Se observa que el curso PROG301 ya no esta asignado al prof P001");
        listaCursoXprofe = u1.filtrarCursoXprof("P001");
        for (Curso curso : listaCursoXprofe) {
            System.out.println(curso);
        }
    }
}