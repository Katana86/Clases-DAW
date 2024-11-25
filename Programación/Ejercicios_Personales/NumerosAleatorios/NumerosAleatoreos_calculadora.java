/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumerosAleatorios;

/**
 *
 * @author Alumno avanzado
 */
public class NumerosAleatoreos_calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 100);
        int n2 = (int) (Math.random() * 100);
        ////////////////////OPERACIONES 2///////////////////
        Operaciones2 o2 = new Operaciones2(n1,n2);
        
        
        System.out.println(o2.getSuma());
        System.out.println(o2.getMulti());
        System.out.println(o2.getCociente());
        System.out.println(o2.getResto());
        ///////////////////OPERACIONES 1////////////////////
        /*Operaciones o = new Operaciones();
        
        
          o.suma(n1, n2);
          o.multi(n1, n2);
          o.cociente(n1, n2);        
          o.res(n1, n2);
    }*/
    }
}
