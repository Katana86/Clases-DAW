/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Array;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class EJ_Array_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int longitud = 0;
        System.out.println("Define la longitud del array");
        longitud = s.nextInt();
        if (longitud > 0) {
            int v[] = new int[longitud];
            for (int i = 0; i < v.length; i++) {
                v[i] = s.nextInt();
            }

            /*System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println(v[3]);
             */
            for (int i = 0; i < v.length; i++) {
                if (v[i] <= 4) {
                    System.out.println(v[i] + " " + "Suspenso");
                } else {
                    System.out.println(v[i] + " " + "Aprobado");
                }
            }
            int aprobado = 0;
            int suspenso = 0;
            for (int i = 0; i < v.length; i++) {
                if (v[i] >= 5) {
                    aprobado++;
                } else {
                    suspenso++;
                }
            }
            System.out.println("Han aprobado: " + aprobado);
            System.out.println("Han suspendido: " + suspenso);
        } else {
            System.err.println("ERROR");
        }

    }
}

//System.out.println("-----------ARRAY-------------");
//        String [] ciudades;
//        ciudades=new String[5];
//        ciudades[0]="Badajoz";
//        ciudades[1]="La Coruna";
//        ciudades[2]="Madrid";
//        ciudades[3]="Barcelona";
//        ciudades[4]="Burgos";
//        
//        System.out.println(ciudades[0]);
//        System.out.println(ciudades[1]);
//        System.out.println(ciudades[2]);
//        System.out.println(ciudades[3]);
//        System.out.println(ciudades[4]);
//        
//        //Bucle for
//        System.out.println("---------BUCLE FOR----------");
//        for (int i = 0; i < ciudades.length; i++) {
//            System.out.println(ciudades[i]);
//        }
