//PAQUETES
package Clase.Ejercicio1;

/**
 *
 * @author Ivanpp
 * @version 1.00
 */
//CLASE
public class UsoVariablesIvanpp {

    //MAIN
    public static void main(String[] args) {
        /**SHORT: Es una variable de tipo entero.
        Almacena valores cortos de 2 bytes maximos.*/
        short var1 = 65;
        /**INT: Es una variable de tipo entero.
         Almacena valores enteros de 4 bytes maximos.*/
        int var2 = 2000;
        /**LONG: Es una variable de tipo entero.
         Almacena valores enteros largos de 8 bytes maximos.*/
        long var3 = 300000;
        /**
         FLOAT: Es una variable de tipo decimal.
         Almacena valores decimales con coma flotante de 7 bytes maximos*/
        float var4 = 5*10e30f;
        /**DOUBLE: Es una variable de tipo decimal
         Almacena valores decimales con coma flotante de 15 bytes maximos*/
        double var5 = 3.3*10e200d;
        /**CHAR: Es una variable de tipo caracter.
         Almacena un valor del abecedario ASCCI y lo expresa en forma de letra del abecedario*/
        Character varCH = 65;
        //MOSTRAR POR CONSOLA
        System.out.println("Variable SHORT: "+var1);
        System.out.println("Variable INT: "+var2);
        System.out.println("Variable LONG: "+var3);
        System.out.println("Variable FLOAT: "+var4);
        System.out.println("Variable DOUBLE: "+var5);
        System.out.println("Variable CHAR: "+varCH);
    }//FIN MAIN
    
}//FIN CLASES
