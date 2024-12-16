/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author Alumno avanzado
 */
public class Main {

    
    public static void main(String[] args) {
        Cuenta c = new Cuenta("324567D","Paco Antonio Lopez",65456775,15000);
        System.out.println("\t\tDATOS");
        System.out.println("DNI: "+c.verDNI());
        System.out.println("Nombre Completo: "+c.verNA());
        System.out.println("Telefono: "+c.verTelefono());
        System.out.println("Saldo: "+c.verSaldo());
        System.out.println("--------------------------------------");
        if (c.RetirarDinero(1500) == true) {
            System.out.println("ESTA EN NUMEROS ROJOS");
            System.out.println("Saldo actual: "+c.verSaldo());
        }else{
            System.out.println("Saldo actual: "+c.verSaldo());
        }
        System.out.println("--------------------------------------");
        c.IngresarDinero(500);
        System.out.println("Saldo actual: "+c.verSaldo());
    }
    
}
