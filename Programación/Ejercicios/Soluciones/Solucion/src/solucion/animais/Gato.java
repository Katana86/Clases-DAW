/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.animais;

import solucion.interfaces.*;

/**
 *
 * @author Alumno avanzado
 */
public class Gato extends Animal implements Felido, Mascotas{

    @Override
    public void faceRuido() {
        System.out.println("O gato maulla.");
    }

    @Override
    public void dormir() {
        System.out.println("O gato durme moitisimo.");
    }

    @Override
    public void escupeBolasPelo() {
        System.out.println("O gato debe excupir bolas de pelo, ou enferma.");
    }

    @Override
    public void setNome(String nome) {
        System.out.println("O gato chamase "+nome);
    }

    @Override
    public void xogar() {
        System.out.println("O gato xoga con ovillos de la, e nunca trae o pau.");
    }

    @Override
    public void vacunar() {
        System.out.println("O gato ten que vacunarse regularmente.");
    }

    @Override
    public String toString() {
        return "Gato{"+super.toString()+'}';
    }
    
}
