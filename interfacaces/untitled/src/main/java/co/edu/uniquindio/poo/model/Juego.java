package co.edu.uniquindio.poo.model;

import java.util.LinkedList;
import java.util.List;

public class Juego {

    private List<Volable> listaAnimalesVuelan = new LinkedList<>();

    public void inicializarJuego(){
        listaAnimalesVuelan.clear();

        Gato gato = new Gato("Michi");
        listaAnimalesVuelan.add(gato);

        //Perro perro = new Perro("Dino","rata");
        //listaAnimalesVuelan.add(perro);
        Pajaro pajaro = new Pajaro("carpintero");
        listaAnimalesVuelan.add(pajaro);
    }

    /**
     *
     */
    public void volarTodos(){
        for(Volable v:listaAnimalesVuelan){
            v.volar(10);
        }
    }
}
