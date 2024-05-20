/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Producto;

import Horario.Horas;

/**
 *
 * @author Alumno avanzado
 */
public class ProductoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p = new Producto("Queso",2.55f);
        Producto p2 = new Producto("Jamon",1.50f);
        Producto p3 = new Producto("Chorizo",6.50f);
        ProductoComprado pc = new ProductoComprado(p,2);
        ProductoComprado pc2 = new ProductoComprado(p2,3);
        ProductoComprado pc3 = new ProductoComprado(p3,2);
        Compra c = new Compra();
        c.anadirProducto(pc);
        c.anadirProducto(pc2);
        c.anadirProducto(pc3);
        System.out.println( p.getNombre());
      //  p.getPvp();
    //    pc.getCantidad();
      //  pc.getP();
        pc.toString();
        System.out.println(p.toString());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(p2.toString());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(pc.toString());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(c.toString());
        System.out.println(c.getTotalCompra());
    }
    
}
