package model;

public class EstudiantePregrado extends Estudiante {
    private  boolean beca;
    private  double promedio;

    public EstudiantePregrado(String id,String nombre, String documentoIdentidad, String programa, int semestre, boolean beca, double promedio) {
        super( id,nombre, documentoIdentidad, programa, semestre);
        this.beca = beca;
        this.promedio = promedio;
    }

    public boolean isBeca() {
        return beca;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}