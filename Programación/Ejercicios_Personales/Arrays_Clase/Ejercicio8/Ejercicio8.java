/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_Clase.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ejercicio8 {

    static String[] arr_nombre = new String[20];
    static int[] arr_edad = new int[20];
    static float[] arr_nota = new float[20];
    static int i = -1;

    public static void main(String[] args) {
//        Preguntar_Usuario();
//        mayores_edad();
//        Mostrar_Mayor_Edad();
        Buscar_Nota();
    }

    public static void Preguntar_Usuario() {
        Scanner usu = new Scanner(System.in);

        String nombre = "";
        i = -1;
        do {
            i++;
            System.out.println("Introduzca el nombre del alumno");
            arr_nombre[i] = usu.next();
            System.out.println("Introduzca la edad del alumno");
            arr_edad[i] = usu.nextInt();
            System.out.println("Introduzca su nota");
            arr_nota[i] = usu.nextFloat();
        } while (!arr_nombre[i].contains("*"));
    }
//
//    public static void mayores_edad() {
//        System.out.println("Lista de alumnos mayores de edad: ");
//        for (int j = 0; j < i; j++) {
//            if (arr_edad[j] >= 18) {
//                System.out.print(arr_nombre[j] + " " + " " + arr_edad[j] + " | ");
//            }
//        }
//    }
//
//    public static void Mostrar_Mayor_Edad() {
//        int mayor = arr_edad[0];
//        String nombre = arr_nombre[0];
//        for (int j = 1; j < i; j++) {
//            if (arr_edad[j] > mayor) {
//                nombre = arr_nombre[j];
//                mayor = arr_edad[j];
//            }
//        }
//        System.out.println("\n" + "Alumno con mayor edad: " + " " + nombre + " " + mayor);
//    }

    public static void Buscar_Nota() {
        Scanner usu = new Scanner(System.in);
        Preguntar_Usuario();
        String buscar;
        
        do {
            int contador = 0;
            System.out.println("Introduzca el nombre a buscar:");
            buscar = usu.nextLine();
            for (int j = 0; j < arr_nombre.length; j++) {
                if (buscar.equals(arr_nombre[j])) {
                    contador++;
                    System.out.println("Nombre: " + arr_nombre[j]);
                    System.out.println("Edad: " + arr_edad[j]);
                    System.out.println("Nota: " + arr_nota[j]);  
                } 
            }
            System.out.println("Resultados: " + contador);
            if (contador == 0) {
                System.out.println("ALUMNO NO ENCONTRADO...");
            }
        } while (!buscar.contains("*"));
    }
}
