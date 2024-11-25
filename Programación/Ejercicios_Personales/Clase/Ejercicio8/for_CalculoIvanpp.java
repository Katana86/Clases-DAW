/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase.Ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class for_CalculoIvanpp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*El paquete Scanner permite leer datos por teclado*/
        //Scanner usuario = new Scanner(System.in);
        /* Almaceno el numero en un INT de 4 bytes enteros */
        //int n=12345;
        //MENSAJE DE AVISO
        //System.out.println("Introduzca un numero de 5 digitos");
        /* Le pregunto al usuario el numero */
        //    n = usuario.nextInt();
        /*for (int i =4;i>=0; i--) {
            int d=(int)Math.pow(10, i);
            //System.out.println(d);
            int n1 = n/d;
            n=n%d;
            System.out.print(n1+" ");
        }*/
        //triangulo(15,23);
        //cuadrado(45);
        arandela(25, 15);
        
    }// FIN MAIN

    public static float circulo(float r) {
        float a;
        a = (float) (Math.PI * r * r);
        //System.out.println("Circulo: " + a);
        return a;
    }

    public static float triangulo(float b, float a) {
        float ar;
        b = (float) 25.43;
        a = (float) 12.25;
        ar = b * a / 2;
        System.out.println("Triangulo: " + ar);
        return ar;
    }

    public static float cuadrado(float l) {
        float a;
        a = (float) Math.pow(l, 2);
        System.out.println("Cuadrado: " + a);
        return a;
    }

    public static float arandela(float r1, float r2) {
        float at;
//        System.out.println("RADIO 1: "+r1);
//        System.out.println("RADIO 2: "+r2);
        if (r1 > r2) {
            at = circulo(r1) - circulo(r2);
        } else {
            at = circulo(r2) - circulo(r1);
        }
      //  System.out.println("Arandela: " + at);
        return at;
    }
}// FIN CLASE
