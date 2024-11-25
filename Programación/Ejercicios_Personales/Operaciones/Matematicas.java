/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Matematicas {

    static String s = "((3x+y))+1";
    static String s2 = "[1-8]+(9*5)";

    public static void main(String[] args) {

        System.out.println(Corrector(s, '[', ']'));
        System.out.println(Corrector(s2, '[', ']'));

        System.out.println(Corrector(s2, "[]"));

    }

    public static boolean Corrector(String operacion, char ini_simbolo, char fin_simbolo) {
        int parinicial = 0;
        int parfin = 0;
        ////////////////////////////////////////////////
        for (int i = 0; i < operacion.length() && parinicial >= parfin; i++) {
            //ORDEN DE PARENTESIS
            if (operacion.charAt(i) == ini_simbolo) {
                parinicial++;
            } else if (operacion.charAt(i) == fin_simbolo) {
                parfin++;
            }
        }
        /////////////////////////////////////////////////
        boolean PAR_orden;
        if (parinicial == parfin) {
            PAR_orden = true;
        } else {
            PAR_orden = false;
        }
        return PAR_orden;
        ///////////////////////////////////////////////////
    }

    public static boolean Corrector(String operacion, String simbolos) {
              
        char ini_simbolo = simbolos.charAt(0);
        char fin_simbolo = simbolos.charAt(1);
        return Corrector(operacion,ini_simbolo,fin_simbolo);
        ///////////////////////////////////////////////////
    }
}


/*            if (operacion.charAt(i) == ini_simbolo) {
                parinicial++;
            } else if (operacion.charAt(i) == fin_simbolo) {
                parfin++;
            }
            if (operacion.charAt(i) == ini_simbolo) {
                parinicial++;
            } else if (operacion.charAt(i) == fin_simbolo) {
                parfin++;
            }*/
