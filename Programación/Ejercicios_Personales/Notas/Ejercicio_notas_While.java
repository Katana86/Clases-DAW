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
public class Ejercicio_notas_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota1=0;
        int nota2=0;
        int nota3=0;
        int resultado;
        
        System.out.println("Introduzca la primera nota");
        nota1 = scan.nextInt();
        // METODO WHILE
        while (nota1 > 10 || nota1 < 0){
            System.err.println("ERROR");
            nota1 = scan.nextInt();
        }
        System.out.println("Introduzca la segunda nota");
        // METODO DO WHILE
        do{
            nota2 = scan.nextInt();
            if (nota2 > 10 || nota2 < 0){
                System.err.println("ERROR");
            }
        }while (nota2 > 10 || nota2 < 0);
        
        System.out.println("Introduzca la tercera nota");
        nota3 = scan.nextInt();
        // METODO WHILE
        while (nota3 > 10 || nota3 < 0){
            System.err.println("ERROR");
            nota3 = scan.nextInt();
        }
        
        resultado=(nota1+nota2+nota3)/3;
        System.out.println("La media es de: ");
        System.out.println(resultado);
        
        if (resultado < 5){
            System.out.println("SUSPENSO");
        }else if (resultado >= 5 && resultado < 6){
            System.out.println("APROBADO");
        }else if (resultado >= 6 && resultado <= 7){
            System.out.println("BIEN");
        }else if (resultado >= 7 && resultado <= 8){
            System.out.println("NOTABLE");
        }else{
            System.out.println("SOBRESALIENTE");
        }
    }
}
