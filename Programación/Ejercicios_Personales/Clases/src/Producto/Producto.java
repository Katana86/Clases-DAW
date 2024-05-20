/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author Alumno avanzado
 */
public class Producto {
    String nombre;
    float pvp;
    
    Producto(String nom,float pvp){
        nombre = nom;
        this.pvp = pvp;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getPvp(){
        return pvp;
    }
    
    @Override
    public String toString(){
        return "El nombre del producto es: "+nombre+" "+"El precio del producto: "+" "+pvp+""+" ";
    }
}
