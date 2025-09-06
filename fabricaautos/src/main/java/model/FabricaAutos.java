package model;

import java.util.ArrayList;

/**
 * Representa una fábrica de automóviles.
 * Contiene información de identificación como nombre, dirección, teléfono y NIT,
 * así como las listas de automóviles fabricados, empleados y ventas realizadas.
 *
 * Esta clase actúa como el centro de la relación entre autos, empleados y ventas.
 *
 * @author
 */
public class FabricaAutos {

    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
    private ArrayList<Automovil> listaAutomoviles;
    private ArrayList<Venta> listaVentas;
    private ArrayList<Empleado> listaEmpleados;

    /**
     * Constructor para crear una nueva fábrica de autos.
     *
     * @param nombre    Nombre de la fábrica.
     * @param direccion Dirección de la fábrica.
     * @param telefono  Teléfono de contacto.
     * @param nit       Número de identificación tributaria.
     */
    public FabricaAutos(String nombre, String direccion, String telefono, String nit) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        listaAutomoviles = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaVentas = new ArrayList<>();
    }

    /**
     * Obtiene el nombre de la fábrica.
     *
     * @return Nombre de la fábrica.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la fábrica.
     *
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección de la fábrica.
     *
     * @return Dirección de la fábrica.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la fábrica.
     *
     * @param direccion Dirección a asignar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono de la fábrica.
     *
     * @return Teléfono de contacto.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la fábrica.
     *
     * @param telefono Teléfono a asignar.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el NIT de la fábrica.
     *
     * @return Número de identificación tributaria.
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece el NIT de la fábrica.
     *
     * @param nit NIT a asignar.
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Obtiene la lista de automóviles fabricados por esta fábrica.
     *
     * @return Lista de automóviles.
     */
    public ArrayList<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }

    /**
     * Establece la lista de automóviles fabricados.
     *
     * @param listaAutomoviles Lista de automóviles a asignar.
     */
    public void setListaAutomoviles(ArrayList<Automovil> listaAutomoviles) {
        this.listaAutomoviles = listaAutomoviles;
    }

    /**
     * Obtiene la lista de ventas realizadas por esta fábrica.
     *
     * @return Lista de ventas.
     */
    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    /**
     * Establece la lista de ventas realizadas.
     *
     * @param listaVentas Lista de ventas a asignar.
     */
    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    /**
     * Obtiene la lista de empleados que trabajan en esta fábrica.
     *
     * @return Lista de empleados.
     */
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Establece la lista de empleados de la fábrica.
     *
     * @param listaEmpleados Lista de empleados a asignar.
     */
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Retorna una representación en forma de texto de la fábrica de autos.
     *
     * @return Información de la fábrica como cadena.
     */
    @Override
    public String toString() {
        return "FabricaAutos [nombre=" + nombre + ", direccion=" + direccion +
                ", telefono=" + telefono + ", nit=" + nit + "]";
    }
}
