/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAMONFR
 */
public class Ejercicio3 {

    private static Connection cn = Ejercicio1.getConnection();

    public static void ejecutar() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data/ejercicio_3/empleados.dat"));){
            try (Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    ResultSet rs = st.executeQuery("SELECT * FROM empleados")){
                rs.last();
                do{
                    
                }while();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
