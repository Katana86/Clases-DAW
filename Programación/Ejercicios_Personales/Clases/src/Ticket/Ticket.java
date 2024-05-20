
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ticket {

    //COMPARTE LAS COSAS EN TODAS LAS CLASES
    int total;
    int descuento;

    //CREO UNA CLASE QUE ALMACENA EL NUEVO PRODUCTO
    public void nuevoProducto(int prod, int pre) {
        Scanner s = new Scanner(System.in);
        if (prod == 3) {
            int reduccion;
            reduccion = 2;
            total = reduccion * pre;
            System.out.println("("+prod+")"+"/"+reduccion +" * "+pre+" = "+total);
        }else{
            int totalProducto = prod * pre;
            total = total + totalProducto;
            System.out.println(prod + " * " + pre + " = " + totalProducto);
        }
    }

    //MUESTRA EL TOTAL DE LOS PRODUCTOS
    public void verTotal() {
        System.out.println("total: " + total);
    }

    public void descuento() {
        if (total >= 200) {
            descuento = (total * 30) / 100;
            int tDescuento;
            tDescuento = total - descuento;
            System.out.println("DESCUENTO APLICADO: " + descuento + " %");
            System.out.println("total: " + tDescuento);
        } else if (total >= 50) {
            descuento = (total * 10) / 100;
            int tDescuento;
            tDescuento = total - descuento;
            System.out.println("DESCUENTO APLICADO: " + descuento + " %");
            System.out.println("total: " + tDescuento);
        }
    }
}
