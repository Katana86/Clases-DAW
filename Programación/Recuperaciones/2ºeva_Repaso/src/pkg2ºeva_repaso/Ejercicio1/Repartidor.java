/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ºeva_repaso.Ejercicio1;

/**
 *
 * @author ivanpa
 */
public class Repartidor extends Empleados {

    private String zona;

    public Repartidor(String zona, String nombre, byte edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean PLUS() {
        if (this.getEdad() < 25 && this.zona.equals("zona 3")) {
            this.setSalario(this.getSalario() + Empleados.PLUS);
            System.out.println("El plus se ha aplicado al empleado " + this.getNombre());
            return true;
        } else {
            return false;
        }
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "zona=" + zona;
    }

}
