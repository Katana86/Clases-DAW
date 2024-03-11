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
        for (int i = 0; i < 10; i++) {
            resultado = numero * i;
            System.out.println(resultado);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        Multiplicacion m = new Multiplicacion(num);
        m.tabla();
        // TODO code application logic here
        /*
        Multiplicacion m = new Multiplicacion();
        m.pregunta();
        m.tabla();*/

    }

}
