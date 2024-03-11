/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Array;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class EJ_Array_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introducir datos
        Scanner s = new Scanner(System.in);
        //Contador de ceros
        int contador = 0;
        //Array de numeros
        int[] numeros={1,2,0,0,3,4,0,0,3,0,0,8,0};
        //Longitud del array
        
        //Bucle para repetir los Intnetos*Longitud
      /*  for (int j = 0; j < numeros.length; j++) {
            numeros[j] = s.nextInt();
        }*/
        //Bucle para buscar los ceros introducidos
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] == 0 && numeros[i + 1] == 0) {
                contador++;
            }
        }
        //Resultado
        System.out.println("Hay un total de 0: " + contador + " " + "ceros");
        }
    }

//ZONA TEST
//     Al ser 0 no lo contabiliza en la variable contador
//            }else if (numeros[i] == 0){
//                contador--;
//            }

