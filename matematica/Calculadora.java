/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matematica;

/**
 *
 * @author raula
 */
public class Calculadora {
    
    // Atributos
    private float num1;
    private float num2;
    
    // Constructores
    public Calculadora() {
    }

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Metodos: getters y setters
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    // Mi metodo creado va a ser PUBLICO {}
    public float sumar(){
    float resultado;
    resultado = num1 + num2;
    return resultado;
    }
    
    public float restar(){
    float resultado;
    resultado = num1 - num2;
    return resultado;
    }
    
    public float multiplicar(){
    float resultado;
    resultado = num1 * num2;
    return resultado;
    }
    
    public float dividir(){
    float resultado;
    resultado = num1 / num2;
    return resultado;
    }
    
    // toString
    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
