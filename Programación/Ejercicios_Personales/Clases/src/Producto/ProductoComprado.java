/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Alumno avanzado
 */
public class ProductoComprado{
    Producto p;
    int cantidad;

    
    ProductoComprado(Producto prod,int cantidad){
        this.cantidad = cantidad;
        this.p = prod;
    }
    
    public Producto getP(){
        return p;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public int total(){  
        float total;
        total = p.pvp * cantidad;
        return (int) total;
    }
    
    @Override
    public String toString(){
        return p.toString()+"und.  "+cantidad+" "+"El pvp total es: "+total();
    }
}
