/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RAMONFR
 */
public class Ejercicio1 {

    private static Connection cn;
    private static String url = "";
    private static String user = "";
    private static String pass = "";

    public static void ejecutar() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/ejercicio_1/config.txt"));){
            String linea = br.readLine();
            String[] valores;
            while (linea != null){
                valores = linea.split("=");
                if (valores[0].equals("url")) {
                    url = valores[1];
                }else if (valores[0].equals("user")) {
                    user = valores[1];
                }else if (valores[0].equals("pass")){
                    pass = valores[1];
                }
                linea = br.readLine();
            }
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    

    public static Connection getConnection() {
        try {
            cn = DriverManager.getConnection(url,user,pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return cn;
    }

}
