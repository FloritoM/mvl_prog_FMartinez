/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author raula
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Librería MVL");
        // aca al crear al objeto ya le doy sus valores
        Lapicera lapi1 = new Lapicera("Bic", 3, "Azul");
        Lapicera lapi2 = new Lapicera("Faber Castell", 32, "Azul");
        System.out.println(lapi1.toString());
        System.out.println(lapi2.toString());
        // aca creo un objeto sin valores, que se los dare despues con el Setter
        Lapicera lapi3 = new Lapicera();
        // seteo los valores de los atributos con el metodo Setter
        lapi3.setMarca("Pilot");
        lapi3.setModelo(78);
        lapi3.setColor("Rojo");
        // varias formas de mostrar por pantalla: 
        System.out.println(lapi3.toString()); // uso el metodo toString
        System.out.println(lapi3.getMarca()); // uso el metodo Getter (que devuelve lo del Setter)
        System.out.println("La marca de la lapicera 3 es " + lapi3.getMarca() + ". Modelo: " + lapi3.getModelo() + ". Color: " + lapi3.getColor());
        
        // creo objeto de la otra clase, Regla.
        Regla regla1 = new Regla();
        regla1.setLongitud(30);
        regla1.setMaterial("Plastico");
        regla1.setMarca("Pizzini");
        
        Regla regla2 = new Regla();
        regla2.setLongitud(15);
        regla2.setMaterial("Goma");
        regla2.setMarca("Jovi");
        
        Regla regla3 = new Regla();
        regla3.setLongitud(50);
        regla3.setMaterial("Acrilico");
        regla3.setMarca("Stabilo");
        // primero use una forma "personalizada" de print.
        System.out.println("La marca de la regla 1 es " + regla1.getMarca() + ". Longitud: " + regla1.getLongitud() + ". Material: " + regla1.getMaterial());    
        // aca usare mi metodo creado para esta clase
        System.out.println("Las caracteristicas de la regla 1 son: " + regla1.displayClaseRegla());
        System.out.println("Las caracteristicas de la regla 2 son: " + regla2.displayClaseRegla());
        System.out.println("Las caracteristicas de la regla 3 son: " + regla3.displayClaseRegla());
    
    }
    
}
