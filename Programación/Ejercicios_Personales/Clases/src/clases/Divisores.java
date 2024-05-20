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
public class Divisores {
    
    static int numero(int numero){
        int n = 0;
        int contador = 0;
        for (int i = 1; i < numero; i++) {
            n= numero % i;
            if (n == 0) {
                contador++;
//                System.out.println("Es divisor: "+i);
            }
        }
        
        return contador;
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero");
        numero = s.nextInt();
        int cd=numero(numero);
        System.out.println("Tiene estas posibilidades de divisores: "+cd+" divisores");
    }
    
}
