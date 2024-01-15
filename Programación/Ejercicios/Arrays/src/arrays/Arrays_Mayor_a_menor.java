/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author ivanpa
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double[] decimal = new double[10];
            for (int i=0;i < decimal.length;i++) {
            System.out.println("Introduzca los numeros");
            decimal [i]=scan.nextDouble();
            }
            
            for(int i = decimal.length - 1; i >= 0; i--) {
                System.out.println("decimal["+i+"]=" + decimal[i]);
            }
          }
        }
           
