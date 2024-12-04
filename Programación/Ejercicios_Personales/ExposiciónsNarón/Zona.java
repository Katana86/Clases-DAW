/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExposiciónsNarón;

/**
 *
 * @author ivanpp
 */
public class Zona {
    String nome;
    int limite;
    int numEntradas, entradasCompradas;
    double precio;
    
    public Zona(){
        
    }
    
    public Zona(String nome, int limite, double precio){
        this.nome = nome;
        this.limite = limite;
        this.precio = precio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }

    public int getEntradasCompradas() {
        return entradasCompradas;
    }

    public void setEntradasCompradas(int entradasCompradas) {
        this.entradasCompradas = entradasCompradas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
