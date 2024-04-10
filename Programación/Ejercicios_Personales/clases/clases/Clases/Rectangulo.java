/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Rectangulo {

    int base;
    int altura;
    Rectangulo(int b,int a){
        base = b;
        altura = a;  
    }
    int area() {
        int a = base * altura;
        return a;
    }

    int perimetro() {
        int pr = (base + altura) * 2;
        return pr;
    }
}
