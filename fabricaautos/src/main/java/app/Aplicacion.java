package app;


import model.Automovil;
import model.FabricaAutos;

public class Aplicacion {

	
	
	public static void main(String[] args) {
		model.FabricaAutos fabricaAutos = new FabricaAutos("UQAutos",
				"calle 12","316234" ,"234567");
		
		Automovil automovil = new Automovil("Toyota", null, null, null, null, 0, fabricaAutos);
		
		
	}
}
