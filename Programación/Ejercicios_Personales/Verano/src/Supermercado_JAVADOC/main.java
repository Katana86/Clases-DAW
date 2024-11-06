/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package Supermercado_JAVADOC;

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
        System.out.println("Introduzca las unidades del producto");
        int unidades = usu.nextInt();
        Producto p = new Producto(unidades,100);
        System.out.println(p.toString());
    }
    
}
