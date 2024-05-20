/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 *
 * @author Alumno avanzado
 */
public class ficheros {
static int Sumar;
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader archivo = new FileReader("Empleado.txt");
        BufferedReader buffer = new BufferedReader(archivo);
        String linea;
        
        int NumeroLineas = 0;

        linea = buffer.readLine();
        while (linea != null) {
            NumeroLineas++;
            System.out.println(linea);
            String[] datos = linea.split(";");
            System.out.println("Nombre " + datos[0]);
            System.out.println("Salario: " + datos[3]);
            Sumar = Sumar + Integer.parseInt(datos[3]);
            System.out.println("Suma: "+Sumar);
            linea = buffer.readLine();
        }
        System.out.println(NumeroLineas);
    }
}
