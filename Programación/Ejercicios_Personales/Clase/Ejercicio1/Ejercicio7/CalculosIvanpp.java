//PAQUETES
package Clase.Ejercicio1.Ejercicio7;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Ivanpp
 * @version 1.00
 */
//CLASE
public class CalculosIvanpp {
    //MAIN
    public static void main(String[] args) {
        //IVÁN PIÑEIRO PASTORIZA
        /*El paquete Scanner permite leer datos por teclado*/
        Scanner s = new Scanner(System.in);
        //MENSAJE DE AVISO
        System.out.println("Introduzca el primer numero");
        /* Introduzco por teclado el primer numero. Almacenado en FLOAT de 4 bytes que almacena coma flotante.*/
        float n1 = s.nextInt();
        System.out.println("Introduzca el segundo numero");
        /* Introduzco por teclado el segundo numero. Almacenado en FLOAT de 4 bytes que almacena coma flotante.*/
        float n2 = s.nextInt();
        /* Muestro los numeros */
        System.out.println("Numeros: "+"x="+n1+","+"e="+n2);
        /* Almaceno la suma en un FLOAT de 4 bytes que almacena coma flotante*/
        float suma = n1+n2;
        /* Muestro la suma */
        System.out.println("x+e="+suma);
        /* Almaceno la resta en un FLOAT de 4 bytes que almacena coma flotante */
        float resta = n1-n2;
        /* Muestro la resta */
        System.out.println("x-e="+resta);
        /* Almaceno la multiplicación en un FLOAT de 4 bytes que almacena coma floatante */
        float multi = n1*n2;
        /* Muestro la multiplicación */
        System.out.println("x^e="+multi);
        /* Almaceno la división en un FLOAT de 4 bytes que almacena coma flotante */
        float div = n1/n2;
        /* Muestro la división */
        System.out.println("x/e="+div);
        /* Almaceno la potencia con un DOUBLE de 8 bytes que almacena coma flotante */
        double poten = Math.pow(n1,2);
        /* Muestro la potencia de los numeros */
        System.out.println("x^2="+poten);
        /* Almaceno la raíz cuadrada en un FLOAT de 4 bytes que almacena coma flotante */
        float rz = (float) sqrt(n1);
        /* Muestro el resultado de la raíz cuadrada*/
        System.out.println("x: "+rz);
        s.close();//FIN SCANNER
    }//FIN MAIN
}// FIN CLASE