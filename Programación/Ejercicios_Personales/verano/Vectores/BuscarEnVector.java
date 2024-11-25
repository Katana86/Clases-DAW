/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verano.Vectores;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class BuscarEnVector {
    static int v[] = {1, 3, 8, 4,3};
    
    static Scanner s = new Scanner(System.in);
    
    //MAIN
    public static void main(String[] args) {
        //System.out.println("Introduzca un numero");
        int usu = s.nextInt();
        System.out.println(buscarNumero(usu));
     
        
        
        
      /*  int vdos[]={1,66,2,3};
          for (int i = 0; i < vdos.length; i++) {
            if(buscarNumero(vdos[i])== true)
                  System.out.println("  "+vdos[i]);
             
        }*/
        
        
    }
    
    //METODOS
    public static boolean buscarNumero(int numero){
        int contador=0;
        for (int i = 0; i < v.length; i++) {
            //System.out.println(v[i]);
            if (numero == v[i]) {
                contador++;
            }
        }
        //System.out.println(contador);
        if (contador >= 1) {
            //System.out.println("TRUE");
            return true;
        }else {
            //System.out.println("FALSE"); 
            return false;
        }
    }
    
}

/*        for (int i = 0; i < v.length; i++) {
            int lista = v[i];
            if (numero == lista) {
                esta = true;
                System.out.println(esta);
            } else {
                esta = false;
                System.out.println(esta);
            }
        }*/
