/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author raula
 */
public class Lapicera {
    // atributos de la clase
    private String marca;
    private int modelo; 
    private String color;

    // constructor: si no lo tengo no puedo crear objetos
    public Lapicera(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    //es mi constructor vacio
    public Lapicera() {
    }
    // luego siguen otros metodos principales, que son los getters y setters
    //el get, "toma" el valor que le doy al atributo y lo devuelve en el main class
    public String getMarca() {
        return marca;
    }
    // con el set, le seteo, le doy valor al atributo, en el main class
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // creo un metodo con insert code, forma parte de la clase Lapicera, es publico

    @Override //puedo modificar el metodo toString
    public String toString() {
        return "Lapicera{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    // cree uno con nombre que yo elijo, pero hace lo mismo que el toString, aunque modificado el texto
    public String mostrarPorPantalla(){
        return "Lapicera{" + " marca = " + marca + ", modelo = " + modelo + ", color = " + color + '}';    
     }       
            
}
