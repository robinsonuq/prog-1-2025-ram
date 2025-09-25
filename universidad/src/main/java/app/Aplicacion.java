package app;
import model.Estudiante;
import model.*;


public class Aplicacion {

    public static void main(String[] args) {

            Programa programa = new Programa("Sistemas");

            // crear profesores
            ProfesorPlanta p1 = new ProfesorPlanta("P001", "Ana Gómez", "PhD en Sistemas", 12, TipoDedicacionDocente.TIEMPO_COMPLETO, true);
            ProfesorCatedra p2 = new ProfesorCatedra("P002", "Carlos Ruiz", "Magíster en Ingeniería", 5, 8, true);

            System.out.println(programa.registrarProfesor(p1));
            System.out.println(programa.registrarProfesor(p2));
            System.out.println(programa.registrarProfesor(p2)); // duplicado

            // crear materias
            MateriaTeorica m1 = new MateriaTeorica("MAT101", "Matemáticas I", 4, 3, 1, null);
            MateriaPractica m2 = new MateriaPractica("INF201", "Laboratorio de Programación", 3, 2, 2, null, 2, 10);

            System.out.println(programa.registrarMateria(m1));
            System.out.println(programa.registrarMateria(m2));

            // asignar profesor
            System.out.println(programa.asignarProfesorAMateria("P001", "MAT101"));
            System.out.println(programa.asignarProfesorAMateria("P002", "INF201"));

            // crear estudiantes


            EstudiantePregrado s1 = new EstudiantePregrado("S001", "María López", "12345678", "Sistemas",2, true,  4.2);
            EstudiantePosgrado s2 = new EstudiantePosgrado("S002", "Diego Pérez", "87654321", "Sistemas", 3,"IA", TipoPostgrado.DOCTORADO);

            System.out.println(programa.registrarEstudiante(s1));
            System.out.println(programa.registrarEstudiante(s2));

            // inscripciones
            System.out.println(programa.inscribirEstudianteEnMateria("S001", "MAT101"));
            System.out.println(programa.inscribirEstudianteEnMateria("S001", "INF201"));
            System.out.println(programa.inscribirEstudianteEnMateria("S002", "INF201"));

            // consultas
            System.out.println("\nMaterias semestre 1:");
            programa.materiasPorSemestre(1).forEach(System.out::println);

            System.out.println("\nEstudiantes en INF201:");
            programa.listarEstudiantesPorMateria("INF201").forEach(System.out::println);

            System.out.println("\nHoras semanales INF201: " + programa.horasSemanalesMateria("INF201"));
            //System.out.println("Créditos totales S001 en su semestre: " + programa.creditosTotalesEstudianteEnSemestre("S001"));

            System.out.println("\nMaterias dictadas por " + p1.getNombre() + ":");
            p1.getListaMaterias().forEach(System.out::println);
        }
    }

