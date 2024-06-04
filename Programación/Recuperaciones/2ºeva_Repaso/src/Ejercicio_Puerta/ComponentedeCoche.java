/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Puerta;

/**
 *
 * @author ivanpa
 */
public class ComponentedeCoche {
    String descripcion;
    double peso;
    double coste;
    
    ComponentedeCoche(String descripcion,double peso,double coste){
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "ComponentedeCoche{" + "descripcion=" + descripcion + ", peso=" + peso + ", coste=" + coste + '}';
    }
    
    
}
