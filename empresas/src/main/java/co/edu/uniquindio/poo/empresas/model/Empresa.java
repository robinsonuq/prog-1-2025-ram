package co.edu.uniquindio.poo.empresas.model;

import java.util.LinkedList;
import java.util.List;

public class Empresa {

    protected String nombre;
    private List<Empleado> listaEmpleados = new LinkedList<>();

    public Empresa(){

    }
    public Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void inicializarEmpresa(){

        setNombre("Uniquindio");

        Empleado empleado1 = new Empleado("123456", "Robinson");
        listaEmpleados.add(empleado1);
        Usuario usuario1 = new Usuario("rarias", "12345");
        empleado1.setUsuario(usuario1);

        Empleado empleado2 = new Empleado("276543", "Juan");
        listaEmpleados.add(empleado2);
        usuario1 = new Usuario("juan", "98765");
        empleado2.setUsuario(usuario1);

        Empleado empleado3 = new Empleado("765432", "Andrea");
        listaEmpleados.add(empleado3);
        usuario1 = new Usuario("andre", "56789");
        empleado3.setUsuario(usuario1);

    }


    public boolean validarUsuario(String usuario,String contrasenia){

        for(Empleado empleado : listaEmpleados){
            if(empleado.validarUsuario(usuario,contrasenia)){
                return true;
            }
        }
        return false;
    }
}
