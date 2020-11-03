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
public class Super_X {
    private int energia;
    private String nombre;
    private String pais_origen;
    private String habilidad_ppal;
    

    public Super_X() {
    }

    public Super_X(String nombre, String pais_origen, String habilidad_ppal) {
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.habilidad_ppal = habilidad_ppal;
        this.energia = 100;
    }
    
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getHabilidad_ppal() {
        return habilidad_ppal;
    }

    public void setHabilidad_ppal(String habilidad_ppal) {
        this.habilidad_ppal = habilidad_ppal;
    }
    public int debilitar(int valor){
        this.energia-=valor;
        return this.energia;
   }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String frase= " Soy " + getNombre()+" me quedan "+getEnergia()+" puntos de energia";
        if (this.energia <= 0){
            frase = frase + " Adios mundo !";
        }
        return frase;
    }
    
}
