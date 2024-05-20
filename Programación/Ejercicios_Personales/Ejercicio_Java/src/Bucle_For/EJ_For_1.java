/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_For;

import java.io.IOException;

/**
 *
 * @author Alumno avanzado
 */
public class EJ_For_1 {

    public static void main(String[] args) {
        int i;
        int j;
        
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
     
        //---------------------------------------------------
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        //----------------------------------------------------
        for (i = 0, j = 10; i <= j; i++, j--) {
            System.out.println(i + " "+j);
        }
        //----------------------------------------------------
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //----------------------------------------------------
        for (; i >= 0; i--) {
            System.out.println(" "+i);
        }
    }
}
