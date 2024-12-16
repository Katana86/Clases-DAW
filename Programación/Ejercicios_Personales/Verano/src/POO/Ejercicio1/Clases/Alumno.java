/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Ejercicio1.Clases;

/**
 *
 * @author Alumno avanzado
 */
public class Alumno {

    private String nombre;
    private float[] notas = new float[3];

    public Alumno(String n,float[] nt) {
        this.nombre = n;
        this.notas = nt;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float calcularMedia() {
        float suma = 0, media;
        for (int i = 0; i < notas.length; i++) {
            suma = suma+notas[i];
        }
         media=suma/ notas.length;
        return media;
    }
}
