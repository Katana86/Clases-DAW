/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Alarma;

/**
 *
 * @author ivanpa
 */
public class main {

    public static void main(String[] args) {
        Timbre ti = new Timbre();
        Sensor sen = new Sensor(25.00);
        Alarma al = new Alarma(10.0, sen, ti);

        al.comprobar();
        for (int i = 0; i < 10; i++) {
            sen.setValorActual(Math.random());
            al.comprobar();
        }
    }
}
