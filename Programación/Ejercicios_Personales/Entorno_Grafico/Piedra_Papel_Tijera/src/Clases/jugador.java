/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Alumno avanzado
 */
public class jugador {
    String eleccion;
    int jugador;

    public jugador(String elec, int j) {
        this.eleccion = elec;
        this.jugador = j;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    public String getEleccion() {
        return eleccion;
    }
    
    public int getJugador() {
        return jugador;
    }
    
    
    
    
}
