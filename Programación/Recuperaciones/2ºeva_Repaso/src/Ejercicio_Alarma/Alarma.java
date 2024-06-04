/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Alarma;

/**
 *
 * @author ivanpa
 */
public class Alarma {

    private double umbral;
    private Sensor s1;
    private Timbre t1;

    public Alarma(double umbral, Sensor s1, Timbre t1) {
        this.umbral = umbral;
        this.s1 = s1;
        this.t1 = t1;
    }

    public void comprobar() {
        if (s1.getValorActual() > this.umbral) {
            t1.activar();
        } else {
            t1.desactivar();
        }
    }
}
