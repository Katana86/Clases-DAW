/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Trapecio {
    int base_mayor;
    int base_menor;
    int altura;
    
    Trapecio(int bma,int bmo,int alt){
        base_mayor = bma;
        base_menor = bmo;
        altura = alt;
    }
    
    int area(){
        int a;
        a = (base_mayor+base_menor/2)*altura;
        return a;
    }
}
