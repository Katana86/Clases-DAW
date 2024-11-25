/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Empleados;

/**
 *
 * @author Alumno avanzado
 */
public class Informatico extends Empleados {

    String puesto;

    public Informatico(String nombre, int edad, String puesto ,int horas) {
        super(nombre, edad);
        this.puesto = puesto;
        super.horas = horas;
        super.Horas(7);
    }

    public int salarioBase() {
        int informatico = (int) (super.salarioBase() * 1.4);
        return informatico;
    }

    public int salarioHExtra() {
        int extra = 0;
        extra = (int) (super.salarioHoras(300));
        return extra;
    }
    
    public int salarioTotal(){
        int suma = salarioBase()+salarioHExtra();
        return suma;
    }

    public String toString() {
        return super.toString() + "\n" + "Seccion: " + puesto + "\n" + "Salario: " + salarioBase()+"\n"+"Salario Horas Extra: "+salarioHExtra() +"\n"+ "Salario Total: "+salarioTotal()+"\n" + "Horas: " + horas;
    }
}
