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
public class Trapecio implements CalculoDeArea {
    private float baseMayor;
    private float baseMenor;
    private float altura;

    public Trapecio() {
    }

    public Trapecio(float baseMayor, float baseMenor, float altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public float getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
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
        resultado = ((baseMayor + baseMenor)* altura)/2;
        return resultado;
    }
    
    
    
    
}
