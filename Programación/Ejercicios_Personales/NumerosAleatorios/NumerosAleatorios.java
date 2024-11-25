/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosAleatorios;

/**
 *
 * @author Alumno avanzado
 */
public class NumerosAleatorios {

    public static void main(String[] args) {
        //Le indicamos que saque 51 resultados por pantalla
        /*for (int i = 1; i < 51; i++) {
            //Le indicamos que mediante un math random saque un maximo de 10 y empieze en el 1
            int n=(int)(Math.random()*10)+1;
                //Saco por pantalla el numero tabulado
                System.out.print(n+"\t");
                //Si detecta que si es un numero de 10 hace un salto en linea
                if(i%10==0)
                    //Imprime el salto
                    System.out.println("");
        }*/
        //Resultados
        /*System.out.println("Resultados");
        for (int i = 0; i < 9; i++) {
            int num = (int) (Math.random() * 3);
            
            if (num == 0) {
                char empate = 'x';
                System.out.println(empate);
            }
            else
                System.out.println(num + "\t");
        }*/
        int contador = 0;
        int dado1 ;
        int dado2;
     //   for (int i = 0; i < 12; i++) {
            do{
             dado1 = (int) (Math.random() * 6) + 1;
             dado2 = (int) (Math.random() * 6) + 1;
           
            System.out.print("Dado 1: " + " " + dado1 + "\t");
            System.out.println("Dado 2: " + " " + dado2 + "\t"); 
            }while(dado1 != dado2);
            do{
            if (dado1 == dado2) {
                contador++;
                }
            }while (contador != 3);
      // }
        System.out.print("Ha salido repetidos: ");
        System.out.println(contador + " " + "veces");
    }
}
/*        //int numeros[] = {2, 15, 6, 22, 12, 5, 3, 8, 9, 12, 4, 7, 23, 32, 14};
        int contador = 0;
        System.out.println("Sus numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
            if (num == numeros.length) {
                contador++;
            }
        if (contador <= numeros.length) {
            System.out.println("Ha ganado");
        }else{
            System.out.println("No ha ganado");
        }*/
