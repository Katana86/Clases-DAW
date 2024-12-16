/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Clase.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Alumnos {

    Alumno[] vectoralumnos = new Alumno[5];

    int i = 0;

    public void anhadirAlumno(Alumno a) {
        vectoralumnos[i] = a;
        i++;
    }

    public void Mostrar_Mayores_Edad() {
        System.out.println("Lista de alumnos mayores de edad: ");
        for (int j = 0; j < i; j++) {
            if (vectoralumnos[j].getEdad() >= 18) {
                System.out.print(vectoralumnos[j].getNombre() + " " + " " + vectoralumnos[j].getEdad() + " | ");
            }
        }
    }

    public void Mostrar_Mayor_Edad() {
        int mayor = vectoralumnos[0].getEdad();
        String nombre = vectoralumnos[0].getNombre();
        for (int j = 1; j < i; j++) {
            if (vectoralumnos[j].getEdad() > mayor) {
                nombre = vectoralumnos[j].getNombre();
                mayor = vectoralumnos[j].getEdad();
            }
        }
        System.out.println("\n" + "Alumno con mayor edad: " + " " + nombre + " " + mayor);
    }

    public void Buscar() {
        Scanner usu = new Scanner(System.in);
        String buscar;

        do {
            int contador = 0;
            System.out.println("Introduzca el nombre a buscar:");
            buscar = usu.nextLine();
            for (int j = 0; j < vectoralumnos.length; j++) {
                if (buscar.equals(vectoralumnos[j].getNombre())) {
                    contador++;
                    System.out.println("Nombre: " + vectoralumnos[j].getNombre());
                    System.out.println("Edad: " + vectoralumnos[j].getEdad());
                    System.out.println("Nota: " + vectoralumnos[j].getNota());
                }
            }
            System.out.println("Resultados: " + contador);
            if (contador == 0) {
                System.out.println("ALUMNO NO ENCONTRADO...");
            }
        } while (!buscar.contains("*"));
    }
}
