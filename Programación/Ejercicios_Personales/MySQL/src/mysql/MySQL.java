/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysql;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno avanzado
 */
public class MySQL {

    static Scanner teclado = new Scanner(System.in);
 
    static PreparedStatement psd;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            //BuscarID();
            //BuscarNom();
            BorrarID();
            //InsertarValor();
            //MostrarTabla();
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void InsertarValor() throws SQLException {
        Connection cn = conexion();
        

        psd = cn.prepareStatement("INSERT INTO tienda.fabricante (id,nombre) VALUES (?,?);");
        System.out.println("Inserte la ID del campo");
        psd.setInt(1, teclado.nextInt());
        System.out.println("Inserte un nombre");
        psd.setString(2, teclado.next());
        
        System.out.println("Valor: " + psd.executeUpdate());
        
        cn.close();
    }
    
    public static Connection conexion() throws SQLException{
            String url = "jdbc:mysql://localhost:3306/tienda",
            user = "root",
            password = "root";
    Connection cn = DriverManager.getConnection(url,user,password);
    return cn;
}
    
    public static void MostrarTabla() throws SQLException{
        Statement st;
        ResultSet rs;
        Connection cn = conexion();
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM tienda.fabricante");
        
        while (rs.next()){
            System.out.println("ID: "+rs.getInt(1));
            System.out.println("Nombre: "+rs.getString(2));
        }
    }
    
    public static PreparedStatement BuscarID() throws SQLException {
        Connection cn = conexion();

        psd = cn.prepareStatement("SELECT * FROM tienda.fabricante WHERE ID = ?");
        System.out.println("Introduzca el ID a buscar");
        psd.setInt(1, teclado.nextInt());
        ResultSet rs = psd.executeQuery();
        
        while (rs.next()){
            System.out.println("Nombre: "+rs.getString(2));
        }
        
        return psd;
    }
    
    public static PreparedStatement BuscarNom() throws SQLException {
        Connection cn = conexion();

        psd = cn.prepareStatement("SELECT * FROM tienda.fabricante WHERE nombre = ?");
        System.out.println("Introduzca el Nombre a buscar");
        //Index se refiere a la ? del PreparedStatement;
        psd.setString(1, teclado.next());
        ResultSet rs = psd.executeQuery();
        
        while (rs.next()){
            System.out.println("ID: "+rs.getInt(1));
        }
        
        return psd;
    }
    
    public static PreparedStatement BorrarID() throws SQLException{
        Connection cn = conexion();
        psd = cn.prepareStatement("DELETE FROM tienda.fabricante WHERE id = ?");
        System.out.println("Introduzca el ID a borrar");
        psd.setInt(1, teclado.nextInt());
        System.out.println("Borrado: "+psd.executeUpdate());
        return psd;
    }
    
   
    
    

}

/*System.out.println("Contenido de la tabla");
//ResultSetMetaData rsmd;
//String sql = "SELECT * FROM fabricante";
            //Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //ResultSet rs = st.executeQuery("SELECT * FROM tienda.fabricante");
            rs.next();
            int numero;
            do {
                System.out.println("ID: " + " " + rs.getString("id"));
                System.out.println("Nombre: " + " " + rs.getString("nombre"));
                System.out.println("");
                numero = teclado.nextInt();
                if (numero == 1) {
                    rs.next();
                } else if (numero == 2) {
                    rs.previous();
                }
            } while (numero != 0);

            /*while  (rs.previous()){
                System.out.println("ID: "+" "+rs.getString("id"));
                System.out.println("Nombre: "+" "+rs.getString("nombre"));
                System.out.println("");
            }*/
 /*rsmd = (ResultSetMetaData) rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            
            for (int i = 1; i <= columnas; i++) {
                System.out.println(rsmd.getColumnName(i) + "    ");
            }
            System.out.println("");
            
            while (rs.next()){
                for (int i = 1; i <= columnas; i++) {
                    System.out.println(rs.getString(i) + "      ");
                }
                System.out.println("");
            }*/
//rs.getMetaData().getColumnCount();
/*while (rs.next()) {
            System.out.println(rs.getString("nombre"));
            System.out.println(rs.getString("id"));
            }*/
//String fabricante = "INSERT INTO fabricante(id,nombre) VALUES(11,'Panasonic')";
            //st.executeUpdate(fabricante);
