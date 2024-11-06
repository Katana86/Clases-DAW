/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class dadosif {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pares = 0;
        int pares2 = 0;
        int impares = 0;
        System.out.println("Indique cuantos lanzamietos desea");
        int total = s.nextInt();
        for (int i = 0; i < total; i++) {
            int dado = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            int par = dado % 2;
            int par2 = dado2 % 2;
            System.out.print("Dado 1: " + dado+"\t");
            System.out.println("Dado 2: " + dado);
            if (dado == par) {
                pares++;
            }else{
                impares++;
            }
            if (dado2 == par2) {
                pares2++;
                System.out.println("   "+pares2);
            }
        }
        System.out.println("");
        float P_porcent = (float)pares/total * 100;
        float P_porcent2 = (float)pares2/total * 100;
        float IM_porcent = (float)impares/total * 100;
        float sum_final = pares+pares2;
        System.out.println("Pares: "+P_porcent+" %");
        System.out.println("Dado 2 Pares: "+P_porcent2+" %");
        System.out.println("Impares: "+IM_porcent+" %");
        System.out.println("Suma de los pares: "+sum_final+" %");
    }
}
