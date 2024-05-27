/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class Ejercicio3 {

    static FileInputStream archivo;

    public static void ejecutar() {
        copiar();
    }

    public static void copiar() {
        try (FileInputStream origen = new FileInputStream("data/ejercicio_3/ejercicio_3.mkv");
        BufferedInputStream bOrigen = new BufferedInputStream(origen);
            FileOutputStream destino = new FileOutputStream("data/ejercicio_3/copy_ejercicio_3.mkv");)
            
            
                {
                byte[] datos = new byte[1024];
                int valor = origen.read(datos);
                while (valor > 0) {
                    destino.write(datos, 0, valor);
                    valor = origen.read(datos);
                }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (IOException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//MI CODIGO

    /*try {
            archivo = new FileInputStream("data\\ejercicio_3\\ejercicio_3.mkv");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
            DataInputStream dis;
            DataOutputStream dos;
            boolean salir = false;
            try {
                //El DataInput Lee el fichero de entrada
                dis = new DataInputStream(archivo);
                //El DataOutput Guarda el archivo copiado
                dos = new DataOutputStream(new FileOutputStream("data\\ejercicio_3\\Copia_ejercicio_3.mkv"));
                //Leemos los bytes del archivo
                byte caracter;
                //Cuando detecte que es diferente a salir lo repetira
                //AVISO
                    System.out.println("COPIANDO...");
                while (!salir) {
                    //El DataInput lee los bytes
                    try{
                    caracter = dis.readByte();
                    //mientras el DataOutput escribe esos bytes
                    dos.write(caracter);
                } catch (EOFException ex) {
                //AVISO
                System.out.println("Copiado Completado");
                //Salimos
                salir = true;
                //Mediante la excepción lo cerramos cuando se haya completado
            }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }*/
