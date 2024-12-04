/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PiceríaIvanPP;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 */
public class Pizza {

    Scanner usu = new Scanner(System.in);
    String tamaño, tipo, ingrediente,entrega;
    double prezo = 15.00;

    public void setTamaño() {
        System.out.print("Elija un tamaño:"
                + "\n1.-Mediana"
                + "\n2.-Familiar");
        switch (usu.nextInt()) {
            case 1 -> {
                this.tamaño = "mediana";
            }
            case 2 -> {
                this.tamaño = "familiar";
            }
        }
    }

    public void setTipo() {
        System.out.print("Elija un tamaño:"
                + "\n1.-Margarita"
                + "\n2.-Catro queixos"
                + "\n3.-Funghi");

        switch (usu.nextInt()) {
            case 1 -> {
                this.tipo = "Margarita";
            }
            case 2 -> {
                this.tipo = "Catro Quixos";
            }
            case 3 -> {
                this.tipo = "Funghi";
            }
        }
    }

    public void setIngrediente() {
        System.out.println("Elija los ingredientes: "
                +"\n 0 | 1 | 2");
        int opcion = usu.nextInt();
        
        for (int i = 0; i < opcion; i++) {
            System.out.println("Introduzca el ingrediente");
            
            if (this.ingrediente != null) {
                this.ingrediente = this.ingrediente + ", " + usu.next();
            } else {
                this.ingrediente = usu.next();
            }
            
            this.prezo++;
        }
    }

    public void setEntrega() {
        System.out.println("Selecione la entrega"
                +"\n 1.EN TIENDA | 2.A DOMICILIO");
        switch (usu.nextInt()) {
            case 1 -> {
                this.entrega = "EN TIENDA";
            }
            case 2 -> {
                this.entrega = "A DOMICILIO";
            }
        }
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public String getEntrega() {
        return entrega;
    }

    public double getPrezo() {
        return prezo;
    }
    
    public void Datos(){
        setTamaño();
        setTipo();
        setIngrediente();
        setEntrega();
    }

    @Override
    public String toString() {
        return "Pizza{" + "tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", ingrediente=" + ingrediente + ", entrega=" + entrega + ", prezo=" + prezo + '}';
    }

    
    
}
