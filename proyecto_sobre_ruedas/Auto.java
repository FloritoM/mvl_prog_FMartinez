/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sobre_ruedas;
// AUTO: CLASE HIJA
/**
 *
 * @author raula
 */
public class Auto extends Vehiculo {
    // Atributos de la clase hija AUTO
    private int numeroPuertas;
    private String color;
    private int añoFabricacion;
    // Constructor: vacio
    public Auto() {
    }
    // Constructor: lleno, con atributos tambien de mi clase madre
    public Auto(int numeroPuertas, String color, int añoFabricacion, int numeroSerie, String marca) {
        super(numeroSerie, marca); // atributos que heredo de la clase madre que puedo usar aca
        this.numeroPuertas = numeroPuertas;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
    }
    // getters y setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
    
    
    
}
