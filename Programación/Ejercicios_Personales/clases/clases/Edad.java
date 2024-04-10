/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;


class Persona{
    String nombre;
    int ano;

    public Persona(String nombre, int ano) {
        this.nombre = nombre;
        this.ano = ano;
    }
    
    void saluda(){
            System.out.println("Hola "+nombre+", Nacido en el ano: "+ano);
    }
    void edad(){
        System.out.println("La edad actual es: ");
    }
    
}

public class Edad{
/**
 *
 * @author Alumno avanzado
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Luis",2000);
        p.saluda();
        System.out.println("Nombre: "+p.nombre);
        System.out.println("Ano de nacimiento: "+p.ano);
        p.edad();
    }
}