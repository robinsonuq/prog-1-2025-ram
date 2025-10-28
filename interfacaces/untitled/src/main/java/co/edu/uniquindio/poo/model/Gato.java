package co.edu.uniquindio.poo.model;

public class Gato extends Animal implements Volable{

    public Gato(String nombre) {
        super(nombre);
    }


    @Override
    public void volar(int altura) {
        System.out.println("El gato vuela con la cola y la capa una altura de "+altura);
    }
}
