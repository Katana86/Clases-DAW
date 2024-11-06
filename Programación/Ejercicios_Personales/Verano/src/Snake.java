/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno avanzado
 */
public class Snake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño = (int) (Math.random() * 10) + 5;
        tablero(tamaño);
    }
    
    public static void tablero(int tamaño){
        char linea = '-';
        String hueco = "| |";
        for (int i = 0; i < tamaño; i++) {
            System.out.print(linea);
        }
        for (int i = 0; i < tamaño - 2; i++) {
            System.out.print(hueco);
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.print(linea);
        }
        System.out.println("");
    }
    
}
