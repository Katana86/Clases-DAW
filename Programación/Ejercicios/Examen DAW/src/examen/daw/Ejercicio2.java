/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;



/**
 *
 * @author 
 */
public class Ejercicio2 {
static FileReader archivo;
static String linea;
    public static void ejecutar() throws IOException {
        buscarpalabra();
    }
    
    public static void buscarpalabra() throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        File arch = new File("data/ejercicio_2/ejercicio_2.txt");
        int contador = 0;
        String buscada = "";
        String linea = "";
        String[] palabras;
        System.out.println("Escribe la palabra a buscar: ");
        buscada = sc.next();
        try (FileReader fr = new FileReader(arch);
        BufferedReader br = new BufferedReader(fr);){
            linea = br.readLine();
            while (linea != null){
                palabras = linea.split(" ");
                for (String p:palabras) {
                    if (p.toLowerCase().contains(buscada.toLowerCase())) {
                        contador++;
                    }
                }
                linea = br.readLine();
            }
            System.out.println("La palabra aparece: "+contador);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

// MI CODIGO

/*//CUENTA LAS PALABRAS QUE LEE
        int contadorpalabras = 0;
        //IMPRIME LA CADENA PARA LA HERRAMIENTA.LEERSTRING(STRING CADENA)
        String cadena = "palabra: ";
        //MENSAJE DE BIENVENIDA
        System.out.println("Introduzca una palabra a buscar");
        //ALMACENA LA PALABRA A BUSCAR
        String palabra = Herramientas.leerString(cadena);
        //LEE EL ARCHIVO
        archivo = new FileReader("data\\ejercicio_2\\ejercicio_2.txt");
        BufferedReader br = new BufferedReader(archivo);
        linea = br.readLine();
        //BUSCA LA LINEA QUE CONTENGA LA PALABRA
        while (linea != null){
            contadorpalabras++;
            linea.equals(linea);
            linea = br.readLine();
            System.out.println(linea);
        }
        
        System.out.println("palabras totales: "+" "+contadorpalabras++);*/