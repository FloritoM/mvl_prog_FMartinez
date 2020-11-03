/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Heroe extends Super_X {
    private int indice_bondad;

    public Heroe(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }

   
    public Heroe(int indice_bondad, String nombre, String pais_origen, String habilidad_ppal){
        super(nombre, pais_origen, habilidad_ppal);
        this.indice_bondad = indice_bondad;
    }

    public Heroe() {
    }
    
    public int getIndice_bondad(){
        return indice_bondad;
    }
    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }

    public int ataqueHeroe1(){
        System.out.println(super.getNombre()+" uso ATAQUE TRUENO y saco 10 puntos");
        int saca_energia=10;
        if (this.indice_bondad>7){
           saca_energia++;
           System.out.println("Por indice de bondad resta 1 punto mas");
        }
        return saca_energia;
    }
    
    public int ataqueHeroe2(){
        System.out.println(super.getNombre() + " uso PUA DE HIELO y saco 15 puntos");
        int saca_energia=15;
        return saca_energia;
    }
    
    public int ataqueHeroe3(){
        System.out.println(super.getNombre() + " uso BOLA DE FUEGO y saco 20 puntos");
        int saca_energia = 20;
        return saca_energia;
    }
    
    public int ataqueHeroe4(){
        System.out.println(super.getNombre() + " uso CICLON y saco 30 puntos");
        int saca_energia=30;
        return saca_energia;
    }
}
