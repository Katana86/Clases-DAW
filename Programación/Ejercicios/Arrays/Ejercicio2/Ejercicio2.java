package Arrays.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 *
 * Crear un vector de 5 elementos de cadeas de caracteres, inicializa o vector
 * con datos lidos polo teclado. Copia os elementos do vector noutro vector pero
 * en orde inversa, e móstrao pola pantalla.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner usu = new Scanner(System.in);
        //Crear un vector de 5 elementos de cadeas de caracteres, 
        String[] vector = new String[5];
        System.out.println("INTRODUZCA 5 PALABRAS");
        //inicializa o vector con datos lidos polo teclado. 
        vector[0] = usu.next();
        vector[1] = usu.next();
        vector[2] = usu.next();
        vector[3] = usu.next();
        vector[4] = usu.next();
        System.out.println("PALABRAS INVERTIDAS DE ABAJO A ARRIBA");
        /*Copia os elementos do vector noutro vector pero en orde inversa, 
        e móstrao pola pantalla.*/
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

}
