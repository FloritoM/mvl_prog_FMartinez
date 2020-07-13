/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sobre_ruedas;
// BICICLETA: CLASE HIJA
//Atributos de cada clase: a elección tuya pero que sean a lo sumo 2 por cada clase.
//Métodos: getters y setters

/**
 *
 * @author raula
 */
public class Bicicleta extends Vehiculo {
    // Atributos de la clase hija BICICLETA:
    private int rodado;
    private String tipo;
    // Constructor: vacio

    public Bicicleta() {
    }

    public Bicicleta(int rodado, String tipo, int numeroSerie, String marca) {
        super(numeroSerie, marca); // heredo atributos de la clase madre
        this.rodado = rodado;
        this.tipo = tipo;
    }
    
    // getters y setters
    public int getRodado() {
        return rodado;
    }

    public void setRodado(int rodado) {
        this.rodado = rodado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
   
    
    
    
}
