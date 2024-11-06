/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dibujos_Bucles;

/**
 *
 * @author Alumno avanzado
 */
public class Aleatoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int eleccion;
        int tamaño;
        int array = (int) (Math.random() * 5 + 1);
        for (int i = 1; i < array; i++) {
            System.out.println("Dibujo: " + i);
            System.out.println("");
            eleccion = (int) (Math.random() * 22) + 1;
            tamaño = (int) (Math.random() * 6) + 7;
            Dibujos d = new Dibujos();
            d.dibujo(eleccion, tamaño);
            System.out.println("eleccion: " + eleccion);
            System.out.println("Tamano: " + tamaño);
            System.out.println("");
        }

    }

}
