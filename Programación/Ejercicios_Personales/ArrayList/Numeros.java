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
public class Numeros {
   
    public static void main(String[] args) { 
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(6);
        n.add(7);
        n.add(2);
        n.add(22);
        n.add(52);

      
        for (int i = 0; i < n.size(); i++) {
            System.out.println( n.get(i));
        }
      
    }

}
