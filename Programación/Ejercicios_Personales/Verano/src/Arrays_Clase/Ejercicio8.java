/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_Clase;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner usu = new Scanner(System.in);
        String[] arr_nombre = new String[20];
        int[] arr_edad = new int[20];
        int mayor = arr_edad[0];
        String nombre = arr_nombre[0];
        int i=-1;
        do {  i++;
            System.out.println("Introduzca el nombre del alumno");
            arr_nombre[i] = usu.next();
            System.out.println("Introduzca la edad del alumno");
            arr_edad[i] = usu.nextInt();
          
        } while (!arr_nombre[i].contains("*"));
        System.out.println("Lista de alumnos mayores de edad: ");
        for (int j = 0; j < i; j++) {
            if (arr_edad[j] >= 18) {
                 System.out.print(arr_nombre[j]+" "+" "+arr_edad[j]+" | ");
            }
        }
        for (int j = 0; j < i; j++) {
            if (arr_edad[j] > mayor) {
                nombre = arr_nombre[j];
                mayor = arr_edad[j];
            }
        }
        System.out.println("\n"+"Alumno con mayor edad: "+" "+nombre+" "+mayor);
    }

}
