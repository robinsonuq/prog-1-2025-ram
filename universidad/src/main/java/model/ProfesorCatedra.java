package model;

public class ProfesorCatedra extends Profesor {

    private int horasContratadas;
    private boolean trababaEmpresaExterna;


    public ProfesorCatedra(String id, String nombre, String titulo, int aniosExperiencia, int horasContratadas, boolean trababaEmpresaExterna) {
        super(id, nombre, titulo, aniosExperiencia);
        this.horasContratadas = horasContratadas;
        this.trababaEmpresaExterna = trababaEmpresaExterna;
    }

    public boolean isTrababaEmpresaExterna() {
        return trababaEmpresaExterna;
    }

    public void setHorasContratadas(int horasContratadas) {
        this.horasContratadas = horasContratadas;
    }

    public void setTrababaEmpresaExterna(boolean trababaEmpresaExterna) {
        this.trababaEmpresaExterna = trababaEmpresaExterna;
    }

    public int getHorasContratadas() { return horasContratadas; }


    @Override
    public String toString() { return super.toString() + " - Horas contrato: " + horasContratadas; }
}