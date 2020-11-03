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
public class Malvado extends Super_X {
    private int indice_perversidad;

    public Malvado(int indice_perversidad) {
        this.indice_perversidad = indice_perversidad;
    }
    public Malvado(int indice_perversidad, String nombre, String pais_origen, String habilidad_ppal){
        super(nombre, pais_origen, habilidad_ppal);
        this.indice_perversidad = indice_perversidad;
    }

    public Malvado() {
    }
    
   public int getIndice_perversidad() {
        return indice_perversidad;
    }

    public void setIndice_perversidad(int indice_perversidad) {
        this.indice_perversidad = indice_perversidad;
    }

    public int ataqueMalvado1(){
        System.out.println(super.getNombre() + " uso LATIGAZO y saco 20 puntos");
        int saca_energia=20;
        if (this.indice_perversidad>7){
           saca_energia++;
           System.out.println("Por indice de perversidad resta 1 punto mas");
        }
        return saca_energia;
    }

    public int ataqueMalvado2(){
        System.out.println(super.getNombre() + " uso PUA DE ODIO y saco 10 puntos");
        int saca_energia = 10;
        return saca_energia;
    }
       

    public int ataqueMalvado3(){
        System.out.println(super.getNombre()+" uso GOLPE CEGADOR y saco 15 puntos");
        int saca_energia=15;
        return saca_energia;
    }
    
    public int ataqueMalvado4(){
        System.out.println(super.getNombre() + " uso CORTE DE GUADAÑA y saco 20 puntos");
        int saca_energia=20;
        return saca_energia;
    }
}