/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Alumno avanzado
 */
public class Cuenta_Dado {

    public static void main(String[] args) {
        int dado;
        int dado2;
        int contador = 0;
        int multiplo = 0;
        do {
            dado = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            int suma = dado + dado2;
            System.out.println("Dados: " + dado + " " + dado2 + "\t");
            contador++;
            //System.out.println("Dado 2: " + dado2);
            if (suma % 3 == 0) {
                multiplo++;
            }
        } while (dado != 6 && dado2 != 6);
        System.out.println("Intentos: " + contador);
        System.out.println("Multiplos: " + multiplo);
    }
}
/*do{
            dado = (int) (Math.random() * 6) + 1;
            System.out.println("Dado 1: "+dado);
        }while (dado != 6);
        System.out.println("");
        do{
            dado2 = (int) (Math.random() * 6) + 1;
            System.out.println("Dado 2: "+dado2);
        }while(dado2 != 6);*/
