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

    Alumno[] arr = new Alumno[50];
    int ultimo = 0;

    public void ARR_Alumno(Alumno a) {
        arr[ultimo] = a;
        ultimo++;
    }

    public void mostrarArray() {
        for (int i = 0; i < ultimo; i++) {
            System.out.println(arr[i]);
        }
    }

    public float CalcularMedia() {
        float media;
        float suma = 0;
        for (int i = 0; i < ultimo; i++) {
            suma = suma + arr[i].calcularMedia();
        }
        media = suma / ultimo;
        return media;
    }

    public int aprobados() {
        int aprobados = 0;
        for (int i = 0; i < ultimo; i++) {
            if (arr[i].calcularMedia() >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public int suspensos() {
        int suspensos = 0;
        for (int i = 0; i < ultimo; i++) {
            if (arr[i].calcularMedia() < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    public float PorcentajeAprobados() {
        
        return aprobados()*100f/ultimo;
    }
    public float PorcentajeSuspensos() {
        
        return suspensos()*100f/ultimo;
    }
}
