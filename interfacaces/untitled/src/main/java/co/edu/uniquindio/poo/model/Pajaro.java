package co.edu.uniquindio.poo.model;

public class Pajaro extends Animal implements Volable{
    public Pajaro(String nombre) {
        super(nombre);
    }


    @Override
    public void volar(int altura) {
        System.out.println("Pajaro volador usa sus alas y vuela hasta la altura: " + altura);
    }
}
