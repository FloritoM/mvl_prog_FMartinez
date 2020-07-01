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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo objeto sin atributos, se los dare con el setter.
        Calculadora cassio1 = new Calculadora();
        cassio1.setNum1(20);
        cassio1.setNum2(100);
        System.out.println("La suma de los números con getter es: " + cassio1.sumar());
        System.out.println("La resta de los números con getter es: " + cassio1.restar());
        System.out.println("La división de los números con getter es: " + cassio1.dividir());
        System.out.println("La multiplicación de los números con getter es: " + cassio1.multiplicar());
        
        // Prueba
        // Calculadora cassio2 = new Calculadora(20, 80);
        // System.out.println("La suma de los numeros con atributos puestos es: " + cassio2.suma());
        
     

       
    }
    
}
