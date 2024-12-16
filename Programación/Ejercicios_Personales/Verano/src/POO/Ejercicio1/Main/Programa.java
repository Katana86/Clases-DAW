/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Ejercicio1.Main;

import POO.Ejercicio1.Clases.*;
import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula al = new Aula();
        System.out.println("Media: "+llenarAula().calcularMedia());
    }

    public static Alumno llenarAula() {
        Scanner usu = new Scanner(System.in);
        String nombre;
        float notas[] = new float[3];
        Aula al = new Aula();
        System.out.println("Introduzca el nombre: ");
        nombre = usu.next();
        System.out.println("Introduzca las notas: ");
        System.out.println("Nota 1: ");
        notas[0] = usu.nextFloat();
        System.out.println("Nota 2: ");
        notas[1] = usu.nextFloat();
        System.out.println("Nota 3: ");
        notas[2] = usu.nextFloat();
        Alumno a = new Alumno(nombre, notas);
        al.ARR_Alumno(a);
        return a;
    }
}
