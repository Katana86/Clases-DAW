/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author ramonfr
 */
public class Ejercicio2 {

    private static Connection cn = Ejercicio1.getConnection();

    public static void ejecutar() {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data/ejercicio_2/proveedores.dat"))) {
            try (Statement st = cn.createStatement(); ResultSet rs = st.executeQuery("SELECT * FROM proveedores");) {
                while (rs.next()) {
                    os.writeObject(new Proveedor(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7)
                    ));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
