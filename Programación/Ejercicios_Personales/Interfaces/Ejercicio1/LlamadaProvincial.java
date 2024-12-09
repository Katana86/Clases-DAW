/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejercicio1;

/**
 *
 * @author ivanpp
 */
public class LlamadaProvincial extends Llamada {
    int franjaHoraria;

    public void setFranjaHoraria(int f) {
        this.franjaHoraria = f;
    }
    
    public int getFranjaHoraria(){
        return franjaHoraria;
    }

    @Override
    public double costeLlamada() {
        int contador = 0;
        double coste = 0;
        do{
            if (super.getSegundos() < 60 && franjaHoraria == 1) {
                coste = coste+20;
                contador++;
            }
            if (super.getSegundos() < 60 && franjaHoraria == 2) {
                coste = coste+25;
                contador++;
            }
            if (super.getSegundos() < 60 && franjaHoraria == 3) {
                coste = coste+30;
                contador++;
            }
            if (franjaHoraria < 4) {
                System.out.println("Fanja horaria no encontrada");
            }
        }while (contador == super.getSegundos());
        return coste;
    }


    public String imprimir() {
        return "Franja: "+getFranjaHoraria();
    }

}
