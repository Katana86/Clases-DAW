/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros.Ejercicio2;

/**
 *
 * @author ivanpa
 */
public class Empregado {
    String nome;
    String dni;
    int idade;
    String departamento;
    
    Empregado(String n, String d, int i, String dep) {
        nome = n;
        dni = d;
        idade = i;
        departamento = dep;
    }
    
    @Override
    public String toString() {
        return "\t"+nome+"\t"+dni+"\t"+idade+"\t"+departamento;
    }
}