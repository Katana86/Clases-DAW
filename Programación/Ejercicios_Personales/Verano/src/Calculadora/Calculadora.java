/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Calculadora {

    int n1;
    int n2;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int n1 = numero();
        System.out.println("Introduzca el segundo numero");
        int n2 = numero();
        int res;
        //MENU
        do {
            res = Menu();
            switch (res) {
                //SUMA
                case 1:
                    int suma = n1 + n2;
                    Resultado(suma);
                    break;
                //RESTA
                case 2:
                    int resta = n1 - n2;
                    Resultado(resta);
                    break;
                //MULTIPLICACIÓN
                case 3:
                    int multiplicacion = n1 * n2;
                    Resultado(multiplicacion);
                    break;
                //DIVISIÓN
                case 4:
                    Division(n1,n2);
                    break;
                //CAMBIAR NÚMEROS
                case 5:
                    System.out.println("Introduzca el primer numero");
                    n1 = s.nextInt();
                    System.out.println("Introduzca el segundo numero");
                    n2 = s.nextInt();
                    break;
                //CALCULADOR DE EJES DE CORDENADAS
                case 6:
                    Calculadora_Cords();
                    break;
                //SALIR
                case 7:
                    System.out.println("SALIENDO...");
                    break;
            }
        } while (res != 7);
    }

    public static int Menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.println("5. CAMBIAR NUMEROS");
        System.out.println("6. CALCULAR EJES DE CORDENADAS");
        System.out.println("7. SALIR");
        System.out.println("ELIJA LA OPERACION A REALIZAR: ");
        int respuesta = s.nextInt();
        return respuesta;
    }

    public static int numero() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return n;
    }

    public static void Resultado(int operacion) {
        System.out.println("Resultado: " + operacion);
    }

    public static void Calculadora_Cords() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la primera cordenada");
        System.out.println("Introduzca el eje altura Y");
        float y1 = s.nextFloat();
        System.out.println("Introauzca el eje lateral X");
        float x1 = s.nextFloat();
        System.out.println("Introduzca la segunda cordenada");
        System.out.println("Introduzca el eje altura Y");
        float y2 = s.nextFloat();
        System.out.println("Introauzca el eje lateral X");
        float x2 = s.nextFloat();
        float Y_suma_cor = y1 + y2;
        float X_suma_cor = x1 + x2;
        System.out.println("SUMA EJE Y: " + Y_suma_cor);
        System.out.println("SUMA EJE X: " + X_suma_cor);
        System.out.println("--------------------------------------------------------------------");
        float Y_resta_cor = y1 - y2;
        float X_resta_cor = x1 - x2;
        System.out.println("RESTA EJE Y: " + Y_resta_cor);
        System.out.println("RESTA EJE X: " + X_resta_cor);
    }

    public static void Division(int n1,int n2) {
        float division = n1 / n2;
        System.out.println("Division: " + division);
        float resto = n1 % n2;
        System.out.println("Resto: " + resto);
    }
}
