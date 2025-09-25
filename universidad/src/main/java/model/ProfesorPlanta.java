package model;

public class ProfesorPlanta extends Profesor {

    private  TipoDedicacionDocente dedicacion;
    private  boolean participaInvestigacion;


    public ProfesorPlanta(String id, String nombre, String titulo,
                          int aniosExperiencia, TipoDedicacionDocente dedicacion,
                          boolean participaInvestigacion) {

        super(id, nombre, titulo, aniosExperiencia);
        this.dedicacion = dedicacion;
        this.participaInvestigacion = participaInvestigacion;
    }

    public TipoDedicacionDocente getDedicacion() {
        return dedicacion;
    }

    public boolean isParticipaInvestigacion() {
        return participaInvestigacion;
    }

    public void setDedicacion(TipoDedicacionDocente dedicacion) {
        this.dedicacion = dedicacion;
    }

    public void setParticipaInvestigacion(boolean participaInvestigacion) {
        this.participaInvestigacion = participaInvestigacion;
    }

    @Override
    public String toString() { return super.toString() + " - " + dedicacion + " - Investigación: " + (participaInvestigacion?"sí":"no"); }
}