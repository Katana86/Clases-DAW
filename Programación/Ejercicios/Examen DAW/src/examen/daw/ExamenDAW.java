/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.daw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author RAMONFR
 */
public class ExamenDAW {
    static FileReader dir;
    static String linea;
    static int numEjer = 4;

    /**
     * @param args the command line arguments
     */
    //LO TUVE QUE MODIFICAR PARA AÑADIR LA SQLEXCEPTION
    public static void main(String[] args) throws IOException, SQLException {
        int ejer = 0;

        menu();

        //sc.close();
        // TODO code application logic here
    }
 //LO TUVE QUE MODIFICAR PARA AÑADIR LA SQLEXCEPTION
    private static void menu() throws IOException, SQLException {
        int option = 0;

        do {
            System.out.println("*** MENÚ ***");
            for (int i = 1; i <= numEjer; i++) {
                System.out.println("\t(" + i + ") Ejercicio " + i + ".");
            }
            System.out.println("\t(0) Salir.");
            option = Herramientas.validarOpcion(0, numEjer);
            switch (option) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
            }
        } while (option != 0);
    }
    
}
