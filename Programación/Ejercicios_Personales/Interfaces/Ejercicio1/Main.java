/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces.Ejercicio1;

/**
 *
 * @author ivanpp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static chamadaIvanPP ch = new chamadaIvanPP();
    static Llamada l = new Llamada();
    static LlamadaProvincial lp = new LlamadaProvincial();
    LlamadaLocal ll = new LlamadaLocal();

    public static void main(String[] args) {

        System.out.println(ch.informeCentralita());
        System.out.println(l.imprimir());
        System.out.println(lp.imprimir());
    }

}
