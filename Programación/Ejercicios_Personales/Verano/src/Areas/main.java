/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Areas;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner usu = new Scanner(System.in);
        float a = 0, ar = 0, b = 0, c = 0, cu = 0, r = 0, t = 0, l = 0, r1 = 0, r2 = 0;
        int elec;
        float sumaAreas = 0;
        do {
            menu();
            elec = usu.nextInt();
            switch (elec) {
                case 1 -> {
                    System.out.println("INGRESE EL RADIO DEL CIRCULO");
                    r = usu.nextFloat();
                    c = circulo(r);
                    System.out.println("RESULTADO: " + c);
                    sumaAreas = sumaAreas + c;
                }
                case 2 -> {
                    System.out.println("INGRESE LA BASE Y LA ALTURA DEL TRIANGULO");
                    System.out.println("BASE:");
                    b = usu.nextInt();
                    System.out.println("ALTURA:");
                    a = usu.nextInt();
                    t = triangulo(b, a);
                    System.out.println("RESULTADO: " + t);
                    sumaAreas = sumaAreas + t;
                }
                case 3 -> {
                    System.out.println("INGRESE EL NUMERO DE LADOS");
                    l = usu.nextFloat();
                    cu = cuadrado(l);
                    System.out.println("RESULTADO: " + cu);
                    sumaAreas = sumaAreas + cu;
                }
                case 4 -> {
                    System.out.println("INGRESE LOS RADIOS DE LOS CIRCULOS");
                    System.out.println("RADIO 1");
                    r1 = usu.nextFloat();
                    System.out.println("RADIO 2:");
                    r2 = usu.nextFloat();
                    ar = arandela(r1, r2);
                    System.out.println("RESULTADO: " + ar);
                    sumaAreas = sumaAreas + ar;
                }
                case 5 -> {
                    float suma;
                    System.out.println("Suma total: " + sumaAreas);
                }
            }
        } while (elec != 0);
        System.out.println("SALIENDO... ");
    }

    public static void menu() {
        //Scanner usu = new Scanner(System.in);
        System.out.println("0. SALIR");
        System.out.println("1. CIRCULO");
        System.out.println("2. TRIANGULO");
        System.out.println("3. CUADRADO");
        System.out.println("4. ARANDELA");
        System.out.println("5. SUMAR TODO");
        System.out.println("SELECCIONE UNA OPCION VALIDA");
    }

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
        //System.out.println("Triangulo: " + ar);
        return ar;
    }

    public static float cuadrado(float l) {
        float a;
        a = (float) Math.pow(l, 2);
        //System.out.println("Cuadrado: " + a);
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
}
