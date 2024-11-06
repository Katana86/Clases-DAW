/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Alumno avanzado
 */
public class Sum_Dados {

    public static void main(String[] args) {
        int pares = 0;
        for (int i = 0; i < 5; i++) {
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            int suma = dado1+dado2;
            int par = suma%2;
            System.out.print("Dado 1: " + dado1 + "\t");
            System.out.println("Dado 2: " + dado2);
            if (par == 0) {
                pares++;
            }
        }
        System.out.println("Pares: "+pares);
    }
}