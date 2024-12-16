/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Clase.Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Temperaturas {

    Temperatura[] t = new Temperatura[5];
    Scanner usu = new Scanner(System.in);

    public void EncherTemperatura() {
        for (int i = 0; i < t.length; i++) {
            Temperatura tem_dia = new Temperatura();
            System.out.println("dia " + i + ":");
            System.out.print("T.Max: ");
            tem_dia.setTem_max(usu.nextFloat());
            System.out.print("T.Min: ");
            tem_dia.setTem_min(usu.nextFloat());
            t[i] = tem_dia;
        }
    }

    public void EncherTemperaturasAleatorias() {
        for (int i = 0; i < t.length; i++) {
            Temperatura tem_dia = new Temperatura();
            tem_dia.setTem_max((float) (Math.random() * 7 + 18));
            tem_dia.setTem_min((float) (Math.random() * 8 + 10));
            t[i] = tem_dia;
        }
    }

    public void VerTemperatura() {
        System.out.println("-----------------");
        for (int i = 0; i < t.length; i++) {
            System.out.println("dia " + (i + 1) + ":");
            System.out.print("T.Max: ");
            System.out.println(t[i].getTem_max());
            System.out.print("T.Min: ");
            System.out.println(t[i].getTem_min());
            System.out.println("Media: " + t[i].temperatura_Media());
            System.out.println("-----------------");
        }
        
        System.out.println("Maxima: " + temperatura_Maxima());
        System.out.println("Minima: " + temperatura_Minima());
    }

    public float temperatura_Maxima() {
        float max = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getTem_max() > max) {
                max = t[i].getTem_max();
            }
        }
        return max;
    }
    
    public float temperatura_Minima_Maxima() {
        float minMax = 100;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getTem_max() < minMax) {
                minMax = t[i].getTem_max();
            }
        }
        return minMax;
    }

    public float temperatura_Minima() {
        float min = 100;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getTem_min() < min) {
                min = t[i].getTem_min();
            }
        }
        return min;
    }
    
        public float temperatura_Maxima_Minima() {
        float minMin = 100;
        for (int i = 0; i < t.length; i++) {
            if (t[i].getTem_min() < minMin) {
                minMin = t[i].getTem_max();
            }
        }
        return minMin;
    }

    public void Tabla() {
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\t\t[TABLA]");
        System.out.print("\tT.Max:\t\tT.Min:\t\tT.Media: ");
        for (int i = 0; i < t.length; i++) {
            System.out.print("\nDia " + (i + 1) + ":");
            System.out.print("\t" + t[i].getTem_max());
            System.out.print("\t" + t[i].getTem_min());
            System.out.print("\t" + t[i].temperatura_Media());
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Maxima de la maxima: " + temperatura_Maxima());
        System.out.println("Minima de la maxima: " + temperatura_Minima_Maxima());
        System.out.println("Maxima de la minima: " + temperatura_Maxima_Minima());
        System.out.println("Minima de la maxima: " + temperatura_Minima());
    }

}
