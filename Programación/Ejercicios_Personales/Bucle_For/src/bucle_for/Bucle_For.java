/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_for;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Bucle_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int numero;
        numero=s.nextInt();
        for (int i=1;i < numero-1; i++){
            System.out.println(i);
        }
    }
    
}
