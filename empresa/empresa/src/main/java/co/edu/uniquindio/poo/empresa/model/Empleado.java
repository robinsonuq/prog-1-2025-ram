package co.edu.uniquindio.poo.empresa.model;

import java.util.Objects;

public class Empleado {

    private String cedula;
    private String nombre;
    private Usuario usuario;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(cedula, empleado.cedula) && Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean validarUsuario(String userName,String contrasenia) {

        return usuario.validar(userName,contrasenia);

    }
}
