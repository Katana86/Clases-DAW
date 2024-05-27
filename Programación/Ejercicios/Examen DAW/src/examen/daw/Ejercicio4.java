/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import examen.daw.Actor;
import examen.daw.Herramientas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*
*       AÑADE TÚ CODIGO
*
 */
/**
 *
 * @author
 */
public class Ejercicio4 {

    static List<Actor> actores = new ArrayList<Actor>();
    static String nombre = null;
    static String apellidos = null;
    static LocalDate fecha;
    static Statement st;
    static PreparedStatement pst;
    static ResultSet rs;
    static Connection cn;
    static String url = "jdbc:mysql://172.21.29.50:3306/sakila", user = "userDAW", password = "Java";

    public static void ejecutar() {

        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            cargarDatos();
            menu();
            actualizarDatos();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        /*
*
*       AÑADE TÚ CODIGO
*
         */
    }

    private static void menu() {
        byte option;
        int id = 0;

        do {
            System.out.println("**************************");
            System.out.println("*** Ejercicio 4 - MENÚ ***");
            System.out.println("**************************");

            System.out.println("\t(1) Mostrar actores.");
            System.out.println("\t(2) Modificar un actor.");
            System.out.println("\t(3) Añadir nuevo actor.");
            System.out.println("\t(4) Elminar actor.");
            System.out.println("\t(0) Salir.");
            option = Herramientas.validarOpcion(0, 4);
            switch (option) {
                case 1:
                    mostrarActores();
                    break;
                case 2:
                    modificarActor();
                    break;
                case 3:
                    addActor();
                    break;
                case 4:
                    eliminarActor();
                    break;
            }
        } while (option != 0);

    }

    private static void mostrarActores() {
        Iterator it = actores.iterator();
        Actor act;
        System.out.println("*** Listado de actores ***");

        while (it.hasNext()) {
            act = (Actor) it.next();
            if (!act.isEliminado()) {
                System.out.println(act);
            }
        }

        System.out.println("");
    }

    private static void modificarActor() {
        Actor actor;
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                actor = act;
                System.out.println("Datos originales del actor: ");
                System.out.println(act);
                System.out.println("");
                actor.setNombre(Herramientas.leerString("Introduce el nombre: "));
                actor.setApellidos(Herramientas.leerString("Introduce los apellidos: "));
                actor.setFechaNacimiento(Herramientas.leerFecha("Introduce la fecha de nacimiento: "));
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void addActor() {
        String nombre, apellidos;
        LocalDate fecha;
        nombre = Herramientas.leerString("Inroduce el nombre: ");
        apellidos = Herramientas.leerString("Inroduce los apellidos: ");
        fecha = LocalDate.parse(Herramientas.leerString("Inroduce la fecha de nacimiento: "));
        actores.add(new Actor(nombre, apellidos, fecha));
    }

    private static void eliminarActor() {
        boolean realizado = false;
        int id = Herramientas.leerInt("Introduce el id del actor: ");
        for (Actor act : actores) {
            if (act.getId() == id) {
                if (act.isNuevo()) {
                    actores.remove(act);
                } else {
                    act.setEliminado(true);
                }
                realizado = true;
            }

        }
        if (!realizado) {
            System.out.println("El id = " + id + " no ha sido encontrado.");
        }
    }

    private static void cargarDatos() {
        try (Statement st = cn.createStatement();) {

            String sql = "SELECT * FROM actor";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                actores.add(new Actor(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toLocalDate()));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private static void actualizarDatos() {

        try {
            PreparedStatement insert = cn.prepareStatement("INSERT INTO actor (first_name,last_name,last_update) VALUES (?,?,?)");
            PreparedStatement update = cn.prepareStatement("UPDATE actor SET first_name = ?,last_name = ?,last_update = ? WHERE actor_id = ?");
            PreparedStatement delete = cn.prepareStatement("DELETE FROM actor WHERE actor_id = ?");
            for (Actor act : actores) {
                if (act.isNuevo()) {
                    insert.setString(1, act.getNombre());
                    insert.setString(2, act.getApellidos());
                    insert.setDate(3, Date.valueOf(act.getFechaNacimiento()));
                    insert.executeUpdate();
                }

                if (act.isModificado()) {
                    update.setString(1, act.getNombre());
                    update.setString(2, act.getApellidos());
                    update.setString(3, act.getFechaNacimiento().toString());
                    update.setInt(4, act.getId());
                    update.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
