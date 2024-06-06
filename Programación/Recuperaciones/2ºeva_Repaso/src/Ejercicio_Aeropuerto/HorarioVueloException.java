/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Ejercicio_Aeropuerto;

/**
 *
 * @author ivanpa
 */
public class HorarioVueloException extends Exception{

    /**
     * Creates a new instance of <code>HorarioVueloException</code> without
     * detail message.
     */
    public HorarioVueloException() {
        super("La hora no puede ser anterior a la hora actual");
    }

    /**
     * Constructs an instance of <code>HorarioVueloException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public HorarioVueloException(String msg) {
        super(msg);
    }
}
