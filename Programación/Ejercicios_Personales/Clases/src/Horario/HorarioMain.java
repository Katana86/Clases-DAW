/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Horario;

/**
 *
 * @author Alumno avanzado
 */
public class HorarioMain {
    public static void main(String[] args){
        Horas h = new Horas(12,59,12);
     //   h.AñadirHora(5);
      //  h.AñadirMinutos(15);
        h.AñadirSegundos(350);
        System.out.println(h.ToString());
    }
}
