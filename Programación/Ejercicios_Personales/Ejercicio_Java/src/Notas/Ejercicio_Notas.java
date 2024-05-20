/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_notas;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ejercicio_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a scanner para coger la respuesta del usuario
        Scanner scan = new Scanner(System.in);
        //Almacenamos las notas
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        //Hacemos el resultado
        float media;
        //Logica
        System.out.println("Introduzca una nota");
        nota1 = scan.nextInt();
        //Si la nota1 es 0 o negativo entonces no imprime el resultado
        if (nota1 < 0 || nota1 > 10) {
            System.err.println("Valor Incorrecto");
        } else {
            System.out.println("Introduzca otra nota");
            nota2 = scan.nextInt();
            //Si la nota2 es 0 o negativo entonces no imprime el resultado
            if (nota2 < 0 || nota2 > 10) {
                 System.err.println("Valor Incorrecto");
            }else{
            System.out.println("Introduzca una 3 nota");
            nota3 = scan.nextInt();
            //Si la nota3 es 0 o negativo entonces no imprime el resultado
            if (nota3 < 0 || nota3 > 10) {
                 System.err.println("Valor Incorrecto");
            }else{
            //Hacemos la media entre las notas

            //Conversión a float
            //Hacemos que no se pueda poner 0 o negativo
            media = (float) (nota1 + nota2 + nota3) / 3;
            System.out.println(media);
            //Imprimimos la nota escrita
            if (media <= 5) {
                System.out.println("Suspenso");
            } else if (media >= 5 && media < 6) {
                System.out.println("Aprobado");
            } else if (media >= 6 && media <= 7) {
                System.out.println("Bien");
            } else if (media >= 7 && media <= 9) {
                System.out.println("Notable");
            } else if (media >= 9 && media <= 10) {
                System.out.println("Sobresaliente");
            }
        }}}
        scan.close();
    }
}
