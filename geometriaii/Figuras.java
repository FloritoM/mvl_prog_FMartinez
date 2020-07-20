/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geometriaii;
import javax.swing.JOptionPane;
/**
 *
 * @author raula
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CALCULO DE AREAS");
        System.out.println("Figuras geométricas");
        
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del rectángulo: ")));
        rectangulo1.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del rectángulo: ")));
        
        Triangulo triangulo1 = new Triangulo();
        triangulo1.setBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triángulo: ")));
        triangulo1.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triángulo: ")));
        
        Trapecio trapecio1 = new Trapecio();
        trapecio1.setBaseMenor(12);
        trapecio1.setBaseMayor(15);
        trapecio1.setAltura(16);
        
        Cuadrado cuadrado1 = new Cuadrado(18);
        // formula area circulo: pi * radio al cuadrado
        float pi = (float) 3.14;
        Circulo circulo1 = new Circulo(pi, 13);
        //circulo1.setRadio(10); 
       
        System.out.println("RESULTADOS DE LAS AREAS");
        System.out.println(" - AREA DEL RECTANGULO - ");
        // Problema con los tipos de datos: d de double no me lo acepta porque los datos son float:
        // si pongo %f me pone muuuchos decimales!
        //System.out.printf("Datos ingresados: Altura: %d , Base: %d", rectangulo1.getAltura(), rectangulo1.getBase());    
        System.out.println("Datos ingresados: Altura: " + rectangulo1.getAltura() + " Base: " + rectangulo1.getBase());
        System.out.println("AREA = " + rectangulo1.calcularArea());
        
        System.out.println(" - AREA DEL TRIANGULO - ");
        System.out.println("Datos ingresados: Altura: " + triangulo1.getAltura() + " Base: " + triangulo1.getBase());
        System.out.println("AREA = " + triangulo1.calcularArea());
        
        System.out.println(" - AREA DEL TRAPECIO - ");
        System.out.println("Datos ingresados: Base mayor: " + trapecio1.getBaseMayor() + " Base menor: " + trapecio1.getBaseMenor() + " Altura: " + trapecio1.getAltura());
        System.out.println("AREA = " + trapecio1.calcularArea());
        
        System.out.println(" - AREA DEL CUADRADO - ");
        System.out.println("Datos ingresados: Altura: " + cuadrado1.getAltura());
        System.out.println("AREA = " + cuadrado1.calcularArea());
        
        System.out.println(" - AREA DEL CIRCULO - ");
        System.out.println("Radio (con setter): 13, Valor de Pi: 3.14");
        System.out.println("AREA = " + circulo1.calcularArea());
        
    }
    
}
