/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Triangulo {
    int base;
    int altura;
    
    Triangulo(int b,int a){
        base = b;
        altura = a;
    }
    
    int Area_Triangulo() {
        int at;
        at = base*altura/2;
        return at;
    }
}
