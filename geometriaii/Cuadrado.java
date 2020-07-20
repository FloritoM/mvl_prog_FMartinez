/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometriaii;

/**
 *
 * @author raula
 */
public class Cuadrado implements CalculoDeArea {
    private float altura;

    public Cuadrado() {
    }

    public Cuadrado(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        float resultado;
        resultado = altura * altura;
        return resultado;
    }
   
    
    
}
