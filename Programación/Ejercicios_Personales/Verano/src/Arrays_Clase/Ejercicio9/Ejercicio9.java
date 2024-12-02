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
    static float[] maxima = new float[5];
    static float[] media = new float[5];
    static float buscar_maxima;
    static float buscar_minima;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatura();
        Temperatura_Media();
//        Mostrar_Datos();
        Tabla();
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
        for (int i = 0; i < maxima.length; i++) {
            System.out.println("dia " + i + ":");
            System.out.print("T.Max: ");
            maxima[i] = usu.nextFloat();
            System.out.print("T.Min: ");
            minima[i] = usu.nextFloat();
        }
    }

    public static float Temperatura_maxima() {
        buscar_maxima = maxima[0];
        for (int i = 0; i < maxima.length; i++) {
            if (maxima[i] > buscar_maxima) {
                buscar_maxima = maxima[i];
            }
        }
        return buscar_maxima;
    }

    public static float Maxima(float v[]) {
        float max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }

        }
        return max;

    }
    
    public static float Minima(float v[]) {
        float min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }

        }
        return min;

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
            media[i] = (maxima[i] + minima[i]) / 2;
        }
    }

    public static void Mostrar_Datos() {
        for (int i = 0; i < maxima.length; i++) {
            System.out.println("Dia " + i + ":");
            System.out.println("T.Max: " + maxima[i]);
            System.out.println("T.Min: " + minima[i]);
            System.out.println("Media: " + media[i]);
        }
    }

    public static void Tabla() {
        System.out.println("\t\t[TABLA]");
        System.out.print("\tT.Max:\tT.Min:\tT.Media: ");
        for (int i = 0; i < maxima.length; i++) {
            System.out.print("\nDia " + i + ":");
            System.out.print("\t" + maxima[i]);
            System.out.print("\t" + minima[i]);
            System.out.print("\t" + media[i]);
        }
        System.out.println("");
        System.out.print("\nTemperatura maxima: " + Maxima(maxima));
        System.out.print("\nTemperatura minima de la maxima: " + Minima(maxima));
        System.out.print("\nTemperatura maxima de la minima: " + Maxima(minima));
        System.out.print("\nTemperatura minima de la minima: " + Minima(minima));
        System.out.print("\nTemperatura maxima de la media: " + Maxima(media));
        System.out.print("\nTemperatura minima de la media: " + Minima(media));
        System.out.println("");
    }
}
