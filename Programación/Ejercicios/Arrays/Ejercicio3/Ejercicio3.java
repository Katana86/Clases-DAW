/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 *
 * Quérese realizar un programa que lea por teclado os 5 notas obtidas por un
 * alumno (comprendidas entre 0 e 10). A continuación debe mostrar todas as
 * notas, a nota media, a nota máis alta que sacou e a menor.
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculo_nota(Guardar_notas());
    }

    /**
     * Quérese realizar un programa que lea por teclado os 5 notas obtidas por
     * un alumno (comprendidas entre 0 e 10).
     *
     * @return
     */
    public static float[] Guardar_notas() {
        Scanner usu = new Scanner(System.in);
        float[] notas = new float[5];
        float nota = 0;
        System.out.println("INTRODUZCA 5 NOTAS");
        for (int i = 0; i < notas.length; i++) {
            do {
                notas[i] = nota = usu.nextFloat();
                if (nota <= 10) {
                } else {
                    System.out.println("NOTAS NO VALIDAS");
                }
            } while (nota >= 10);
        }
        return notas;
    }

    /**
     * A continuación debe mostrar todas as notas, a nota media, a nota máis
     * alta que sacou e a menor.
     *
     * @param Guardar_notas
     */
    public static void calculo_nota(float[] Guardar_notas) {
        float media = 0;
        float suma = 0;
        float[] notas = Guardar_notas;
        float n_max = notas[0];
        float n_min = 100;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
            media = suma / notas.length;
            if (notas[i] > n_max) {
                n_max = notas[i];
            }
            if (notas[i] < n_min) {
                n_min = notas[i];
            }
        }
        System.out.println("Media: " + media);
        System.out.println("Nota Maxima: " + n_max);
        System.out.println("Nota Minima: " + n_min);
    }
}
