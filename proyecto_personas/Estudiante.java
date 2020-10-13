/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_personas;

/**
 *
 * @author PC
 */
public class Estudiante extends Persona { //hereda atributos y metodos de la clase madre, Java entiende la relacion de herencia
    private String carrera;
    private int legajo;

    public Estudiante(String carrera, int legajo, String nombre, int edad) { //podrian no respetar el orden los atributos nombre y edad
        super(nombre, edad); // constructor de clase madre
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public Estudiante() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    
    
    
}
