/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_Clase.Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ejercicio9 {

    static Scanner usu = new Scanner(System.in);
    static float[] minima = new float[5];
    static float[] maximo = new float[5];
    static float[] media = new float[5];
    static float buscar_maxima;
    static float buscar_minima;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatura();
        Temperatura_Media();
        Mostrar_Datos();
    }

//    public static float[] Pedir_Temperatura() {
//        for (int i = 0; i < dias.length; i++) {
//            System.out.println("Introduzca la temperatura "+i+":");
//            dias[i] = usu.nextFloat();
//        }
//        System.out.print("Lista de temperaturas: ");
//        for (float temperatura : dias) {
//            System.out.print(temperatura + " ");
//        }
//        return dias;
//    }    
    public static void Temperatura() {
        System.out.println("Dias mayor temperatura");
        for (int i = 0; i < maximo.length; i++) {
            System.out.println("dia " + i + ":");
            System.out.print("T.Max: ");
            maximo[i] = usu.nextFloat();
            System.out.print("T.Min: ");
            minima[i] = usu.nextFloat();
        }
    }

    public static float Temperatura_maxima() {
        buscar_maxima = maximo[0];
        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i] > buscar_maxima) {
                buscar_maxima = maximo[i];
            }
        }
        return buscar_maxima;
    }

    public static float Temperatura_minima() {
        buscar_minima = minima[0];
        for (int i = 0; i < minima.length; i++) {
            if (minima[i] < buscar_minima) {
                buscar_minima = minima[i];
            }
        }
        return buscar_minima;
    }

    public static void Temperatura_Media() {
        for (int i = 0; i < media.length; i++) {
            media[i] = (maximo[i] + minima[i]) / 2;
        }
    }

    public static void Mostrar_Datos() {
        for (int i = 0; i < maximo.length; i++) {
            System.out.println("Dia " + i + ":");
            System.out.println("T.Max: " + maximo[i]);
            System.out.println("T.Min: " + minima[i]);
            System.out.println("Media: "+media[i]);
        }
    }
}
