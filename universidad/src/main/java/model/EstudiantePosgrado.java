package model;

public class EstudiantePosgrado extends Estudiante {

    private String temaInvestigacion;
    private TipoPostgrado tipoPostgrado;

    public EstudiantePosgrado(String id,String nombre, String documentoIdentidad, String programa, int semestre, String temaInvestigacion, TipoPostgrado tipoPostgrado) {
        super(id,nombre, documentoIdentidad, programa, semestre);
        this.temaInvestigacion = temaInvestigacion;
        this.tipoPostgrado = tipoPostgrado;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public TipoPostgrado getTipoPostgrado() {
        return tipoPostgrado;
    }

    public void setTipoPostgrado(TipoPostgrado tipoPostgrado) {
        this.tipoPostgrado = tipoPostgrado;
    }
}