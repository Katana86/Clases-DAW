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
public class vuelo extends VueloAbstract implements Comparable {

    public vuelo(String codigo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada) {
        super(codigo, origen, destino, salida, llegada);
    }

    @Override
    public String toString() {
        return ("CODE: " + this.getCodigo() + " "
                + "Origen: " + this.getOrigen() + " "
                + "Destino: " + this.getDestino() + " "
                + "Salida: " + this.getSalida() + " "
                + "Llegada: " + this.getLlegada());
    }

    @Override
    // COMPARAMOS POR FECHAS CON UN ISBEFORE/ISAFTER y devolvemos 
    public int compareTo(Object o) {
        if (this.getSalida().isBefore(((vuelo) o).getSalida())) {
            return -1; // v1 < v2
        } else if (this.getSalida().isAfter(((vuelo) o).getSalida())) {
            return 1; // v1 > v2
        } else {
            return 0; // v1 == v2
        }
    }

    @Override
    protected void setLlegada(LocalDateTime llegada) {
        try {
            if (llegada.isBefore(LocalDateTime.now())) {
                throw new HorarioVueloException();
            }
            if (llegada.isBefore(this.getSalida())) {
                throw new HorarioVueloException("La hora no puede ser anterior a la hora de llegada");
            }
        } catch (HorarioVueloException ex) {
            System.out.println(ex.getMessage());
        }

    }

    
    @Override
    protected void setSalida(LocalDateTime salida) {
        try {
            if (salida.isBefore(LocalDateTime.now())) {
                throw new HorarioVueloException();
            }
            super.setLlegada(salida);
        } catch (HorarioVueloException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
