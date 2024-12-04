/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExposiciónsNarón;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 */
public class Evento {

    String nom;
    double ganancias = 0.0;
    int numeroZonas = 0;
    Zona z = new Zona();
    Zona[] zone = {new Zona("Principal", 1000, 30),
        new Zona("Gallinero", 200, 40),
        new Zona("VIP", 25, 60)};

    static Scanner usu = new Scanner(System.in);

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public Zona[] getZone() {
        return zone;
    }

    public void setZone(Zona[] zone) {
        this.zone = zone;
    }

    public void XestionZonas(int capacidadeInicial) {
        this.zone = new Zona[capacidadeInicial];
        this.numeroZonas = 0;
    }

    private void expandirArray() {
        Zona[] novoArray = new Zona[zone.length * 2];
        System.arraycopy(zone, 0, novoArray, 0, zone.length);
        zone = novoArray;
    }

    public void añadirZonas(Zona zona) {
        if (numeroZonas >= zone.length) {
            expandirArray();
        }
        zone[numeroZonas] = zona;
        numeroZonas++;
    }

    public void setNumEntradas() {
        int temp, index = 0;

        System.out.println("Introduzca el numero de entradas para:");

        for (int i = 0; i < zone.length; i++) {
            System.out.println("\t" + zone[i].getNome() + ":");
            temp = usu.nextInt();
            if (temp > 0) {
                if (temp <= zone[i].getLimite()) {
                    añadirZonas(zone[i]);
                    z.numEntradas = temp;
                    index++;
                } else {
                    System.out.println("Demasiadas entradas, el maximo es de ");
                }
            }

        }
    }
    
    public void venta(int entradas, int n){
        this.ganancias = entradas * n * z.precio;
        this.z.setEntradasCompradas(n * z.getEntradasCompradas());
    }

}
