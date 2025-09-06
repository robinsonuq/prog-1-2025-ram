package fabricaAutomviles.model;

import java.util.ArrayList;

public class Automovil {

	private String nombre;
	private String modelo;
	private String tipoMotor;
	private String capacidadPasajeros;
	private TipoCarroceria tipoCarroceria;
	private double precioBase;
	private FabricaAutos ownedByFabricaAutos;
	private ArrayList<Venta> listaVentas;
	
	public Automovil(String nombre, String modelo, String tipoMotor, String capacidadPasajeros,
			TipoCarroceria tipoCarroceria, double precioBase, FabricaAutos ownedByFabricaAutos) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.tipoMotor = tipoMotor;
		this.capacidadPasajeros = capacidadPasajeros;
		this.tipoCarroceria = tipoCarroceria;
		this.precioBase = precioBase;
		this.ownedByFabricaAutos = ownedByFabricaAutos;
		this.listaVentas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(String capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public TipoCarroceria getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(TipoCarroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
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

	@Override
	public String toString() {
		return "Automovil [nombre=" + nombre + ", modelo=" + modelo + ", tipoMotor=" + tipoMotor
				+ ", capacidadPasajeros=" + capacidadPasajeros + ", precioBase=" + precioBase + ", ownedByFabricaAutos="
				+ ownedByFabricaAutos + "]";
	}
	
	
	

	
	
	
}
