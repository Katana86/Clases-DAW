

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alumno avanzado
 */
public class ForSimplificado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "casa arbol hielo artico arbol";
        String palabras[] = {"casa","arbol","hielo","artico","arbol"};
        int contador = 0;
        String teclado;
        System.out.println("Introduzca una palabra a buscar en el vector");
        teclado = sc.next();
        String  separadas[]=frase.split(" ");
        for (String p : separadas) {
            if (p.toLowerCase().contains(teclado)) {
                contador++;
                System.out.println(contador);
            }
        }
    }
    
    /*int v[] = {3, 4, 5, 12, 4};
        String palabras[] = {"casa","coche","arbol","toro"};

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        System.out.println("");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        System.out.println("");
        for (int entero : v) {
            System.out.println(entero);
        }
        System.out.println("");
        for (String pal : palabras) {
            System.out.println(pal);
        }*/
    
}
