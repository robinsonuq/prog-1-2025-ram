package model;

public class MateriaPractica extends Materia {
    private final int horasPractica;
    private final int numeroLaboratorios;

    public MateriaPractica(String codigo, String nombre, int horasTeoria, int creditos, int semestre, Profesor profesor, int horasPractica, int numeroLaboratorios) {
        super(codigo, nombre, horasTeoria, creditos, semestre, profesor);
        this.horasPractica = horasPractica;
        this.numeroLaboratorios = numeroLaboratorios;
    }
    @Override
    public int calcularHorasTotales() {
        return getHorasTeoria() + horasPractica;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Horas práctica %d, Labs %d", horasPractica, numeroLaboratorios);
    }
}