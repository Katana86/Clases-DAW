/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author
 */
public class Ejercicio1 {

    static File directorio;

    public static void ejecutar() throws IOException {
        leerFicheros();
    }

    public static void leerFicheros() {
        File base;
        Character tipo;

        base = new File("data/ejercicio_1");
        System.out.println("*** LISTADO ***");
        for (File arc : base.listFiles()) {
            if (arc.isDirectory()) {
                tipo = 'D';
            } else {
                tipo = 'F';
            }
            System.out.println("\t" + arc.getName() + "\t" + tipo);
        }
    }
}

//MI CODIGO

/* //No se como se hace la ruta relativa
        String ruta = "data\\ejercicio_1";
        //LEE EL DIRECTORIO
        directorio = new File(ruta);
        //LEE LOS FICHEROS QUE CONTIENE EL DIRECTORIO
        File[] ficheros = directorio.listFiles();
        //MEDIANTE UN FOR IMPRIME LOS FICHEROS
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println(ficheros[i]);
            //COMPRUEBA SI ES UN DIRECTORIO O UN FICHERO
            if (ficheros[i].equals(directorio.isDirectory())) {
                System.out.println("D");
            }
            if (ficheros[i].equals(directorio.isFile())){
                System.out.println("F");
            }
        }*/