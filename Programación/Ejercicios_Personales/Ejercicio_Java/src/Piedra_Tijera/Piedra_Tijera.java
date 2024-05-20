/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Piedra_Tijera;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Piedra_Tijera {

    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jugador1;
        int jugador2;
        int eleccion = 0;

        System.out.println("Turno jugador 1");

        do {
            System.out.println("Elecciones Validas [1] Piedra | [2] Papel | [3] Tijera]");
            jugador1 = scan.nextInt();
        } while (jugador1 > 3 || jugador1 < 1);

        System.out.print("El jugador 1 ha elegido:");
        if (jugador1 == PIEDRA) {
            System.out.println(" piedra");
        } else if (jugador1 == PAPEL) {
            System.out.println(" papel");
        } else if (jugador1 == TIJERA) {
            System.out.println(" tijera");
        }

        System.out.println("Turno jugador 2");
        System.out.println("Elecciones Validas [1] Piedra | [2] Papel | [3] Tijera]");
        jugador2 = scan.nextInt();

        /*    
          
        
        do{
            System.out.println("Elecciones Validas [1] Piedra | [2] Papel | [3] Tijera]");
            eleccion = scan.nextInt();
            if (eleccion == 1){
                System.out.println("El jugador 1 ha elegido: "+"piedra");
            }else if (eleccion == 2){
                System.out.println("El jugador 2 ha elegido: "+"papel");
            }else if (eleccion == 3){
                System.out.println("El jugador 3 ha elegido: "+"tijera");
            }
        }while (fin);
        
         */

 /*do{
        jugador = scan.nextInt();
        if (jugador >= 3){
            System.err.println("JUGADOR INVALIDO");
            System.out.println("Intoduce el jugador 1 o 2");
        }else{
            System.out.println("Usted es el jugador "+jugador);
        }
        } while (jugador >= 3);
        System.out.println("Es el turno del jugador: "+jugador);
        System.out.println("Elija entre || piedra [1] | papel [2] | tijera [3]");
        do{
            eleccion = scan.nextInt();
            if (eleccion == 1){
                System.out.println("Piedra");
            }else if (eleccion == 2){
                System.out.println("Papel");
            }else if (eleccion == 3){
                System.out.println("Tijera");
            }else if (eleccion >= 4){
                System.err.println("ELECCION INVALIDA");
                System.out.println("piedra [1] | papel [2] | tijera [3]");
            }
        }while (eleccion >= 4);
        if (eleccion == jugador){
            System.out.println("Es el turno de la maquina: "jugador);
        }*/
    }
}
