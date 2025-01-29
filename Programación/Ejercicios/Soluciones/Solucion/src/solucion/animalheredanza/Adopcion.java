/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion.animalheredanza;

import java.time.LocalDate;
import solucion.animais.Animal;
import solucion.persoas.Clientes;


/**
 *
 * @author Alumno avanzado
 */
public class Adopcion {
    private Animal animal;
    private Clientes cliente;
    private LocalDate dataAdopcion;

    public Adopcion() {
    }

    public Adopcion(Animal animal, Clientes cliente, String dataAdopcion) {
        this.animal = animal;
        this.cliente = cliente;
        this.dataAdopcion = LocalDate.parse(dataAdopcion);
    }

    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Clientes getCliente() {
        return cliente;
    }
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataAdopcion() {
        return dataAdopcion;
    }
    public void setDataAdopcion(LocalDate dataAdopcion) {
        this.dataAdopcion = dataAdopcion;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "animal=" + animal.toString() + ", cliente=" + cliente.toString() 
                + ", dataAdopcion=" + dataAdopcion.toString() + '}';
    }
    
    
}
