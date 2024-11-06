/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Empleados;

/**
 *
 * @author Alumno avanzado
 */
public class Administrativo extends Empleados {

    String seccion;
    String puesto;

    public Administrativo(String seccion, String puesto, String nombre, int edad, int horas) {
        super(nombre, edad);
        this.seccion = seccion;
        this.puesto = puesto;
        super.horas = horas;
        super.Horas(2);
    }

    public int salarioBase() {
        int administrativo = (int) (super.salarioBase() * 1.3);
        return administrativo;
    }

    public int salarioHExtra() {
        int extra = 0;
        extra = super.salarioHoras(100);
        return extra;
    }
    
    public int salarioTotal(){
        int suma = salarioBase()+salarioHExtra();
        return suma;
    }

    public String toString() {
        return super.toString() + "\n" + "Seccion: " + seccion + "\n" +"Puesto: "+ puesto + "\n" + "Salario: " + salarioBase() +"\n"+"Salario Horas Extra: "+salarioHExtra()+ "\n" + "Salario Total: "+salarioTotal() + "\n" + "Horas: " + horas;
    }
}
