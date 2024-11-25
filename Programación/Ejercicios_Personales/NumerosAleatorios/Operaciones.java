/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosAleatorios;

/**
 *
 * @author Alumno avanzado
 */
public class Operaciones {
    
    public void suma(int n1,int n2) {
        int suma = n1 + n2;
        System.out.println("Suma: " + suma);
    }
    
    public void multi(int n1,int n2) {
        int multi = n1 * n2;
        System.out.println("Multiplicacion: " + multi);
    }

    public void cociente(int n1,int n2) {
        float cociente = n1 / n2;
        System.out.println("Cociente: " + cociente);
    }

    public void res(int n1,int n2) {
        int resto = n1 % n2;
        System.out.println("Resto: " + resto);
    }
}
