/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sobre_ruedas;
// VEHICULO: CLASE MADRE
//Atributos: número de serie, marca
//Métodos: getters y setters

/**
 *
 * @author raula
 */
public class Vehiculo {
    private int numeroSerie;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(int numeroSerie, String marca) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
