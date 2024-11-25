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
public class Rectangulos {
    ArrayList<Rectangulo> r = new ArrayList<Rectangulo>();
    
    public void añadir(Rectangulo a){
        r.add(a);
    }
    
    public float SUM_area(){
        float area = 0;
        for (int i = 0; i < r.size(); i++) {
            area = area+r.get(i).Area();
        }
        return area;
    }
    
    public String toString(){
        return "Area Rectangulo: "+SUM_area();
    }
}
