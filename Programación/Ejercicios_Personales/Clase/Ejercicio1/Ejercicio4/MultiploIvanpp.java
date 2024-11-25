package Clase.Ejercicio1.Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 * @version 1.00
 */
//CLASE
public class MultiploIvanpp {
    //MAIN
    public static void main(String[] args) {
        //IVÁN PIÑEIRO PASTORIZA
        /*MEDIANTE UN ESCANNER LEEMOS POR TECLADO*/
        Scanner s = new Scanner(System.in);
        //BOOLEAN decidir = true
        boolean decidir;
        /*STRING para almacenar la decision del operador ternario*/
        //MENSAJE DE AVISO
        System.out.println("Introduzca el primer numero");
        /*CON UN SCANNER LEEMOS POR TECLADO EL PRIMER NUMERO CON VALOR INT DE 4 BYTES*/
        int n1 = s.nextInt();
        //MENSAJE DE AVISO
        System.out.println("Introduzca un segundo numero");
        /*CON UN SCANNER LEEMOS POR TECLADO EL SEGUNDO NUMERO CON VALOR INT DE 4 BYTES*/
        int n2 = s.nextInt();
        /*HAGO UN RESTO QUE CALCULA EL MODULO(RESTO)*/
        int resto = n1 % n2;
        //LE INDICO QUE SI DECIDIR: RESTO = 0 ENTONCES ES TRUE
        decidir = (resto == 0);
        //OPERADOR TERNARIO SI DECISION ES IGUAL A DECIDIR ENTONCES ES MULTIPLO SINO NO ES MULTIPLO
        //MENSAJE FINAL
        System.out.println((decidir) ? "ES MULTIPLO" : "NO ES MULTIPLO");
        //FIN SCANNER
        s.close();
    }//FIN MAIN
}//FIN CLASE





//CON ELSE
        /*int div = n1%n2;
        if (div == 0) {
            System.out.println("ES MULTIPLO");
        }else{
            System.out.println("NO ES MULTIPLO");
        }*/
