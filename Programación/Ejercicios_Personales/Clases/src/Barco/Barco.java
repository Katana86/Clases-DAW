/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Barco;

/**
 *
 * @author Alumno avanzado
 */
public class Barco {

    int total;
    int pesoMaximo;

    Barco(int pMaximo) {
        pesoMaximo = pMaximo;
    }

    public void añadirCarga(int peso) {

        if (total + peso > pesoMaximo) {
            System.out.println("Imposible, Carga maxima superada");

        } else {
            total = total + peso;

            System.out.println("Peso Actual: " + total);
        }
    }

    public void vaciarCarga(int vaciar) {
        if (total - vaciar < 0) {
            System.out.println("Has quitado demasiado peso");
        } else {
            total = total - vaciar;
            System.out.println("Carga vaciada: " + total);
        }
    }

    public int getTotal() {
        return total;
    }
}
