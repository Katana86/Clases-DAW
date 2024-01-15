package Ejercicio_Carreras;


public class Ejemplos {
    /*Aqui se definen los cuadrados del circuito,
    la velocidad de cuadros que va a avanzar
    y su respectiva calle*/
    public static void main(String[] args) {
        Circuito ferrol = new Circuito(5,100);
        Coches coche1 = new Coches("Astorn Martin", 33);
        Coches coche2 = new Coches("Ferrari", 50);
        boolean carrera = true;
        Coches lider = coche1;

        while(carrera)
        {

            ferrol.calles[0] += coche1.correr();
            ferrol.calles[1] += coche2.correr();

            System.out.println("Coche 1: "+ferrol.calles[0]);
            System.out.println("Coche 2: "+ferrol.calles[1]);
            
            if (ferrol.calles[0] > ferrol.calles[1]){
                if ( !lider.equals(coche1)){
                    lider = coche1;
                    System.out.println("Coche 1 se pone en por delante");
                }else if (ferrol.calles[0] < ferrol.calles[1]){
                    lider = coche2;
                    System.out.println("Coche 2 se pone por delante");
                }
                lider = coche1;
            }else if (ferrol.calles[0] < ferrol.calles[1]){
                lider = coche2;
            }

            //ADELANTAMIENTOS
            

            if (ferrol.calles[0] >= ferrol.fin || ferrol.calles [1] >= ferrol.fin){}
            carrera = false;
            if (ferrol.calles[0] < ferrol.calles[1]){
                System.out.println("Ganador coche 2");
            }else if (ferrol.calles[1] < ferrol.calles[0]){
                System.out.println("Ganador coche 1");
            }else{
                System.out.println("La foto finish no se decide");
            }  
        }
        
    }
}

/*Aquí tienes una explicación línea por línea:

- En la línea 3, se define una clase llamada Ejemplos que contiene el método main.
- En la línea 5, se crea una instancia de la clase Circuito llamada ferrol,
 con 5 cuadrados y una velocidad de cuadros de 100.
- En las líneas 6 y 7, se crean dos instancias de la clase Coches llamadas,
 coche1 y coche2 con nombres de autos y velocidades respectivas.
- En la línea 8, se declara una variable booleana carrera y se inicializa como true.
- En la línea 9, se declara una variable de tipo Coches llamada lider y se inicializa con la instancia coche1.
- A partir de la línea 11, comienza un bucle while que se ejecuta mientras carrera sea true.
- En las líneas 14 y 15, se actualiza la posición de los autos en el circuito sumando la distancia que recorren en cada iteración.
- En las líneas 17 y 18, se imprime la posición de cada auto en el circuito.
- A partir de la línea 20, se verifica si el auto en la posición 0 está adelante del auto en la posición 1. 
Si es así, se actualiza el lider a coche1. Si no, se verifica si el auto en la posición 1 está adelante del auto en la posición 0 y se actualiza el lider a coche2.
- En la línea 27, se verifica si alguno de los autos ha alcanzado o superado la posición final del circuito. Si es así, 
se sale del bucle.
- En las líneas 30 a 35, se imprime el ganador de la carrera basado en la posición de los autos en el circuito.
- En la línea 37, se cierra el método main.

Este código simula una carrera de autos en un circuito y muestra la posición de los autos en cada iteración del bucle hasta que uno de los autos alcanza la posición final del circuito. */
