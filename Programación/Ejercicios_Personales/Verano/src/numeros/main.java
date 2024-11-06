/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;
/*Furgoneta que tenga x carga y x bultos*/
/**
 *
 * @author Alumno avanzado
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        carga c = new carga();
        c.maxima_carga(50);
        c.maximos_bultos(10);
        c.añadir(10);
        c.añadir(20);
        c.añadir(40);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        c.añadir(5);
        //c.añadir(3030);
//        c.añadir(30);
        
        //c.añadir(10);
        //c.añadir(10);


        System.out.println(c.toString());
        System.out.println(c.ver_bultos());
    }
    
}
