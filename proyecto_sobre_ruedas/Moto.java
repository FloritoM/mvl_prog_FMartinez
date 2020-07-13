/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sobre_ruedas;
// MOTO: CLASE HIJA
/**
 *
 * @author raula
 */
public class Moto extends Vehiculo {
    // Atributos de la clase hija MOTO:
    private int cilindrada;
    private String encendido;
    private int cantidadVelocidades;
    // Constructor: vacio 
    public Moto() {
    }
    // Constructor: lleno + atributos de la clase madre

    public Moto(int cilindrada, String encendido, int cantidadVelocidades, int numeroSerie, String marca) {
        super(numeroSerie, marca); // lo que hereda de la madre, llama al constructor de esa clase
        this.cilindrada = cilindrada;
        this.encendido = encendido;
        this.cantidadVelocidades = cantidadVelocidades;
    }
    // getters y setters: solo de los atributos que le di aca, para los demas atributos ya estan en la clase madre (los que comparte con esta)
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getEncendido() {
        return encendido;
    }

    public void setEncendido(String encendido) {
        this.encendido = encendido;
    }

    public int getCantidadVelocidades() {
        return cantidadVelocidades;
    }

    public void setCantidadVelocidades(int cantidadVelocidades) {
        this.cantidadVelocidades = cantidadVelocidades;
    }
    
    
    
    
    
    
    
    
}
