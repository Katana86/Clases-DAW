/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosAleatorios;

/**
 *
 * @author Alumno avanzado
 */
public class Operaciones2 {
  int primernumero,segundonumero;
    Operaciones2(int n1,int n2) {
        primernumero=n1;
        segundonumero=n2;
    }
    
    public int suma(){
        int suma = primernumero + segundonumero;
        return suma;
    }
    
    public int multiplicacion(){
        int multi = primernumero * segundonumero;
        return multi;
    }
    
    public float cociente(){
        float cociente = (float)primernumero + (float)segundonumero;
        return cociente;
    }
    
    public int resto(){
        int resto = primernumero % segundonumero;
        return resto;
    }
    
    public String getSuma(){
        return "Suma: "+suma();
    }
    public String getMulti(){
        return "Multiplicacion: "+multiplicacion();
    }
    public String getCociente(){
        return "Cociente: "+cociente();
    }
    public String getResto(){
        return "Resto: "+resto();
    }
}
