/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Alumno avanzado
 */
public class dados {

    public static void main(String[] args) {
        int contador = 0;
        int intentos = 0;
        do {
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            intentos++;
            System.out.print(intentos + " " + "Dado 1: " + dado1 + "\t");
            System.out.println("Dado 2: " + dado2 + "\t");
            if (dado1 == dado2) {
                contador++;
            } else {
                contador = 0;
            }
            System.out.println("\t" + "Contador: " + contador);
        } while (contador != 3);
    }
}
