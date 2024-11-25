/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Iván
 * @version 1.00 TENER UNA CLASE CIRCULO EN EL QUE LA CLASE QUE NECESITO ES
 * FLOAT EN DONDE LO MAS BASICO ES EL AREA OTRA CLASE QUE SEAN CIRCULOS METODO
 * FLOAT QUE SEA AREA TOTAL UNA CLASE CIRCULO ARRAYLIST DONDE SE AÑADAN CIRCULOS
 * CALCULE EL AREA TOTAL DE LOS CIRCULOS.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulos c = new Circulos();
        Rectangulos r = new Rectangulos();
        Numeros n = new Numeros();
        c.añadir(new Circulo(1));
        c.añadir(new Circulo(1));
        c.añadir(new Circulo(3));
        c.SUM_area();
        r.añadir(new Rectangulo(5,7));
        r.SUM_area();
        System.out.println(n.toString());
        System.out.println(r.toString());
        System.out.println(c.toString());
    }

}
