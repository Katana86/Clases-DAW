package repaso_esamen_primeraev;

import java.util.Scanner;

/**
 *
 * @author galil
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //Almacena las variables basicas para el funcionamiento
        int numero1=1;
        int numero2=2;
        int eleccion=1;
       
        //Mediante un array de STRING se crean los menús que vera el usuario
        String [] menu = {"---- PROGRAMA CONVERSIÓN V-1.0.0 ----","Menú","Seleccione la opción deseada","1.Suma","2.Resta","3.Multiplicación","4.División","5.Más Conversiones","6.Cerrar Programa"};
        String [] menu2 = {"1.Binario","2.Octal","3.Hexadecimal"};
        //Se llama a un SCANNER para que el usuario pueda almacenar su respuesta
        Scanner scan = new Scanner(System.in);
        //Se imprime un texto para que el usuario escriba los numeros a almacenar
        System.out.println("Introduzca un numero");
        numero1 = scan.nextInt();
        System.out.println("Introduzca otro numero");
        numero2 = scan.nextInt();
        //Si detecta que el numero es 0 entonces sacara un error de CARACTER INVALIDO por pantalla y cerrara el programa
        if (numero1+numero2<=0){
        System.err.println("Caracter No Valido");
        scan.close();
        //Si no se cumple la condición de antes este procedera a ejecutar el menú
        }else{
            //Mediante un para procede a imprimir el menú
           for (int i=0;i < menu.length;i++){
               System.out.println(" "+menu[i]+" ");
           }
           //El usuario elige la operación a realizar
           eleccion = scan.nextInt();
           //Si detecta que el numero es 0 entonces sacara un error de CARACTER INVALIDO por pantalla y cerrara el programa
           if (eleccion<=0){
                   System.err.println("Opción invalida");
                   scan.close();
           }else{
               //Si se cumple procedera a realizar las siguientes operaciones
               switch (eleccion){
                   //En caso de que sea 1 realizara una SUMA
                   case 1:
                       //SUMA
                       int suma=0;
                       suma = numero1+numero2;
                       System.out.println("El numero 1 es este: "+numero1);
                       System.out.println("El numero 2 es este: "+numero2);
                       System.out.println("La suma es: "+suma);
                       break;
                       //En caso de que sea 2 realizara una RESTA
                   case 2:
                       //RESTA
                       int resta=0;
                       resta = numero1-numero2;
                       System.out.println("El numero 1 es este: "+numero1);
                       System.out.println("El numero 2 es este: "+numero2);
                       System.out.println("La resta es: "+resta);
                       break;
                       //En caso de que sea 3 realizara una MULTIPLICACIÓN
                   case 3:
                       //MULTIPLICACIÓN
                       int multiplicacion=0;
                       multiplicacion = numero1*numero2;
                       System.out.println("El numero 1 es este: "+numero1);
                       System.out.println("El numero 2 es este: "+numero2);
                       System.out.println("La multiplicación es: "+multiplicacion);
                       break;
                       //En caso de que sea 4 realizara una DIVISIÓN
                   case 4:
                       //DIVISIÓN
                       int division=0;
                       division = numero1/numero2;
                       System.out.println("El numero 1 es este: "+numero1);
                       System.out.println("El numero 2 es este: "+numero2);
                       System.out.println("La multiplicación es: "+division);
                       break;
                       //En caso de que sea 5 realizara una deplegara el menú 2 con opciones extra
                                        case 5:
                                            //Mediante un para procede a imprimir el menú
                                            for (int j=0;j<menu2.length;j++){
                                            System.out.println(" "+menu2[j]+" ");
                                            }
                                            //El usuario elige la operación a realizar
                                            eleccion = scan.nextInt();
                                            //Si detecta que el numero es 0 entonces sacara un error de CARACTER INVALIDO por pantalla y cerrara el programa
                                            if (eleccion<=0){
                                            System.err.println("Opción invalida");
                                            scan.close();
                                            }else{
                                                //Si se cumple procedera a realizar las siguientes operaciones
                                                switch (eleccion){
                                                //En caso de que sea 1 realizara el BINARIO
                                                case 1:
                                                //BINARIO
                                                System.out.println("¿Como desea convertir?");
                                                System.out.println("Individualmente o Todos los numeros");
                                                System.out.println("1|2");
                                                eleccion=scan.nextInt();
                                                switch (eleccion){
                                                    //Si detecta un 2 procedera a realizar la suma de los 2 numeros y su respectiva conversión
                                                    case 2:
                                                    String binumeros = Integer.toBinaryString(numero1+numero2);
                                                    System.out.println("Los numeros binario es: "+binumeros);
                                                    break;
                                                    }
                                                        switch (eleccion){
                                                            //Si detecta un 1 procedera a realizar la conversión por el numero ele
                                                            case 1:
                                                            System.out.println("¿Numero 1|2?");
                                                            eleccion=scan.nextInt();
                                                            switch(eleccion){
                                                                case 1:
                                                                String binumero1 = Integer.toBinaryString(numero1);
                                                                System.out.println("El numero en binario es: "+binumero1);
                                                                break;
                                           
                                                                case 2:
                                                                String binumero2 = Integer.toBinaryString(numero2);
                                                                System.out.println("El numero en binario es: "+binumero2);
                                                                break;
                                                                }
                                                            }
                                                    case 2:
                                                    //OCTAL
                                    
                                                    System.out.println("¿Como desea convertir?");
                                                    System.out.println("Individualmente o Todos los numeros");
                                                    System.out.println("1|2");
                                                    eleccion=scan.nextInt();
                                                        switch (eleccion){
                                                        case 2:
                                                        String octnumeros = Integer.toOctalString(numero1+numero2);
                                                        System.out.println("Los numeros octal es: "+octnumeros);
                                                        break;
                                                        }
                                                            switch (eleccion){
                                                            case 1:
                                                            System.out.println("¿Numero 1|2?");
                                                            eleccion=scan.nextInt();
                                                                switch(eleccion){
                                                                case 1:
                                                                String octnumero1 = Integer.toOctalString(numero1);
                                                                System.out.println("El numero en octal es: "+octnumero1);
                                                                break;
                                           
                                                                case 2:
                                                                String octnumero2 = Integer.toBinaryString(numero2);
                                                                System.out.println("El numero en octal es: "+octnumero2);
                                                                break;
                                                                }
                                                        }
                                                    case 3:
                                                    //HEXADECIMAL
                                    
                                                    System.out.println("¿Como desea convertir?");
                                                    System.out.println("Individualmente o Todos los numeros");
                                                    System.out.println("1|2");
                                                    eleccion=scan.nextInt();
                                                    switch (eleccion){
                                                        case 2:
                                                        String hexnumeros = Integer.toHexString(numero1+numero2);
                                                        System.out.println("Los numeros octal es: "+hexnumeros);
                                                        break;
                                                        }
                                                            switch (eleccion){
                                                            case 1:
                                                            System.out.println("¿Numero 1|2?");
                                                            eleccion=scan.nextInt();
                                                            switch(eleccion){
                                                            case 1:
                                                            String hexnumero1 = Integer.toHexString(numero1);
                                                            System.out.println("El numero en octal es: "+hexnumero1);
                                                            break;
                                                        
                                                            case 2:
                                                            String hexnumero2 = Integer.toHexString(numero2);
                                                            System.out.println("El numero en octal es: "+hexnumero2);
                                                            break;
                                                            }
                                                        }
                                                    }
                                                }
                        case 6:
                    scan.close();
               }
           }
        }
    }
}
                  
