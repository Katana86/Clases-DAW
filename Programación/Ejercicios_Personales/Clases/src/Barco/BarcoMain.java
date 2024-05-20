/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Barco;

/**
 *
 * @author Alumno avanzado
 */
public class BarcoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco b = new Barco(20);
        b.añadirCarga(10);
        b.añadirCarga(5);
        b.añadirCarga(6);
        b.añadirCarga(6);
        //b.vaciarCarga(9);
         System.out.println("Peso total: "+b.getTotal());
         b.vaciarCarga(1000);
         System.out.println("Peso total: "+b.getTotal());
         System.out.println("FIN ");
    }
    
}
