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
public class Fichero {

    public static void main(String[] args) {
        /*DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("Numeros.raw"));
            try {
                dos.writeInt(65);
                dos.writeInt(66);
                dos.writeInt(67);
            } catch (IOException ex) {
                Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                dos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }*/

        DataInputStream dis;
        try {
            dis = new DataInputStream(new FileInputStream("numeros.raw"));
            boolean salir=false;
            while (!salir) {
                try {
                    int numero = dis.readInt();
                    System.out.println(numero);

                } catch (EOFException ex) {
                    salir=true;
                  //  Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
