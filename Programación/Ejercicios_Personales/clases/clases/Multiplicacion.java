/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Multiplicacion {

    int numero;

    Multiplicacion(int n) {
        numero = n;
    }

    void tabla() {
        int resultado;
        for (int i = 1; i < 11; i++) {
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int r;
        int contador = 0;
        int n1;

        System.out.println("Introduce un numero");
        n1 = s.nextInt();
        for (int i = 1; i < n1; i++) {
            r = n1 % i;
            if (r == 0) {
                contador++;
                System.out.println(i);
            }

        }
        System.out.println("Hay un numero de divisores: " + contador + " Divisores");
    }

}

//        int num = s.nextInt();
//
//        
//        for (int i = 1; i <= 5;i++) {
//            Multiplicacion m = new Multiplicacion(i);
//            m.tabla();
//        }
//  System.out.println("Verdadero");
        //            else  {
        //                System.out.println("Falso");
        //            }
        //int n2;               
//      System.out.println("Introduce un divisor");
//            n2 = s.nextInt();
//            r = n1 % n2;
//            System.out.println(r);  
//   do {
        //if (r == 0) {
//                System.out.println(n1 + " " + "Es multiplo");
//            } else {
//                System.out.println(n1 + " " + "No es multiplo");
//            }
//  } while (r >= 1);
        // TODO code application logic here
        /*
        Multiplicacion m = new Multiplicacion();
        m.pregunta();
        m.tabla();*/