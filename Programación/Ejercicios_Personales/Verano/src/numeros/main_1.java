/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class main_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bultos = 0;
        int bultos_max = 5;
        int carga_max = 50;
        int carga = 0;
        do {
            System.out.println("Introduzca un carga");
            int numero2 = s.nextInt();
            carga = carga + numero2;
            //System.out.println("Carga: " + carga);
            bultos = bultos + 1;
        } while (carga <= carga_max && bultos < bultos_max);
        System.out.println("Carga Maxima Alcanzada");
        System.out.println("Bultos anadidos: " + bultos);
    }
}

/*do {
            sumar = sumar + sumar;
            System.out.println(sumar);
            System.out.println("Numero maximo no alcanzado...");
        } while (sumar <= num_max);*/
 /*System.out.println("Repetir?");
        int opcion = s.nextInt();
        do{
        if (opcion == 1) {
            carga = 0;
            do {
                System.out.println("Introduzca la carga");
                int numero2 = s.nextInt();
                carga = carga + numero2;
                System.out.println("Carga: " + carga);
            } while (carga <= carga_max);
            bultos = bultos+1;
            System.out.println("Carga Maxima Alcanzada");
            System.out.println("Nuevo bulto anadido");
            System.out.println("Bultos completados: "+bultos);
            System.out.println("Repetir?");
            opcion = s.nextInt();
        }else if (opcion == 2){
            System.out.println("Saliendo...");
            }
        }while (opcion != 2);*/
