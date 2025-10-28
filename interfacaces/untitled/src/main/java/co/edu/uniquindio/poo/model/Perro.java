package co.edu.uniquindio.poo.model;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre,String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void saltar(){
        System.out.println("Saltando");
    }
}
