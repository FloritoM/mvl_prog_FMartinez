/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_cine;

/**
 *
 * @author raula
 */
public class Pelicula {  // va a tener dos atributos mas que van a ser objetos de la clase Genero y de la clase Calificacion
    // ATRIBUTOS PROPIOS DE LA CLASE PELICULA
    private int añoEstreno; 
    private boolean disponible; 
    private int duracion;
    private int fechaIngreso; // --> deberia ser de tipo FECHA
    private String nombre;
    private String tituloOriginal;
    
    // Mis otras dos clases (Genero y Calificacion) 'representan atributos' para mi clase Pelicula
    // Entonces tambien pueden haber atributos que son objetos de una clase
    // Los instancio de la siguiente forma:
    private Genero genero; // que a su vez engloba dos atributos 
    private Calificacion calificacion; // lo mismo esta clase
    
    // Instancio objetos de las clases Genero y Calificacion
    // Genero genero1 = new Genero();
    // Calificacion calificacion1 = new Calificacion();
    
    public Pelicula() {
    }

    public Pelicula(int añoEstreno, boolean disponible, int duracion, int fechaIngreso, String nombre, String tituloOriginal) {
        this.añoEstreno = añoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    
    public boolean estaDisponible(){
    }
    
    public boolean estaEnCartel(){
    }
    
    public String mostrarFuncHabilitadas(){
    }
    
    
}
