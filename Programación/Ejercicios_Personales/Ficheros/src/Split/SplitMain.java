/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Split;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class SplitMain {

    //static Scanner s = new Scanner(System.in);
    //static String texto;
    static FileReader archivo;
    static BufferedReader br;
    static String linea;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        archivo = new FileReader("split.txt");
        br = new BufferedReader(archivo);
        linea = br.readLine();
        String[] dividir = linea.split(" ");
        while (linea != null) {
            linea = br.readLine();
        }
        for (int i = 0; i < dividir.length; i++) {
            System.out.println(dividir[i]);
        }
        
    }
}

/*System.out.println("Introduzca un texto para dividir");
        texto = s.next();
        String[] dividir = texto.split(";");
        for (int i = 0; i < dividir.length;i++) {
        System.out.println(dividir[i]);
    }*/
