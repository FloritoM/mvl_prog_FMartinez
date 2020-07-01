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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo objeto con los parametros del constructor lleno
        Rectangulo r1 = new Rectangulo(4, 3);
        System.out.println("Los datos del rectángulo 1 son: ");
        System.out.println("Base = " + r1.getBase());
        System.out.println("Altura = " + r1.getAltura());
        
        //Ahora reemplazo el valor de altura inicial:
        //r1.setAltura(2);
        //System.out.println("Los datos del rectángulo 1 son: ");
        //System.out.println("Base = " + r1.getBase());
        //System.out.println("Altura = " + r1.getAltura());
        
        System.out.println("El area de r1 es: " + r1.calcularArea());
        
        Triangulo tri1 = new Triangulo();
        tri1.setAltura(10);
        tri1.setBase(5);
        // aun teniendo el mismo nombre del metodo en dos clases diferentes, uso la correcta
        // porque primero cree el objeto tri1 y "aclare" que pertenece a la clase TRIANGULO
        // NO a RECTANGULO. asi que usa el metodo de su clase correspondiente.
        System.out.println("El area del triangulo 1 es: " + tri1.calcularArea());
        // Prueba: creo objeto sin atributos: 0.0 en output y con atributos (sin usar getters y setters)
        // como altura: 5 y base: 7, en el output sale 17.5
        //Triangulo tri2 = new Triangulo(7, 5);
        //System.out.println("Area triagulo 2: " + tri2.calcularArea());
    }
    
}
