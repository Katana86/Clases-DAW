/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Alumno avanzado
 */
public class Circulos{
    ArrayList <Circulo> c = new ArrayList<Circulo>();
    public void añadir(Circulo r){
        c.add(r);
    }
    
    //SUMAR AREA DE LOS CIRCULOS
    public float SUM_area(){
        float area = 0;
        for (int i = 0; i < c.size(); i++) {
            area = area+c.get(i).area();
        }
        return area;
    }
    
    public String toString(){
        return "Area Ciruclo: "+SUM_area();
    }
}
