/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Alumno avanzado
 */
public class Cuenta {
    String DNI,NombreApellidos;
    int telefono;
    float saldo;
    
    Cuenta(String DNI,String NA,int TF,float saldo){
        this.DNI = DNI;
        this.NombreApellidos = NA;
        this.telefono = TF;
        this.saldo = saldo;
    }
    
    public String verDNI(){
        return DNI;
    }
    
    public String verNA(){
        return NombreApellidos;
    }
    
    public int verTelefono(){
        return telefono;
    }
    
    public float verSaldo(){
        return saldo;
    }
    
    public boolean RetirarDinero(int cantidad){
        if (saldo > 0) {
            saldo = saldo-cantidad;
            return false;
        }
        return true;
    }
    
    public void IngresarDinero(int cantidad){
        saldo = saldo+cantidad;
    }
}
