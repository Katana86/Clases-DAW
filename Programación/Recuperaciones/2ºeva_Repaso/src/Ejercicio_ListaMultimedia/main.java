/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_ListaMultimedia;

import java.util.ArrayList;

/**
 *
 * @author ivanpa
 */
public class main {
    public static void main(String[] args){
        ListaMultimedia lm = new ListaMultimedia(25);
        for (int i = 0; i < 20; i++) {
            lm.add(new Multimedia("Nombre" + i));
        }
        
        System.out.println("Tamano " + lm.size());
        System.out.println("Objeto 10: "+lm.get(10));
        System.out.println("***********");
        System.out.println(lm.toString());
    }
}
