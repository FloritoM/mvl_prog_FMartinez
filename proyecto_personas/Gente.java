/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_personas;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Gente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto p de la clase Persona con constructor vacio
        Persona p = new Persona();
        p.setNombre("Josefina Perez");
        p.setEdad(59);
        //creamos un objeto p2 de la clase persona con el constructor lleno
        Persona p2 = new Persona ("Estela Gomez", 29);
        //creamos un objeto e de la clase Estudiante con el constructor vacio
        Estudiante e = new Estudiante();
        e.setNombre("Juan Jose Carreras"); //uso sus propios atributos y solo uno de la clase madre
        e.setLegajo(22345);
        e.setCarrera("Sistemas");
        //creamos un objeto profe de la clase Profesor con el constructor vacio
        Profesor profe = new Profesor();
        profe.setNombre("Fernando Martin");
        profe.setMateria("Algoritmos de programacion");
        profe.setCargo("Titular");
        
        Profesor lista_profes[] = new Profesor[2];
        for(int i=0; i<2; i++){
            String materia = JOptionPane.showInputDialog("Ingrese materia");
            String cargo = JOptionPane.showInputDialog("Ingrese cargo");
            String nombre = JOptionPane.showInputDialog("Ingrese nombre y apellido");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            lista_profes[i] = new Profesor(materia, cargo, nombre, edad);
        }    
            
        System.out.println("OBJETOS DE TIPO PERSONA");
        System.out.printf("Nombre: %s, Edad: %d \n", p.getNombre(), p.getEdad());
        System.out.printf("Nombre: %s, Edad: %d \n\n", p2.getNombre(), p2.getEdad());
            
        System.out.println("OBJETOS DE TIPO PERSONA-ESTUDIANTE");
        System.out.printf("Nombre: %s, Carrera: %s, Legajo: %d\n\n", e.getNombre(), e.getCarrera(), e.getLegajo());
            
        System.out.println("OBJETOS DE TIPO PERSONA-PROFESOR");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s\n\n", profe.getNombre(), profe.getMateria(), profe.getCargo());
            
        System.out.println("OBJETOS DE TIPO PERSONA-PROFESOR EN LA LISTA DE PROFESORES");
        for(int i=0; i<2; i++) {
            System.out.printf("Nombre: %s, Edad: %d, Materia: %s, Cargo: %s \n", lista_profes[i].getNombre(), lista_profes[i].getEdad(), lista_profes[i].getMateria(), lista_profes[i].getCargo());
        }
            
    }
            
}
