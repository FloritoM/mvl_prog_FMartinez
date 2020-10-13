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
public class Profesor extends Persona {
    private String materia;
    private String cargo;

    public Profesor(String materia, String cargo, String nombre, int edad) {
        super(nombre, edad);
        this.materia = materia;
        this.cargo = cargo;
    }

    public Profesor() {
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
