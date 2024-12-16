/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Clase.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Alumno {
    private String nombre;
    private int edad;
    private float nota;
    
    Alumno(){
    }
    
    Alumno(String n,int ed,int nt){
        nombre = n;
        edad = ed;
        nota = nt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
