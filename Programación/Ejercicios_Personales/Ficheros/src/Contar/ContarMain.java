/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alumno avanzado
 */
public class ContarMain {

    static String[] ficheros = {"Numeros.txt", "Numeros2.txt","Numeros3.txt"};
    static String[] nombres = {"Jose", "Luis", "Maria"};
    static FileReader archivo;
    static BufferedReader br;
    static String linea;


    public static void main(String[] args) throws FileNotFoundException, IOException {
             int ContarNumeros = 0;
            int ContarPositivos = 0;
            int ContarNegativos = 0;
      
        for (int i = 0; i < ficheros.length; i++) {
            archivo = new FileReader(ficheros[i]);

            br = new BufferedReader(archivo);
            linea = br.readLine();
            
 int  Sumar = 0;
       
            while (linea != null) {
                //System.out.println(linea);
                ContarNumeros++;

                Sumar = Sumar + Integer.parseInt(linea);
                linea = br.readLine();
                if (Sumar >= 0) {
                    ContarPositivos++;
                } else {
                    ContarNegativos++;
                }
                System.out.println(Sumar);
                PrintWriter ps = new PrintWriter("Suma"+ficheros[i]);
                ps.write("Esta es la suma"+" "+Sumar);
                ps.close();
            }
        }
            System.out.println("Media: " + ContarNumeros / 7);
            System.out.println("Numeros Totales: " + ContarNumeros);
            System.out.println("Numeros Positivos: " + ContarPositivos);
            System.out.println("Numeros Negativos: " + ContarNegativos);
            //Para ecribir hace falta un variable.write/println y cerrarlo
        
        
            PrintWriter pw = new PrintWriter("Numeros_suma_pw.txt");
            pw.println("Suma: " + Sumar);
            pw.println("Media: " + ContarNumeros / 7);
            pw.println("Numeros Totales: " + ContarNumeros);
            pw.println("Numeros Positivos: " + ContarPositivos);
            pw.println("Numeros Negativos: " + ContarNegativos);
            pw.close();
        
        
    }
}
