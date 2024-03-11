/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_For;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class EJ_For_Multiplicacion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multi;
        int i = 1;
        int respuesta;
        int resultado;
        System.out.println("Introduzca un numero para multiplicar");
        multi = scan.nextInt();
        for (i = 1; i < 11;i++)
        {
            resultado = multi * i;
        System.out.println("Cuanto es "+multi+" x "+i);
        respuesta = scan.nextInt();
        if (respuesta == resultado )
                System.out.println("Correcto");
        else  System.out.println("Error");
            }
//        for (i = 1; i < 11;i++) 
//            {
//                resultado = multi * i;
//                System.out.println(multi+" x "+i+" = "+resultado);
//                }
//        }
}}


    /* for (;multi1<11;multi1++){
            System.out.println(multi1);
        }
        for (multi1=2;multi1<11;multi1++){
            System.out.println(multi1*2);
        }*/
//Multiplica 2 numeros
/*System.out.println("Introduzca un numero para multiplicar");
        multi1 = scan.nextInt();
        System.out.println("Introduzca segundo numero para multiplicar");
        multi2 = scan.nextInt();
        System.out.println(multi1);
        System.out.println(multi2);
        for (; multi1 < multi2; multi1++) {
            resultado = multi1*multi2;
            System.out.println(resultado);
        }*/

//        numero++;
//        
//        resultado = multi1*numero;
//        System.out.println(resultado);
//        numero++;
//        
//        resultado = multi1*numero;
//        System.out.println(resultado);
//        resultado = multi1*5;
//        System.out.println(resultado);
//        resultado = multi1*6;
//        System.out.println(resultado);
//        resultado = multi1*7;
//        System.out.println(resultado);
//        resultado = multi1*8;
//        System.out.println(resultado);
//        resultado = multi1*9;
//        System.out.println(resultado);
//        resultado = multi1*10;
//        System.out.println(resultado);