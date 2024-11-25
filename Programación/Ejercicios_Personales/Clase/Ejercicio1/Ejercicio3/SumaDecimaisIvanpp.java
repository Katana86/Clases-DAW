/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase.Ejercicio1.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 * @version 1.00
 */
//CLASE
public class SumaDecimaisIvanpp {

    /**
     * @param args the command line arguments
     */
    //MAIN
    public static void main(String[] args) {
        //IVÁN PIÑEIRO PASTORIZA
        /*
        El paquete Scanner permite leer datos por teclado
         */
        Scanner s = new Scanner(System.in);
        //Mensaje de aviso
        System.out.println("Introduzca un numero");
        /*Lectura del primer numero
        mediante un FLOAT que almacena 4 bytes en coma flotante*/
        float n1 = s.nextFloat();
        //Mensaje de aviso
        System.out.println("Introduzca otro numero");
        /*Lectura del primer numero
        mediante un FLOAT que almacena 4 bytes en coma flotante*/
        float n2 = s.nextFloat();
        /*Resultado de la suma expresado en FLOAT que almacena 4 bytes en coma flotante*/
        float suma = n1 + n2;
        System.out.println("Total: " + suma);
        //CIERRE DEL SCANNER
        s.close();
    }//FIN MAIN
}//FIN CLASE
