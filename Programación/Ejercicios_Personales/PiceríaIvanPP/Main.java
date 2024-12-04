/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PiceríaIvanPP;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 */
public class Main {

    static int numPizzas = 0;
    static double precioTotal = 0.00;
    

    public static void main(String[] args) {
        Pizza p = new Pizza();
        pedirPizza(p);
        System.out.println(p.toString());
        System.out.println("Precio total: " + precioTotal +
                "\n Numero de pizzas: " + numPizzas);
    }

    public static int menu() {
    Scanner usu = new Scanner(System.in);
        int elec;
        System.out.println("1.- Pedir pizza.\n"
                + "2.- Pedir oferta: 2x1.\n"
                + "3.- Pechar pedido.\n"
                + "Seleccione una opcion:");
        elec = usu.nextInt();
        return elec;
    }

    public static void pedirPizza(Pizza p) {
        int opcion = 0;

        do {
            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    p.Datos();
                    precioTotal = (p.getPrezo()+p.getPrezo());
                    
                    numPizzas++;
                }
                case 2 -> {
                    p.Datos();
                    precioTotal = (p.getPrezo()+p.getPrezo());

                    numPizzas++;

                    p.Datos();
                    p.setPrezo(0);

                    numPizzas++;
                }
                case 3 -> {
                    System.out.println("Buen Dia...");
                }
            }
        } while (opcion != 3);
    }
}
