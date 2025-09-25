package model;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public abstract class Materia {
    private  String codigo;
    private  String nombre;
    private  int horasTeoria;
    private  int creditos;
    private  int semestre;
    private Profesor profesor;
    private List<Estudiante> listaEstudiantes;

    public Materia(String codigo, String nombre, int horasTeoria, int creditos, int semestre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTeoria = horasTeoria;
        this.creditos = creditos;
        this.semestre = semestre;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public abstract int calcularHorasTotales();


    @Override
    public String toString() {
        return String.format("[%s] %s - Sem %d, Créditos %d, Horas teoría %d, Prof: %s",
                codigo, nombre, semestre, creditos, horasTeoria,
                profesor == null ? "(sin asignar)" : profesor.getNombre());
    }

    public void addEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }


    public void removeEstudiante(Estudiante e) {
        listaEstudiantes.remove(e);
    }
}