/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Numero_grande;

/**
 *
 * @author Alumno avanzado
 */
public class Numero_grande {

    /**
     * funcion de numero de 2 cifras ej 15/30 devolver true si la primera es
     * mayor que la segunda
     */
    public static void main(String[] args) {
        System.out.println(Numero_grande(30));
    }

    public static boolean Numero_grande(int Numero) {
        int decenas = Numero / 10;
        int unidades = Numero % 10;
        if (decenas > unidades) {
            return true;
        } else {
            return false;
        }
    }

}
