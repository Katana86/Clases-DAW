package Dibujos_Bucles;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Alumno avanzado
 */
public class Lineas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) 
     {    //System.out.print(i+ " ");
            //multiplo(15,i);
        }
             //tablero_hueco(26,5);
             corazon(5);
    }

    public static void linea(int tamaño) {

        char asterisco = '*';
        for (int i = 0; i < tamaño; i++) {
            System.out.print(asterisco);
        }
        System.out.println("");
    }

    public static void linea_hueca(int tamaño) {

        char asterisco = '*';
        String hueco = " ";
        System.out.print(asterisco);
        for (int i = 0; i < tamaño - 2; i++) {
            System.out.print(hueco);
        }
        System.out.print(asterisco);
        System.out.println("");
    }

    public static void hueco(int tamaño) {
        String hueco = " ";
        for (int i = 0; i < tamaño; i++) {
            System.out.print(hueco);
        }
        //System.out.println("");
    }

    public static void tablero(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i%2==0 && j%2==0)|| (i%2!=0 && j%2!=0)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
    public static void multiplo(int tamaño,int multiplo){
        for (int i = 0; i < tamaño; i++) {
            if (i%multiplo==0) {
                System.out.print("+");         
            }else{
                System.out.print("*");
            }
        }
          System.out.println("");
    }
    
    public static void tablero_hueco(int tamaño,int multiplo){
       // linea(tamaño);
        for (int i = 0; i < tamaño; i++) {
            if(i%multiplo==0)
                linea(tamaño);
            else
             multiplo_hueco(tamaño,multiplo);   
            }
        
        }
    
    public static void multiplo_hueco(int tamaño,int multiplo){
        for (int i = 0; i < tamaño; i++) {
            if (i%multiplo==0) {
                System.out.print("+");
            }else{
                System.out.print(" ");      
            }                
           
        }
          System.out.println("");
    }
    
    public static void corazon(int tamaño){
        for (int i = 0; i < tamaño; i++) {
            if (i < tamaño) {
              System.out.print("*");  
            }
        }
    }
}
