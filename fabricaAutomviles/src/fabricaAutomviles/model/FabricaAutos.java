package fabricaAutomviles.model;

import java.util.ArrayList;

public class FabricaAutos {

	
	private String nombre;
	private String direccion;
	private String telefono;
	private String nit;
	private ArrayList<Automovil> listaAutomoviles;
	private ArrayList<Venta> listaVentas;
	private ArrayList<Empleado> listaEmpleados;
	
	public FabricaAutos(String nombre, 
			String direccion, String telefono, String nit) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nit = nit;
		listaAutomoviles = new ArrayList<>();
		listaEmpleados = new ArrayList<>();
		listaVentas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public ArrayList<Automovil> getListaAutomoviles() {
		return listaAutomoviles;
	}

	public void setListaAutomoviles(ArrayList<Automovil> listaAutomoviles) {
		this.listaAutomoviles = listaAutomoviles;
	}

	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(ArrayList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public String toString() {
		return "FabricaAutos [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", nit=" + nit
				+ "]";
	}
	
	
	

	
}
