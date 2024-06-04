package pkg2ºeva_repaso.Examen240125.Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ivanpa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creamos los objetos
        Comercial c1 = new Comercial(300, "Sofia", (byte) 37, 1000);
        Repartidor r1 = new Repartidor("zona 3", "Luis", (byte) 26, 900);
//Llamamos a plus
        c1.PLUS();
        r1.PLUS();
//Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);

    }

}
