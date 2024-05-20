/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Circulo {

    int radio;
    
    
    Circulo(int r){
        radio = r;
    }
    float Area() {
        float a;
        a = (float) (3.14 *radio*radio);
        return a;
    }
    float Perimetro(){
        float p;
        p = (float) (2 * 3.14 * radio);
        return p;
    }
}
