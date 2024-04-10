
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

    float total;

    public void nuevoProducto(int prod, int pre) {
                Scanner s = new Scanner(System.in);
                int totalProducto = prod * pre;
                total = total + totalProducto;
                System.out.println(prod+" * "+pre+" = "+totalProducto);
                System.out.println("total: "+total);
    }
}
