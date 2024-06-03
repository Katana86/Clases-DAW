/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2ºeva_repaso.Ejercicio1;

/**
 *
 * @author ivanpa
 */
public class Comercial extends Empleados {

    private double comision;

    public Comercial(double comision, String nombre, byte edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    @Override
    public boolean PLUS() {
        if (this.getEdad() > 30 && this.comision > 200.00) {
            this.setSalario(this.getSalario() + Empleados.PLUS);
            System.out.println("Se ha añadido el plus al empleado" + this.getNombre());
            return true;
        } else {
            return false;
        }
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + ", comision=" + comision;
    }

}
