/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejercicio1;

/**
 *
 * @author ivanpp
 */
public class LlamadaLocal extends Llamada{

    @Override
    public double costeLlamada() {
        int contador = 0;
        double coste = 0;
        do{
        if (super.getSegundos() < 60) {
                coste = coste+15;
                contador++;
            }
        }while (contador == super.getSegundos());
        return coste;
    }
    
}
