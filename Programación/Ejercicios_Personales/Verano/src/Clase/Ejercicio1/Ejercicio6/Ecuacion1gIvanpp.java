package Clase.Ejercicio1.Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 * @version 1.00
 */
//CLASE
public class Ecuacion1gIvanpp {

    //MAIN
    public static void main(String[] args) {
        /*El paquete Scanner permite leer datos por teclado*/
        Scanner s = new Scanner(System.in);
        //VARIABLES
        float C1;
        float C2;
        //MENSAJE DE AVISO
        do{
        System.out.println("Digite el primer numero");
        /* Introduzco por teclado el primer numero. Almacenado en FLOAT de 4 bytes que almacena coma flotante.*/
        C1 = s.nextFloat();
        }while (C1 == 0);
        //MENSAJE DE AVISO
        System.out.println("Digite el segundo numero");
        /* Introduzco por teclado el segundo numero. Almacenado en FLOAT de 4 bytes que almacena coma flotante.*/
        C2 = s.nextFloat();
        //ECUACION
        System.out.println("Ecuacion: " + C1 + "x" + "+" + C2 + "=" + 0);
        //REALIZO LA DIVISION DE LOS NUMEROS
        float x = C2/C1;
        //IMPRIMO EL RESULTADO
        System.out.println("X = "+x);
        s.close();//FIN SCANNER
    }//FIN CLASE
}//FIN MAIN
