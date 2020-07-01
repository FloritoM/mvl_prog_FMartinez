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
public class Triangulo {
    // Atributos
    private float base;
    private float altura;
    
    // Constructores vacios y llenos

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularArea(){
        // El área de un triángulo es igual a base por altura partido por 2
        float resultado; 
        resultado = (this.base*this.altura)/2;
        return resultado;
    }
}
