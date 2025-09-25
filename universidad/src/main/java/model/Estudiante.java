package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Estudiante {

    private String nombre;
    private String id;
    private String documentoIdentidad;
    private String programa;
    private int semestre;
    List<Materia> listaMaterias;

    public Estudiante(String id,String nombre, String documentoIdentidad, String programa, int semestre) {
        this.id = Objects.requireNonNull(id,"Error no null");
        this.nombre = Objects.requireNonNull(nombre,"Error no null");
        this.documentoIdentidad = documentoIdentidad;
        this.programa = programa;
        this.semestre = semestre;
        this.listaMaterias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public void addMateria(Materia m) {
        listaMaterias.add(m);
    }
}
