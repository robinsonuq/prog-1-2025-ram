package model;

public class Estudiante {

    private String nombres;
    private String apellidos;
    private String numeroIdentificacion;
    private String correo;
    private byte edad;
    private String telefono;
    private double[] notas;


    public Estudiante(String nombres, String apellidos, String numeroIdentificacion,
                      String correo, byte edad, String telefono) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
        this.notas = new double[5];

    }

    public String getNombres(){
        return nombres;
    }

    public void setNombres(String nuevoNombres){
        this.nombres = nuevoNombres;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public boolean isMejor(){
        if(edad <18 && notafinal > 4.5 && estrato == 1){
            return true
        }
    }
}
