/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_repaso;

import java.util.Scanner;

/**
 *
 * @author ivanpa
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double temperatura = 0;
        while (temperatura <= 999){
            System.out.println("Introduzca la temperatura");
        temperatura = scan.nextInt();
        System.out.println("La temperatura elegida es = " +temperatura);
        double Resultado = 0;
        Resultado = temperatura - 32 *5/9;
        System.out.println("La temperatura en Celsius = "+Resultado);
        }

     
    }
}
            
            
        
            
                //System.err.println("Esa temperatura es erronea");
             //break;

//Bucle Para

//for(double temp=0;temperatura>temp;temp++){
            //if(temperatura >= 999){
                //System.err.println("Esa temperatura es erronea");
             //break;
        //}