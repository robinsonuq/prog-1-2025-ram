package fabricaAutomviles.model;

import java.util.ArrayList;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double salario;
	private String departamento;
	private FabricaAutos ownedByFabricaAutos;
	private ArrayList<Venta> listaVentas;
	
	public Empleado(String nombre, String apellidos, double salario, String departamento,
			FabricaAutos ownedByFabricaAutos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.departamento = departamento;
		this.ownedByFabricaAutos = ownedByFabricaAutos;
		this.listaVentas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public FabricaAutos getOwnedByFabricaAutos() {
		return ownedByFabricaAutos;
	}

	public void setOwnedByFabricaAutos(FabricaAutos ownedByFabricaAutos) {
		this.ownedByFabricaAutos = ownedByFabricaAutos;
	}

	public ArrayList<Venta> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(ArrayList<Venta> listaVentas) {
		this.listaVentas = listaVentas;
	}
	
	
	
}
