/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Empleados;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados e = new Empleados("Ivan",21);
        Administrativo a = new Administrativo("Marketing","Administrativo","Ivan", 21,8);
        Informatico i = new Informatico("Juan",23,"Informatico",7);
        System.out.println(a.toString());
        System.out.println("");
        System.out.println(i.toString());
    }
}


/*Scanner s = new Scanner(System.in);
        System.out.print("Escriba el año: ");
        int año = s.nextInt();
        if (año % 100 == 0 ) {
            if (año % 400 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } else {
            if (año % 4 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        }*/