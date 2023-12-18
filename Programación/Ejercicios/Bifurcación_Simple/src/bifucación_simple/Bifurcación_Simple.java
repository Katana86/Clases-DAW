/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_2_bifurcación_simple;

import java.util.Scanner;
/**
 *
 * @author ivanpa
 */
public class Ej_2_Bifurcación_Simple {

    private static boolean no;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String Numero1;
    String Numero2;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Introduzca el 1 numero");
    Numero1 = scanner.nextLine();
    System.out.println("Introduzca el 2 numero");
    Numero2 = scanner.nextLine();
    System.out.println("Sus numeros son los siguientes:");
    System.out.println("Numero 1:");
    System.out.println(Numero1);
    System.out.println("Numero 2:");
    System.out.println(Numero2);
    System.out.println("Son correctos?");
    boolean eleccion;
    eleccion = scanner.nextBoolean();
        boolean si = true;
        boolean no = false;
    
    
    if (eleccion=si) {
    System.out.println("Que operación desea realizar?");
    }
    
    if (eleccion=no) {
    System.out.println("ERROR");
    }
   }
}
