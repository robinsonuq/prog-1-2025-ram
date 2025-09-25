package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Profesor {
    private  String id;
    private  String nombre;
    private String tituloAcademico;
    private  int aniosExperiencia;
    private  List<Materia> listaMaterias = new ArrayList<>();


    public Profesor(String id, String nombre,String tituloAcademico, int aniosExperiencia) {
        this.id = Objects.requireNonNull(id);
        this.nombre = Objects.requireNonNull(nombre);
        this.tituloAcademico = Objects.requireNonNull(tituloAcademico);
        if (aniosExperiencia < 0) {
            throw new IllegalArgumentException("Los años de experiencia no pueden ser negativos");
        }else {
            this.aniosExperiencia = aniosExperiencia;
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }


    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public void agregarMateria(Materia m) {
        listaMaterias.add(m);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tituloAcademico='" + tituloAcademico + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", listaMaterias=" + listaMaterias +
                '}';
    }

    public void removeMateria(Materia materia) {
        listaMaterias.remove(materia);
    }
}