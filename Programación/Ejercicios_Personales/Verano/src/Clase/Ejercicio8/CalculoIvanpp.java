//PAQUETES
package Clase.Ejercicio8;
import java.util.Scanner;
/**
 *
 * @author Ivanpp
 * @version 1.00
 */
//CLASE
public class CalculoIvanpp {
    //MAIN
    public static void main(String[] args) {
        /*El paquete Scanner permite leer datos por teclado*/
        Scanner usuario = new Scanner(System.in);
        /* Almaceno el numero en un INT de 4 bytes enteros */
        int n;
        //MENSAJE DE AVISO
        System.out.println("Introduzca un numero de 5 digitos");
        /* Le pregunto al usuario el numero */
        n = usuario.nextInt();
        /* Si numero es mayor de 9999 y menor de 10000 */
        if (n > 9999 && n < 100000) {
            /* Desconpongo en numeros n1 */
            int n1 = n / 10000;
            /* Cambio el valor de n a uno nuevo */
            n = n % 10000;
            /* Desconpongo en numeros n2 */
            int n2 = n / 1000;
            /* Cambio el valor de n a uno nuevo */
            n = n % 1000;
            /* Desconpongo en numeros n3 */
            int n3 = n / 100;
            /* Cambio el valor de n a uno nuevo */
            n = n % 100;
            /* Descompongo en numeros n4 */
            int n4 = n / 10;
            /* Cambio el valor de n a uno nuevo */
            n = n % 10;
            /* Descompongo en numeros n5 */
            int n5 = n / 1;
            /* Muestro el resultado de la descomposición de los numeros */
            System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
            // SiNo Lanzo un mensaje de aviso
        } else {
            //MENSAJE DE AVISO
            System.out.println("Introduzca un numero de 5 digitos");
        }// FIN DEL SI
    }// FIN MAIN
}// FIN CLASE

///*El paquete Scanner permite leer datos por teclado*/
//        Scanner s = new Scanner(System.in);
//        /* BOOLEAN que almacena una variable un true */
//        boolean repetir = true;
//        /* Mientras que repetir sea true va a realizar la operación */
//        while (repetir){
//            //MENSAJE DE AVISO
//            System.out.println("Introduzca un numero");
//            /* Un String de numero con un ValueOf que devuleve el numero de objetos almacenados y pregunta por teclado el numero */
//            String n = String.valueOf(s.nextInt());
//            /* Si la longitud de numero es igual a 5 entonces */
//        if (n.length() == 5){
//            /* Creo un split de numeros */
//            String[] numeros = n.split("");
//            /* Mediante un para leo la longitud de numeros */
//            for (int i = 0; i < n.length(); i++) {
//                //Muesto el numero separados
//                System.out.print(numeros[i]+" ");
//            }//FIN PARA
//            /* Cambio el valor de repetir a falso para salir del while */
//            repetir = false;
//            /* SiNo es un digito de 5 numeros pregunto de nuevo el numero*/
//        }else{
//            //MENSAJE DE AVISO
//            System.out.println("Introduzca un numero de 5 digitos");
//            }// FIN SI
//        }// FIN WHILE 
