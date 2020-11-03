/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosuperx;

import modelo.Heroe;
import modelo.Malvado;
import vista.Pantalla;

/**
 *
 * @author Administrador
 */
public class ProyectoX {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pantalla pantalla1=new Pantalla();
        pantalla1.setVisible(true);
        
        /*
        Malvado malvado = new Malvado(8,"PEPE", "USA","GOLPE");
        int energia_actual = malvado.getEnergia();
        //System.out.println(energia_actual);
        Heroe heroe = new Heroe(9,"Lalo", "PERU","PIÑA");
        System.out.println("En un rincon esta: "+ malvado.getNombre()+" ("+malvado.getEnergia()+" energia)" + " y en el otro rincon  " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia)");
        System.out.println("A PELEARR!!");
        int poder_malvado;
        int poder_heroe;
        while (malvado.getEnergia() > 0 && heroe.getEnergia() > 0){
                poder_malvado = (int) Math.floor(Math.random() * (4 - 1 + 1)+(1));
                switch (poder_malvado){
                    case  1 :
                        heroe.debilitar(malvado.ataqueMalvado1 ());
                        break;
                    case 2 :
                        heroe.debilitar(malvado.ataqueMalvado2 ());
                        break;
                    case  3 :
                        heroe.debilitar(malvado.ataqueMalvado3 ());
                        break;
                    case  4 :
                        heroe.debilitar(malvado.ataqueMalvado4 ());
                        break;
                }
                poder_heroe=( int ) Math.floor(Math.random() * ( 4  - 1  + 1 ) + ( 1 ));
                 switch (poder_heroe) {
                    case  1 :
                        malvado.debilitar(heroe.ataqueHeroe1 ());
                        break;
                    case 2 :
                        malvado.debilitar(heroe.ataqueHeroe2 ());
                        break;
                    case  3 :
                        malvado.debilitar(heroe.ataqueHeroe3 ());
                        break;
                    case  4 :
                       malvado.debilitar(heroe.ataqueHeroe4 ());
                        break;
                 }
             System.out.println(malvado.toString());
             //texto_resultado.append(malvado.toString());
             System.out.println(heroe.toString());
             //texto_resultado.append(heroe.toString());
        }
        
        if ((malvado.getEnergia() < heroe.getEnergia()) && heroe.getEnergia() >= 0) {
            System.out.println("Pepe ha vencido a lalo");
        } else if ((malvado.getEnergia() > heroe.getEnergia()) && malvado.getEnergia() >= 0){
            System.out.println("lalo ha vencido a pep");
        } else {
            System.out.println("lalo ha vencido a pep");
        }*/
}
}
