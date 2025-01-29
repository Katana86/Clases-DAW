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
public class Can extends Animal implements Canido, Mascotas {
    public Can() {  }
    
    public Can(String raza, double peso, String paisProcedencia, String dataNac){
        super(raza,peso,paisProcedencia,dataNac);
    }

    @Override
    public void faceRuido() {
        System.out.println("O can ladra");
    }

    @Override
    public void dormir() {
        System.out.println("O can durme 8 horas");
    }

    @Override
    public void territorialidad() {
        System.out.println("O can ten un territorio");
    }

    @Override
    public void setNome(String nome) {
        System.out.println("O can chamase "+nome);
    }

    @Override
    public void xogar() {
        System.out.println("O can vai polo pau e o devolve");
    }

    @Override
    public void vacunar() {
        System.out.println("O can se vacuna");
    }

    @Override
    public String toString() {
        return "Can{"+super.toString()+'}';
    }
    
}
