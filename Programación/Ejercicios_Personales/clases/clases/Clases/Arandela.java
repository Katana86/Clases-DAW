/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Arandela{
    int radioMayor;
    int radioMenor;
    
    public class Arandela_Cuadrada{
        int base;
    }
    
    Arandela(int rma,int rme){
        radioMayor = rma;
        radioMenor = rme;
    }
    
    float area(){
        
        float a1,a2,a;
        
        
        a1 = (float) (3.14*radioMayor*radioMayor);
        a2 = (float) (3.14*radioMenor*radioMenor);
        a = a1 - a2;
        return a;
    }
        
}
