package Ejercicio_Carreras;

public class Circuito {
    public int[] calles;
    public int fin;
    
    public Circuito(int calles, int fin){
        this.fin = 100;
        this.calles = new int[calles];

        for (int i=0; i < calles; i++){
            this.calles[i] = 0;
        }
    }
}

/*Este código define una clase llamada "Circuito" que representa un circuito de calles. 
Tiene dos variables miembro: "calles", que es un arreglo de enteros para representar el estado de cada calle, y "fin", 
que es un entero para representar la ubicación final del circuito.

La clase tiene un constructor que toma dos parámetros: "calles" y "fin". 
El constructor inicializa la variable "fin" con el valor 100 y crea un nuevo arreglo de enteros llamado "calles", 
con el tamaño especificado por el parámetro "calles".

Luego, se inicializa cada elemento del arreglo "calles" con el valor 0 utilizando un bucle for.

En resumen, esta clase "Circuito" representa un circuito de calles, 
con un número específico de calles y una ubicación final,
y proporciona métodos para manipular y acceder al estado de cada calle. */
