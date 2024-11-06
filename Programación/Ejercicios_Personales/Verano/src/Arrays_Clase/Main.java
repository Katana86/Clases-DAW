/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_Clase;

import ArrayList.Numeros;
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
        Scanner usu = new Scanner(System.in);
        int[] numeros = new int[5];
        int i = -1;
        do {
            i++;
            System.out.println("Introduzca 5 numeros");
            numeros[i] = usu.nextInt();
        } while (numeros[i] > 0);
        for (int j = 0; j < i; j++) {
            System.out.println("Numeros: "+numeros[j]);
        }
        System.out.println("Longitud del array: " + numeros.length);
    }

}
