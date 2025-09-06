package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * Registra un nuevo automóvil si no existe ya en la lista.
     *
     * @param nuevoAutomovil El automóvil a registrar.
     * @return Mensaje indicando si el registro fue exitoso o si ya existía.
     */
    public String registrarAutomovil(Automovil nuevoAutomovil) {
        String resultado = "";
        Automovil automovilEncontrado = buscarAutomovil(
                nuevoAutomovil.getNombre(),
                nuevoAutomovil.getModelo()
        );

        if (automovilEncontrado == null) {
            listaAutomoviles.add(nuevoAutomovil);
            resultado = "El automóvil fue registrado correctamente.";
        } else {
            resultado = "El automóvil ya existe y no puede ser registrado nuevamente.";
        }

        return resultado;
    }

    /**
     * Busca un automóvil en la lista por nombre y modelo.
     *
     * @param nombre Nombre del automóvil.
     * @param modelo Modelo del automóvil.
     * @return El automóvil encontrado, o null si no existe.
     */
    public Automovil buscarAutomovil(String nombre, String modelo) {
        Automovil resultado = null;

        for (Automovil automovil : listaAutomoviles) {
            if (automovil.getNombre().equalsIgnoreCase(nombre) &&
                    automovil.getModelo().equalsIgnoreCase(modelo)) {
                resultado = automovil;
                break;
            }
        }

        return resultado;
    }



    /**
     * Crea y registra una nueva venta en la fábrica si no existe una con el mismo código.
     * Calcula automáticamente el total, y asocia la venta al empleado y automóviles.
     *
     * @param codigo            Código único de la venta.
     * @param fecha             Fecha de la venta.
     * @param listaAutomoviles  Lista de automóviles vendidos.
     * @param empleado          Empleado que realizó la venta.
     * @return Mensaje con el resultado de la operación.
     */
    public String crearYRegistrarVenta(String codigo, LocalDate fecha, List<Automovil> listaAutomoviles, Empleado empleado) {
        Venta ventaExistente = buscarVenta(codigo);

        if (ventaExistente != null) {
            return "Ya existe una venta registrada con el mismo código.";
        }

        // Crear nueva venta
        Venta nuevaVenta = new Venta(codigo, fecha, 0, this, empleado);
        nuevaVenta.setListaAutomoviles(new ArrayList<>(listaAutomoviles));

        // Calcular el total de la venta
        double totalCalculado = nuevaVenta.calcularVenta();
        nuevaVenta.setTotal(totalCalculado);

        // Agregar venta a la fábrica
        listaVentas.add(nuevaVenta);

        // Agregar venta al empleado
        if (empleado != null) {
            empleado.getListaVentas().add(nuevaVenta);
        }

        // Agregar venta a cada automóvil vendido
        for (Automovil auto : listaAutomoviles) {
            auto.getListaVentas().add(nuevaVenta);
        }

        return "La venta fue registrada exitosamente con un total de: $" + totalCalculado;
    }

    public Venta buscarVenta(String codigo) {
        for (Venta venta : listaVentas) {
            if (venta.getCodigo().equalsIgnoreCase(codigo)) {
                return venta;
            }
        }
        return null;
    }
}
