/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays.explicación;

/**
 *
 * @author ivanpa
 */
public class ArraysExplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        leerArray();
    }
    
    
    public static void leerArray() {
    /**
     * Crear ARRAY
    */
    int[] a = {23,-4,0,17,-25};
    
    /**
     * Agregar el array y lo imprime
     */
    for (int i = 0; i < a.length ; i++){
        System.out.println("El valor de a ("+i+")es" + a[i]);
    }
   }}
