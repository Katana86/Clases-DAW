/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataOutputStream;

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
 * @author Alumno avanzado
 */
public class Copiar {

    public static void main(String[] args) {
        DataInputStream dis;
        DataOutputStream dos;
        boolean salir = false;
        String nombreFichero="Ejemplos C++.pdf";
        try {
            dis = new DataInputStream(new FileInputStream(nombreFichero));
            dos = new DataOutputStream(new FileOutputStream("copia"+nombreFichero));
            byte caracter;
            while (!salir) {
                try {
                    caracter = dis.readByte();
                 //   System.out.println(caracter);
                    dos.write(caracter);
                } catch (EOFException ex) {
                    salir=true;
                  //  Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (EOFException ex) {
            salir = true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
