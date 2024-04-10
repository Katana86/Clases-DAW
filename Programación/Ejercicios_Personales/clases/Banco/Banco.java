/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Banco;

/**
 *
 * @author Alumno avanzado
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DATOS DE LA CUENTA
        Cuenta c = new Cuenta(254006897,"Antonio Gonzalez");
        //MENSAJE BIENVENIDA
        System.out.println("Bienvenido"+" "+c.getTitular());
        System.out.println(c.toString());
        //INGRESO
       c.ingreso(1500);
       c.ingreso(150);
       c.ingreso(350);
        System.out.println("Saldo total: "+c.getSaldo());
        //REINTEGRO
        c.reintegro(500);
        c.reintegro(100);
        c.reintegro(200);
        System.out.println("Saldo total: "+c.getSaldo());
        //COMISION
       c.Comision();
         System.out.println("Saldo total: "+c.getSaldo());
    }
    
}
