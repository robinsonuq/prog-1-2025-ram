package model;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private String codigo;
    private String descripcion;
    private int creditos;
    private String semestre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String nombre, String codigo, String descripcion, int creditos, String semestre) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.semestre = semestre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> newlistaEstudiantes){
        listaEstudiantes = listaEstudiantes;
    }
    public ArrayList<Estudiante> getListaEstudiantes(){
        return listaEstudiantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * Este metodo permite registrar a un estudiante en caso de que no este registrado
     * @param nuevoEstudiante
     * @return
     */
    public String registarEstudiante(Estudiante nuevoEstudiante){
        String resultado = "";
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(nuevoEstudiante.getNumeroIdentificacion());

        if(estudianteEncontrado == null){
            listaEstudiantes.add(nuevoEstudiante);
            resultado = "El estudiante fúe registrado a el curso";
        }else{
            resultado = "El estudiante ya existe para el curso";
        }
        return resultado;
    }

    public Estudiante buscarEstudiante(String numeroIdentificacion){

        Estudiante resultado = null;
        for(int i = 0; i < listaEstudiantes.size(); i++){
            Estudiante estudianteAux = listaEstudiantes.get(i);
            if(estudianteAux.getNumeroIdentificacion().equals(numeroIdentificacion)){
                resultado = estudianteAux;
                break;
            }
        }
        return resultado;
    }
    public Estudiante buscarEstudiante2(String numeroIdentificacion){

        Estudiante resultado = null;
        for(int i = 0; i < listaEstudiantes.size() && resultado == null; i++){
            Estudiante estudianteAux = listaEstudiantes.get(i);
            if(estudianteAux.getNumeroIdentificacion().equals(numeroIdentificacion)){
                resultado = estudianteAux;
            }
        }
        return resultado;
    }

    public Estudiante buscarEstudiante3(String numeroIdentificacion){

        Estudiante resultado = null;
        for(int i = 0; i < listaEstudiantes.size() && resultado == null; i++){
            Estudiante estudianteAux = listaEstudiantes.get(i);
            if(estudianteAux.getNumeroIdentificacion().equals(numeroIdentificacion)){
               return  estudianteAux;
            }
        }
        return resultado;
    }

    public Estudiante buscarEstudiante4(String numeroIdentificacion){


        Estudiante resultado = null;
        for(Estudiante estudianteAux : listaEstudiantes){
            if(estudianteAux.getNumeroIdentificacion().equals(numeroIdentificacion)){
                return estudianteAux;
            }
        }
        return resultado;
    }

    /**
     * Este metodo pemrite eliminar un estudiante
     * @param numeroIdentificacion
     * @return
     */
    public String eliminarEstudiante(String numeroIdentificacion){
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(numeroIdentificacion);

        if(estudianteEncontrado != null){
            listaEstudiantes.remove(estudianteEncontrado);
            System.out.println("Estudiante eliminado exitosamente");
            return "Estudiante eliminado exitosamente";
        }else{
            return "Estudiante no existe";
        }

    }

    public String actualizarEstudiante(String numeroIdentificacion,Estudiante nuevaInformacion){
        String resultado = "";
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(numeroIdentificacion);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombres(nuevaInformacion.getNombres());
            resultado = "La informacion del estudiante fúe actualizada correctamente";
        }else{
            resultado = "El estudiante no existe";
        }

        return resultado;
    }


    public String actualizarEstudiante(String numeroIdentificacionActual,String nuevoNombre){
        String resultado = "";
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(numeroIdentificacionActual);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombres(nuevoNombre);
            resultado = "La informacion del estudiante fúe actualizada correctamente";
        }else{
            resultado = "El estudiante no existe";
        }

        return resultado;
    }

    public String actualizarEstudiante(String numeroIdentificacionActual,
                                       String nuevoNombre,String nuevoApellido,String nuevoEmail){
        String resultado = "";
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(numeroIdentificacionActual);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombres(nuevoNombre);
            estudianteEncontrado.setApellidos(nuevoApellido);
            estudianteEncontrado.setCorreo(nuevoEmail);
            resultado = "La informacion del estudiante fúe actualizada correctamente";
        }else{
            resultado = "El estudiante no existe";
        }

        return resultado;
    }













}
