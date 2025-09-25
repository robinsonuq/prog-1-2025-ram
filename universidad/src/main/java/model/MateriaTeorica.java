package model;

public class MateriaTeorica extends Materia {
    public MateriaTeorica(String codigo, String nombre, int horasTeoria, int creditos, int semestre, Profesor profesor) {
        super(codigo, nombre, horasTeoria, creditos, semestre, profesor);
    }

    @Override
    public int calcularHorasTotales() {
        return getHorasTeoria();
    }
}