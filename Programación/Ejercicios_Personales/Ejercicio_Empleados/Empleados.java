/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Empleados;



/**
 *
 * @author Alumno avanzado
 */
public class Empleados {
    String nombre;
    int edad;
    int horas;
    
    Empleados(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.horas = 0;
    }
    
    public int setHoras(int horas){
        return horas;
    }
    
    public int salarioBase(){
        return 2100;
    }
    
    // Añadir el salario de los administrativos y informaticos por hora todos los empleados tienen un precio de hora extra distinto
    public int salarioHoras(int salario){
        int s = salario * horas;
        return s;
    }
    
    public int Horas(int horasmaximas){
        if (horas <= horasmaximas) {
            System.out.println("Ha excedido las horas maximas");
        }else{
            System.out.println("Ha trabajado las horas recomendadas");
        }
        return horas;
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad;
    }
}
