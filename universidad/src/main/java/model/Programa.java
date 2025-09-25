package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record Programa(String nombre, int creditos,
                       List<Profesor> listaProfesores,
                       List<Materia> listaMaterias,
                       List<Estudiante> listaEstudiantes) {


    /**
     * Constructor
     *
     * @param nombre
     */
    public Programa(String nombre) {
        this(nombre, 0,
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    //--------------------CRUD ESTUDIANTE

    public String registrarEstudiante(Estudiante estudiante) {
        String resultado = "";

        Optional<Estudiante> estudianteEncontrado = buscarEstudiante(estudiante.getId());
        if (estudianteEncontrado.isEmpty()) {
            listaEstudiantes.add(estudiante);
            resultado = "El estudiante fue resgitrado exitosamente";
        } else {
            resultado = "El estudiante " + estudianteEncontrado.get().toString() + " ya existe";
        }

        return resultado;
    }

    private Optional<Estudiante> buscarEstudiante(String id) {
        return listaEstudiantes.stream().filter(estudiante -> estudiante.getId().equals(id)).findFirst();

    }
    public boolean eliminarEstudiante(String id) {
        Optional<Estudiante> opt = buscarEstudiante(id);
        if (opt.isEmpty()) return false;
        Estudiante e = opt.get();
        // quitar inscripciones de materias
        e.getListaMaterias().forEach(m -> m.removeEstudiante(e));
        e.getListaMaterias().clear();
        return listaEstudiantes.removeIf(st -> st.getId().equals(id));
    }

    public String actualizarEstudiante(String nombre, String documentoIdentidad, String programa, int semestre) {

        Optional<Estudiante> opt = buscarEstudiante(documentoIdentidad);
        if (opt.isEmpty()) return "No existe el estudiante";

        Estudiante e = opt.get();
        if (nombre != null && !nombre.isBlank()) {
            e.setNombre(nombre);
        }
        if (programa != null && !programa.isBlank()) {
            e.setPrograma(programa);
        }
        if (semestre > 0) {
            e.setSemestre(semestre);
        }
        return "Estudiante actualizado";
    }
    //------------------------------------------------

//--------------------CRUD MATERIA

    public String registrarMateria(Materia materia) {
        Optional<Materia> materiaEncontrada = buscarMateria(materia.getCodigo());
        if (materiaEncontrada.isEmpty()) {
            listaMaterias.add(materia);
            return "La materia fue registrada exitosamente";
        } else {
            return "La materia " + materiaEncontrada.get().toString() + " ya existe";
        }
    }

    private Optional<Materia> buscarMateria(String codigo) {
        return listaMaterias.stream()
                .filter(m -> m.getCodigo().equals(codigo))
                .findFirst();
    }

    public boolean eliminarMateria(String codigo) {
        return listaMaterias.removeIf(m -> m.getCodigo().equals(codigo));
    }

//------------------------------------------------
//--------------------CRUD PROFESOR
    public String registrarProfesor(Profesor profesor) {
        Optional<Profesor> profesorEncontrado = buscarProfesor(profesor.getId());
        if (profesorEncontrado.isEmpty()) {
            listaProfesores.add(profesor);
            return "El profesor fue registrado exitosamente";
        } else {
            return "El profesor " + profesorEncontrado.get().toString() + " ya existe";
        }
    }

    private Optional<Profesor> buscarProfesor(String id) {
        return listaProfesores.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public boolean eliminarProfesor(String id) {
        return listaProfesores.removeIf(p -> p.getId().equals(id));
    }

    /**
     * Actualiza los datos de un profesor según su tipo.
     * - ProfesorPlanta: puede actualizar dedicación y proyectos de investigación.
     * - ProfesorCatedra: puede actualizar horas contratadas y empresa externa.
     */
    public String actualizarProfesor(String id,
                                     String nombre,
                                     String tituloAcademico,
                                     Integer aniosExperiencia,
                                     TipoDedicacionDocente dedicacion,
                                     boolean proyectosInvestigacion,
                                     Integer horasContratadas,
                                     boolean empresaExterna) {

        Optional<Profesor> opt = buscarProfesor(id);
        if (opt.isEmpty()) return "No existe el profesor";

        Profesor p = opt.get();

        // Atributos comunes
        if (nombre != null && !nombre.isBlank()) {
            p.setNombre(nombre);
        }
        if (tituloAcademico != null && !tituloAcademico.isBlank()) {
            p.setTituloAcademico(tituloAcademico);
        }
        if (aniosExperiencia != null && aniosExperiencia >= 0) {
            p.setAniosExperiencia(aniosExperiencia);
        }

        // Atributos específicos
        if (p instanceof ProfesorPlanta planta) {
            if (dedicacion != null) {
                planta.setDedicacion(dedicacion);
            }

            planta.setParticipaInvestigacion(proyectosInvestigacion);

        } else if (p instanceof ProfesorCatedra catedra) {
            if (horasContratadas != null && horasContratadas > 0) {
                catedra.setHorasContratadas(horasContratadas);
            }

            catedra.setTrababaEmpresaExterna(empresaExterna);

        }
    return "Profesor actualizado";
    //------------------------------------------------
    }



    /**
     * Actualiza atributos del estudiante (nombre, documento, programa, semestre).
     * Para estudiantes de pregrado/posgrado se pueden crear métodos polimórficos extra si es necesario.
     */
    public String actualizarEstudiante(String id,
                                       String nombre,
                                       String documentoIdentidad,
                                       String programa,
                                       Integer semestre,
                                       boolean beca,
                                       Double promedio,
                                       String temaInvestigacion) {
        Optional<Estudiante> opt = buscarEstudiante(id);
        if (opt.isEmpty()) return "No existe el estudiante con id " + id;
        Estudiante e = opt.get();

        if (nombre != null && !nombre.isBlank()) e.setNombre(nombre);
        if (documentoIdentidad != null && !documentoIdentidad.isBlank()) e.setDocumentoIdentidad(documentoIdentidad);
        if (programa != null && !programa.isBlank()) e.setPrograma(programa);
        if (semestre != null && semestre > 0) e.setSemestre(semestre);

        if (e instanceof EstudiantePregrado pre) {
             pre.setBeca(beca);
            if (promedio != null) pre.setPromedio(promedio);
        } else if (e instanceof EstudiantePosgrado pos) {
            if (temaInvestigacion != null && !temaInvestigacion.isBlank()) pos.setTemaInvestigacion(temaInvestigacion);
        }

        return "Estudiante actualizado";
    }
    /**
     * Consultar todas las materias de un semestre específico.
     */
    public List<Materia> materiasPorSemestre(int semestre) {
        return listaMaterias.stream()
                .filter(m -> m.getSemestre() == semestre)
                .collect(Collectors.toList());
    }
    /**
     * Asociar un profesor a una materia (por ids).
     * - Asigna la referencia en la materia.
     * - Añade la materia a la lista del profesor (si no está ya).
     */
    public String asignarProfesorAMateria(String idProfesor, String codigoMateria) {
        Optional<Profesor> op = buscarProfesor(idProfesor);
        if (op.isEmpty()) return "No existe profesor con id " + idProfesor;
        Optional<Materia> om = buscarMateria(codigoMateria);
        if (om.isEmpty()) return "No existe materia con código " + codigoMateria;

        Profesor p = op.get();
        Materia m = om.get();

        // si la materia ya tiene profesor distinto, quitar asociación previa
        if (m.getProfesor() != null && !m.getProfesor().getId().equals(p.getId())) {
            m.getProfesor().removeMateria(m);
        }

        m.setProfesor(p);
        if (!p.getListaMaterias().contains(m)) p.agregarMateria(m);

        return "Profesor asignado a la materia correctamente";
    }


    /**
     * Inscribir estudiante en materia (bidireccional: materia agrega estudiante y estudiante agrega materia).
     * Verifica existencia y evita duplicados.
     */
    public String inscribirEstudianteEnMateria(String idEstudiante, String codigoMateria) {
        Optional<Estudiante> oe = buscarEstudiante(idEstudiante);
        if (oe.isEmpty()) return "No existe estudiante con id " + idEstudiante;
        Optional<Materia> om = buscarMateria(codigoMateria);
        if (om.isEmpty()) return "No existe materia con código " + codigoMateria;

        Estudiante e = oe.get();
        Materia m = om.get();

        if (m.getListaEstudiantes().contains(e)) return "El estudiante ya está inscrito en la materia";

        m.addEstudiante(e);
        e.addMateria(m);

        return "Inscripción realizada correctamente";
    }

    /**
     * Listar estudiantes matriculados en una asignatura determinada.
     */
    public List<Estudiante> listarEstudiantesPorMateria(String codigoMateria) {
        Optional<Materia> om = buscarMateria(codigoMateria);
        if (om.isEmpty()) return Collections.emptyList();
        return new ArrayList<>(om.get().getListaEstudiantes()); // devolver copia para seguridad
    }

    /**
     * Calcular el total de horas semanales de una materia (suma teoría + práctica si aplica).
     */
    public int horasSemanalesMateria(String codigoMateria) {
        Optional<Materia> om = buscarMateria(codigoMateria);
        return om.map(Materia::calcularHorasTotales).orElse(0);
    }


}


