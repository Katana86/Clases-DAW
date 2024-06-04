/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Puerta;

/**
 *
 * @author ivanpa
 */
public class PuertaCoche extends ComponentedeCoche implements Alarma,PuertaBloqueable{
    private boolean estaBloqueada;

    public PuertaCoche(boolean estaBloqueada,String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
        this.estaBloqueada = estaBloqueada;
    }

    public void setEstaBloqueada(boolean estaBloqueada) {
        this.estaBloqueada = estaBloqueada;
    }

    @Override
    public void activarAlarma() {
        System.out.println("Alarma activada");
    }

    @Override
    public void desactivarAlarma() {
        System.out.println("Alarma desactivada");
    }

    @Override
    public void bloquea() {
        this.estaBloqueada = true;
    }

    @Override
    public void desbloquea() {
        this.estaBloqueada = false;
    }

    @Override
    public void abrir() {
        System.out.println("Puerta Abierta");
    }

    @Override
    public void cerrar() {
        System.out.println("Puerta cerrada");
    }

    @Override
    public boolean isAlarmaActivada() {
        System.out.println("No tengo ni idea");
        return true;
    }

    @Override
    public String toString() {
        return "PuertaCoche{"+"descripcion= " + this.getDescripcion() + ", peso= " + this.getPeso() + ", coste= " + this.getCoste() + ", estaBloqueada= " + estaBloqueada + '}';
    }

    
    
    
}
