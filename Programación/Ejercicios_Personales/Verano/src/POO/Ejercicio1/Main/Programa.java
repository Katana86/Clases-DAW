/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Ejercicio1.Main;

import POO.Ejercicio1.Clases.*;
import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    static Aula aula = new Aula();

    public static void main(String[] args) {
        aulaDefecto();  
        System.out.println("Aprobados: "+aula.aprobados());
        System.out.println("Suspensos: "+aula.suspensos());
        System.out.println("Porcentaje aprobados: "+aula.PorcentajeAprobados());
        System.out.println("Porcentaje suspensos: "+aula.PorcentajeSuspensos());
        aula.mostrarArray();
    }
    
    
    
    
    
    
    
    
    
    
    

    public static void aulaDefecto() {
        float[] notas = {5, 6, 7};
        float[] notas2 = {2, 3, 4};
        float[] notas3 = {5, 6, 7};
        float[] notas4 = {9, 5, 9};
        float[] notas5 = {2, 1, 2};
        float[] notas6 = {7, 5, 7};
        Alumno[] a = {new Alumno("Ivan", notas),
            new Alumno("Paco", notas2),
            new Alumno("Lola", notas3),
            new Alumno("Manolo", notas4),
            new Alumno("Paco.R", notas5),
            new Alumno("Maria", notas6)};
        
        for (int i = 0; i < a.length; i++) {
            aula.ARR_Alumno(a[i]);

        }
        //System.out.println(aula.medias());
      
      
    }

    /*public static void llenarAula() {

        Scanner usu = new Scanner(System.in);
        String nombre;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduzca el nombre: ");
            nombre = usu.next();
    float notas[] = new float[3];
            System.out.println("Introduzca las notas: ");
            System.out.println("Nota 1: ");
            notas[0] = usu.nextFloat();
            System.out.println("Nota 2: ");
            notas[1] = usu.nextFloat();
            System.out.println("Nota 3: ");
            notas[2] = usu.nextFloat();
            Alumno  a =new Alumno(nombre,notas);
            aula.ARR_Alumno(a);
        }
    }*/
    public void mostrarAlumnos() {

    }
}
