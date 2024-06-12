/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Aeropuerto;

import examen240314.Datos;
import examen240314.Usuarios;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ivanpa
 */
public class main {

    static Scanner sc = new Scanner(System.in);
    private static int opcion = 0;
    private static ArrayList<vuelo> Vuelos = new ArrayList();

    public static void main(String[] args) {
        cargarDatos();
        if (loguear()) {
            do {
                opcion = menu();
                switch (opcion) {
                    case 1:
                        mostrarLista();
                        break;
                    case 2:
                        darSalida();
                        break;
                    case 3:
                        actualizarLista();
                        break;
                    case 4:
                        modificarVuelo();
                        break;
                }
            } while (opcion != 5);
        }

    }

    private static boolean loguear() {
        String user = "";
        String pass = "";
        Usuarios usuarios = new Usuarios();
        int contador = 0;
        do {
            System.out.println("Introduzca un usuario");
            user = sc.nextLine();
            System.out.println("");
            System.out.println("Introduzca la contrasena");
            pass = sc.nextLine();
            if (usuarios.getUsuarios().containsKey(user)) {
                if (usuarios.getUsuarios().get(user).equals(pass)) {
                    return true;
                } else {
                    System.out.println("Usuario o contraseña incorrecto");
                    contador++;
                }
            } else {
                System.out.println("Usuario o contraseña incorrecto");
                contador++;
            }
        } while (contador < 3);
        return false;
    }

    private static int menu() {
        int op = 0;
        System.out.println("****MENU****");
        System.out.println("(1) Mostrar cola vuelos.");
        System.out.println("(2) Dar salida al vuelos.");
        System.out.println("(3) Actualizar Lista.");
        System.out.println("(4) Modificar Horarios.");
        System.out.println("(5) Salir.");
        System.out.println("");
        System.out.print("Escoge una opcion ");
        try {
            op = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Valor no valido. Repita la eleccion.");
        }
        return op;
    }

    private static void cargarDatos() {
        String[][] datos = Datos.getVuelos();

        for (String[] datosVuelo : datos) {
            Vuelos.add(new vuelo(datosVuelo[0], datosVuelo[1], datosVuelo[2],
                    LocalDateTime.parse(datosVuelo[3]),
                    LocalDateTime.parse(datosVuelo[4])));
        }
    }

    private static void mostrarLista() {

        Collections.sort(Vuelos);
        Iterator it = Vuelos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    private static void darSalida() {
        //Lo contrario de estar vacio
        if (!Vuelos.isEmpty()) {
            Vuelos.remove(0);
        }
    }

    private static void actualizarLista() {
        //vuelo vue;
        Iterator it = Vuelos.iterator();

        while (it.hasNext()) {
            //vue = (vuelo)it.next();
            if (((vuelo) it.next()).getSalida().isBefore(LocalDateTime.now())) {
                {
                    //if (vue.getSalida().isBefore(LocalDateTime.now())) {
                    //Vuelos.remove(vue);
                    it.remove();
                }
            }
        }
    }

    private static void modificarVuelo() {
        long minutos = 0;
        String code = "";
        Iterator it;
        vuelo vue;
        try {
            System.out.println("Introduce el codigo del vuelo");
            code = sc.next();
            it = Vuelos.iterator();
            while (it.hasNext()) {
                vue = (vuelo) it.next();
                if (vue.getCodigo().equals(code)) {
                    System.out.println("Valores negativos adelantan el vuelo.");
                    System.out.println("introduce los minutos a retrasar a modificar la salida del vuelo:");
                    minutos = sc.nextLong();
                    vue.setSalida(vue.getSalida().plusMinutes(minutos));
                    break;
                }
            }

        } catch (InputMismatchException ex) {
            System.out.println("Valor no valido: Repita la eleccion.user");
        }
    }
}
