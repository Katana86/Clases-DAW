/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Alumno avanzado
 */
public class Compra {
    private int totalCompra=0;
    
    public void anadirProducto(ProductoComprado p){
       totalCompra=totalCompra+p.total();
       
    }

    public int getTotalCompra() {
        return totalCompra;
    }
    
    @Override
    public String toString(){
        return "El total de la compra es: "+totalCompra;
    }
}
