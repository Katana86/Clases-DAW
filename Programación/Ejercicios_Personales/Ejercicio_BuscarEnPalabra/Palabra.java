/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_BuscarEnPalabra;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Palabra {

    Scanner s = new Scanner(System.in);
    String palabra = "";
    String vocales = "aeiou";
    String consonante = "bcdfghjklmnpqrstvxzwy";
    String numeros = "0123456789";

    public void Palabra() {
        System.out.println("Introduzca una palabra");
        palabra = s.next();
    }

    public void Buscar_vocales() {
        int contador_voc = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador_voc++;
            }
        }
        System.out.println("Vocales: " + contador_voc);
    }

    public void Buscar_consonantes() {
        int contador_con = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f'
                    || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k'
                    || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q'
                    || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || letra == 'x' 
                    || letra == 'z' || letra == 'w' || letra == 'y') {
                contador_con++;
            }
        }
        System.out.println("Consonates: " + contador_con);
    }

    public void Buscar_numeros() {
        int contador_num = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4'
                    || letra == '5' || letra == '6' || letra == '7' || letra == '8' || letra == '9') {
                contador_num++;
            }
        }
        System.out.println("Numeros: " + contador_num);
    }

    /*public String toString(){
        //System.out.println("Consonates: " + contador_con);
        //;
    }*/
}
