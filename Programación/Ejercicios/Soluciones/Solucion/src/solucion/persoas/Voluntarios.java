/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.persoas;

/**
 *
 * @author Alumno avanzado
 */
public class Voluntarios extends Traballadores{

    public Voluntarios() {
    }

    public Voluntarios(String horario) {
        super(horario);
    }

    public Voluntarios(String horario, String DNI, String nome, String telefono, String dataNac) {
        super(horario, DNI, nome, telefono, dataNac);
    }
    
}
