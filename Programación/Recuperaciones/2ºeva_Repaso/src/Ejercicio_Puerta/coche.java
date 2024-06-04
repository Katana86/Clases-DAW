/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Puerta;

/**
 *
 * @author ivanpa
 */
public class coche {
    public static void main(String[] args){
        PuertaCoche pc = new PuertaCoche(false,"Puerta lateral delantera",23.15,250.00);
        pc.abrir();
        pc.activarAlarma();
        pc.bloquea();
        pc.cerrar();
        pc.desactivarAlarma();
        pc.desbloquea();
        pc.isAlarmaActivada();
        pc.setEstaBloqueada(true);
        System.out.println(pc.toString());
    }
}
