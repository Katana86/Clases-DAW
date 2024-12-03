//PAQUETES
package Arrays.Ejercicio1;

/**
 *
 * @author ivanpp
 *
 * Realizar un programa que defina un vector chamado “vector_numeros” de 10
 * enteiros, a continuación o inicialice con valores aleatorios (do 1 ao 10) e
 * posteriormente mostre en pantalla cada elemento do vector xunto co seu
 * cadrado e o seu cubo.
 */
//CLASE
public class Ejercicio1 {
    
    //MAIN
    public static void main(String[] args) {
        cuadrado();
        cubo();
    }//FIN MAIN

    /**
     * a continuación o inicialice con valores aleatorios (do 1 ao 10)
     */
    public static int[] aleatorio() {
        int[] vector_numeros = new int[10];
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * (10 - 1 + 1));
        }
        return vector_numeros;
    }//FIN F_ALEATORIO

    /**
     * posteriormente mostre en pantalla cada elemento do vector xunto co seu
     * cadrado e o seu cubo.
     */
    public static int cuadrado() {
        int cuadrado = 0;
        int[] numeros = aleatorio();
        System.out.println("\t" + "(NUMEROS AL CUADRADO)");
        for (int i = 0; i < numeros.length; i++) {
            cuadrado = numeros[i] * numeros[i];
            System.out.println("Numero Array: " + numeros[i] + "\t" + "\t" + "Numeros_Cuadrado (n*n): " + cuadrado);
        }
        System.out.println("---------------------------------------------------");
        return cuadrado;
    }//FIN F_CUADRADO

    /**
     * posteriormente mostre en pantalla cada elemento do vector xunto co seu
     * cadrado e o seu cubo.
     */
    public static int cubo() {
        int cubo = 0;
        int[] numeros = aleatorio();
        System.out.println("\t" + "(NUMEROS AL CUBO)");
        for (int i = 0; i < numeros.length; i++) {
            cubo = numeros[i] * numeros[i] * numeros[i];
            System.out.println("Numero Array: " + numeros[i] + "\t" + "\t" + "Numeros_Cuadrado (n*n*n): " + cubo);
        }
        return cubo;
    }//FIN F_CUBO

}//FIN CLASE
