/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Aeropuerto;

import examen240314.VueloAbstract;
import java.time.LocalDateTime;

/**
 *
 * @author ivanpa
 */
public class vuelo extends VueloAbstract{

    public vuelo(String codigo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada) {
        super(codigo, origen, destino, salida, llegada);
    }

    @Override
    public String toString() {
        return ("CODE: "+ this.getCodigo() + " " +
                "Origen: "+ this.getOrigen() + " " +
                "Destino: " + this.getDestino() + " " +
                "Salida: " + this.getSalida() + " " +
                "Llegada: " + this.getLlegada());
    }
    
}
