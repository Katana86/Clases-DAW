/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejercicio1;

/**
 *
 * @author ivanpp
 */
public class Llamada extends chamadaIvanPP {

    private String numOrigen;
    private String numDestino;
    private int segundos;
    
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getNumOrigen() {
        return numOrigen;
    }

    public String getNumDestino() {
        return numDestino;
    }

    public int getSegundos() {
        return segundos;
    }

    public double costeLlamada(){
        double coste = super.getCosteTotal();
        return coste;
    }

    public String imprimir() {
        return "Numero Origen: "+getNumOrigen()+"Numero Destino: "+getNumDestino()+"Segundos: "+getSegundos();
    }
}
