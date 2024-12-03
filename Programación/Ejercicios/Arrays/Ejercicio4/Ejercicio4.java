package Arrays.Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 * 
 * Programa que declare un vector de dez elementos enteiros e pida números para enchelo ata que se encha o vector ou se introduza un número negativo. 
 * Entón débese imprimir o vector (só os elementos introducidos).
 */
public class Ejercicio4 {
    /** Programa que declare un vector de dez elementos enteiros e pida números para enchelo ata que se encha o vector ou se introduza un número negativo.*/
    public static void main(String[] args) {
        Scanner usu = new Scanner(System.in);
        int[] vec = new int[10];
        int usuario;
        for (int i = 0; i < vec.length; i++) {
            System.out.println("INTRODUZCA 10 NUMEROS: "+"NUMERO ACTUAL: "+i);
            vec[i] = usuario = usu.nextInt();
            if (usuario < -0) {
                break;
            }
        }
        /*Entón débese imprimir o vector (só os elementos introducidos).*/
        for (int numeros : vec) {
            System.out.print(numeros);
        }
    }
    
}
