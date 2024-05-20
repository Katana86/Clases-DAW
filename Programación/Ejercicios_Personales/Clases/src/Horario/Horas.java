/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Horario;



/**
 *
 * @author Alumno avanzado
 */
public class Horas {
   int Horas;
   int Minutos;
   int Segundos;
   
   Horas(int h,int Min,int Seg){
        Horas = h;
        Minutos = Min;
        Segundos = Seg;
   }
   
   public void AñadirHora(int Sumar){
       Horas = Horas + Sumar;
       if (Horas > 24) {
            System.out.println("La Hora se ha pasado de 24 Horas");
            System.out.println("Introduzca una hora valida");
       }
   }
   
    public void AñadirMinutos(int Sumar){
        Minutos = Minutos + Sumar;
        while (Minutos > 60) {
            Horas = Horas +1;
            Minutos = Minutos - 60;
        }
    }   

    public void AñadirSegundos(int Sumar){
        Segundos = Segundos + Sumar;
        while (Segundos > 60) {
            Minutos = Minutos + 1;
            Segundos = Segundos - 60;
        }
        while (Minutos > 60) {
                Horas = Horas + 1;
                Minutos = Minutos - 60;
            }
        
    }   
   
   
   public String ToString(){
       return "Son las: "+Horas+" Horas "+Minutos+" Minutos "+Segundos+" Segundos ";
       //return "La compra se realizo el dia a las: "+dias+" Dia "+meses+" Mes "+ano+" Ano "+" A las: "+Horas+" Horas "+Minutos+" Minutos "+Segundos+" Segundos ";
   }
}
