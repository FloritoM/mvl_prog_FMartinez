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
public class Circulo implements CalculoDeArea {
    private float pi;
    private float radio;
     
    public Circulo() {
    }

    public Circulo(float pi, float radio) {
        this.pi = pi;
        this.radio = radio;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        float resultado;
        resultado = (radio * radio) * pi;
        return resultado;      
    }
    
    
    
}
