/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Areas_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //RECTANGULO
        Rectangulo r = new Rectangulo(7,3);
        System.out.println("El area de un rectangulo es: "+r.area());
        System.out.println("El perimetro del rectangulo es: "+r.perimetro());
        //CIRCULO
        Circulo c = new Circulo(15);
        System.out.println("El area del circulo es: "+c.Area());
        System.out.println("El perimetro del circulo es: "+c.Perimetro());
        //TRIANGULO
        Triangulo t = new Triangulo(25,12);
        System.out.println("El area del triangulo es: "+t.Area_Triangulo());
        //ARANDELA
        Arandela a = new Arandela(23,15);
        System.out.println("El area de la arandela es: "+a.area());
        //ARANDELA CUADRADA
        ArandelaCuadrada ac = new ArandelaCuadrada(3);
        System.out.println("El area de la arandela cuadrada es: "+ac.area());
        //TRAPECIO
        Trapecio tr = new Trapecio(15,12,14);
        System.out.println("El area del trapecio es: "+tr.area());
    }
    
}
