/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matematica;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JFrame;
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
        
        // JOptionPane
       
        // metodo: show message: null + mensaje por arriba del cuadro a llenar + titulo + tipo de icono.
        JOptionPane.showMessageDialog(null, "Bienvenido a la Cassio v 2.0", "Cassio 2.0", JOptionPane.PLAIN_MESSAGE);
        // metodo: show input: null + mensaje + titulo + tipo de icono.
        String dato1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero: ", "Primer numero", JOptionPane.INFORMATION_MESSAGE);
        int number1 = Integer.parseInt(dato1);
        String dato2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero: ", "Segundo numero", JOptionPane.INFORMATION_MESSAGE);
        int number2 = Integer.parseInt(dato2);
       
        // creo otro objeto
        Calculadora calcu = new Calculadora(number1,number2);
        
        System.out.println("El resultado de la suma de ambos numeros es:"+calcu.sumar());
        System.out.println("El resultado de la resta de ambos numeros es:"+calcu.restar());
        System.out.println("El resultado de la multiplicacion de ambos numeros es:"+calcu.multiplicar());
        System.out.print("El resultado de la division de ambos numeros es:");
        
        if(calcu.dividir()==Float.POSITIVE_INFINITY || calcu.dividir()==Float.NEGATIVE_INFINITY){
            System.out.println("ERROR!");
        }else{
            System.out.println(calcu.dividir());
        }
        
        JOptionPane.showConfirmDialog(null,"Gracias por usar la calculadora!", "CASSIO", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
       
        // Prueba: opciones en cascada
        //JOptionPane.showInputDialog(null,"Seleccione Un Color", "COLORES", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");
        
    }
    
}
