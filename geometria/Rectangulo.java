/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometria;

/**
 *
 * @author raula
 */
public class Rectangulo {
    // Primero los atributos
    private int base;
    private int altura;
    
    // Constructores: vacios y llenos

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularArea(){
        int resultado;
        resultado = this.base * this.altura;
        return resultado;
    }
}
