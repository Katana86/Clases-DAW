/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arrays_Clase.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
       Alumno a = new Alumno("Ivan",22,5);
       Alumno a2 = new Alumno("Paco",34,7);
       Alumno a3 = new Alumno("Lola",45,2);
       Alumnos alumnos = new Alumnos();
       alumnos.anhadirAlumno(a);
       alumnos.anhadirAlumno(a2);
       alumnos.anhadirAlumno(a3);
       alumnos.Mostrar_Mayores_Edad();
       alumnos.Mostrar_Mayor_Edad();
       alumnos.Buscar();
    }
}
