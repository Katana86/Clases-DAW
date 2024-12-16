/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Ejercicio1.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Aula {
    Alumno[] arr = new Alumno[5];
    int ultimo = 0;
    
    public Aula() {

    }

    public void ARR_Alumno(Alumno a) {
        arr[ultimo] = a;
        ultimo++;
    }
}
