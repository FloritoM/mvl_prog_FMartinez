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
public class Regla {
    private String marca;
    private int longitud; 
    private String material;
    // mi constructor con los atributos y parametros
    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;
    }
    // mi constructor vacio
    public Regla() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // creo un metodo de esta clase para mostrar los atributos por pantalla
    public String displayClaseRegla(){
        //return "Regla{" + " marca = " + marca + ", longitud = " + longitud + ", material = " + material + '}';
        return "Marca = " + marca + ", Longitud = " + longitud + ", Material = " + material;
     } 




}

