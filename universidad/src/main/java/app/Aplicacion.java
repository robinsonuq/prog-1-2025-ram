package app;

import model.Curso;
import model.Estudiante;

import javax.swing.*;

public class Aplicacion {


    public static void main(String[] args) {


        String numero = "3";



        for (int i = 0; i < 5; i++) {
            String nombres = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante");
            String apellidos = JOptionPane.showInputDialog(null,"Ingrese los apellidos del estudiante");
            String numeroIdentificacion = JOptionPane.showInputDialog(null,"Ingrese la cedula del estudiante");
            String correo = JOptionPane.showInputDialog(null,"Ingrese el correo del estudiante");
            byte edad = Byte.valueOf(JOptionPane.showInputDialog(null,"Ingrese la edad del estudiante"));
            String telefono = JOptionPane.showInputDialog(null,"Ingrese el telefono del estudiante");;

            var est1 = new Estudiante(nombres,apellidos,numeroIdentificacion,correo,edad,telefono);

            Curso curso = new Curso("Programacion1",
                    "12345","Curso de programacion OO",3,"3");

            String resultado = curso.registarEstudiante(est1);

            JOptionPane.showMessageDialog(null, resultado);
        }



    }





}
