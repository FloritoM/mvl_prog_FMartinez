/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_sobre_ruedas;
import javax.swing.JOptionPane;
// Experimenta en la clase principal creando objetos de las cuatro clases y mostrarlos por pantalla.

/**
 *
 * @author raula
 */
public class Sobre_Ruedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prueba
        JOptionPane.showMessageDialog(null, "Bienvenido al Proyecto Sobre Ruedas!", "Programación 2020", JOptionPane.PLAIN_MESSAGE);
        // Creo objeto de la clase madre VEHICULO
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMarca(JOptionPane.showInputDialog("Ingrese marca del vehiculo 1: "));
        vehiculo1.setNumeroSerie(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de serie del vehiculo 1: ")));
        // Objeto CON SETTERS de CLASE HIJA BICICLETA
        Bicicleta bici1 = new Bicicleta();
        bici1.setRodado(26);
        bici1.setTipo("Mountain Bike");
        bici1.setMarca("Raleigh");
        bici1.setNumeroSerie(2312);
        // Objeto CON ATRIBUTOS de CLASE HIJA MOTO: uso como modelo el constructor lleno
        Moto moto1 = new Moto(110, "Digital", 6, 2345, "Honda");
        // Objeto CON SETTERS Y ALGUNOS ATRIBUTOS de CLASE HIJA AUTO
        Auto auto1 = new Auto();
        auto1.setColor("Negro matte");
        auto1.setAñoFabricacion(2020);
        auto1.setNumeroPuertas(4);
        auto1.setMarca("Renault");
        
        System.out.println("Caracteristicas ingresadas del vehiculo 1: ");
        System.out.printf("Marca: %s, Numero de serie: %d \n\n", vehiculo1.getMarca(), vehiculo1.getNumeroSerie());
        
        System.out.println("Caracteristicas setteadas de la bicicleta 1: ");
        System.out.printf("Rodado: %d, Tipo: %s, Marca: %s, Numero de serie: %d \n\n", bici1.getRodado(), bici1.getTipo(), bici1.getMarca(), bici1.getNumeroSerie());
    
        System.out.println("Caracteristicas de la moto 1: ");
        System.out.printf("Cilindrada: %d, Encendido: %s, Cantidad de velocidades: %d, Numero de serie: %d, Marca: %s \n\n", moto1.getCilindrada(), moto1.getEncendido(), moto1.getCantidadVelocidades(), moto1.getNumeroSerie(), moto1.getMarca());
    
        System.out.println("Caracteristicas setteadas del auto 1: ");
        System.out.printf("Marca: %s, Color: %s, Año de fabricacion: %d, Numero de puertas: %d \n\n", auto1.getMarca(), auto1.getColor(), auto1.getAñoFabricacion(), auto1.getNumeroPuertas());
        
    }
    
}
