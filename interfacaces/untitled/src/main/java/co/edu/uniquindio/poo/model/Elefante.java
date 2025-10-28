package co.edu.uniquindio.poo.model;

public class Elefante extends Animal implements Volable{
    public Elefante(String nombre) {
        super(nombre);
    }

    @Override
    public void volar(int altura) {
        System.out.println("El elefante vuela con las orejas soy dumbo");
    }
}
