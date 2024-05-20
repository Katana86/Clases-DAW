/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class ArandelaCuadrada {
    
    int base;
    
    ArandelaCuadrada(int b){
        base = b;
    }
    
    float area(){
        float pr,pc,ar,d,r;
        pr = base * base;
        d = base/3;
        r = d/3;
        pc = (float) (3.14*r*r);
        ar = pr-pc;
        return ar;
    }
}
