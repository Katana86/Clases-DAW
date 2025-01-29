/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.animais;

import java.time.LocalDate;

/**
 *
 * @author Alumno avanzado
 */
public abstract class Animal {

    private static int genChip = 0;
    private final int chip;
    private String raza, paisProcedencia;
    private double peso;
    private LocalDate dataNac;

    public Animal() {
        this.chip = Animal.genChip++;
    }

    public Animal(String raza, double peso, String paisProcedencia, String dataNac) {
        this.chip = Animal.genChip++;
        this.raza = raza;
        this.peso = peso;
        this.paisProcedencia = paisProcedencia;
        this.dataNac = LocalDate.parse(dataNac);
    }

    public int getChip() {
        return chip;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double raza) {
        this.peso = peso;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public LocalDate getDataNac() {
        return dataNac;
    }

    public void setDataNac(String dataNac) {
        this.dataNac = LocalDate.parse(dataNac);
    }

    public abstract void faceRuido();

    public abstract void dormir();

    @Override
    public String toString() {
        return "Animal{" + "chip=" + chip + ", raza=" + raza + ", peso=" + peso
                + ", paisProcedencia=" + paisProcedencia + ", dataNac=" + dataNac + '}';
    }

}
