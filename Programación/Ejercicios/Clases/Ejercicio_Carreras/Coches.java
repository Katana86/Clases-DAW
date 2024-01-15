package Ejercicio_Carreras;

public class Coches {
        private String motor;
        private String color;
        private String marca;
        private int velocidad_max;
        private String dorsal;
    
        public Coches(String marca, int velocidad){
            this.marca = marca;
            this.velocidad_max = velocidad;
            this.motor = "";
            this.color = "Blanco";
            this.dorsal = "";
        }
    
        public String getMotor(){
            return this.motor;
        }
    
        public String getColor(){
            return this.color;
        }
    
        public String getMarca(){
            return this.marca;
        }
    
        public String getDorsal(){
            return this.dorsal;
        }
    
        public int getvelocidad_max(){
            return this.velocidad_max;
        }
    
        public void setMotor(String valor){
            this.motor = valor;
        }

        public void setColor(String valor){
            this.color = valor;
        }

        public void setvelocidad_max(int valor){
            this.velocidad_max = valor;
        }

        public void setdorsal(String valor){
            this.dorsal = valor;
        }

        public int correr(){
           return (int)(Math.random() * this.velocidad_max);
        }

        public void frenar(){
            // Definir el método
        }

        public void averiarse(){
            //Definir el método
        }
}

/*1. La clase "Coches" es declarada como pública, lo que significa que puede ser accedida desde cualquier otro lugar en el programa.

2. Hay cinco variables de instancia privadas declaradas en la clase:
- "motor" de tipo String, que representa el tipo de motor del coche.
- "color" de tipo String, que representa el color del coche.
- "marca" de tipo String, que representa la marca del coche.
- "velocidad_max" de tipo int, que representa la velocidad máxima del coche.
- "dorsal" de tipo String, que representa el número de dorsal del coche.

3. Hay un constructor público llamado "Coches" que acepta dos parámetros: "marca" de tipo String y "velocidad" de tipo int. 
Este constructor se utiliza para crear un objeto de la clase "Coches" y asigna los valores iniciales a las variables de instancia. 
El valor de "marca" se asigna a la variable "marca" y el valor de "velocidad" se asigna a la variable "velocidad_max". 
Las variables "motor" y "dorsal" se inicializan como cadenas vacías y la variable "color" se inicializa como "Blanco".

4. Hay varios métodos de acceso (getters) definidos en la clase:
- "getMotor" devuelve el valor de la variable "motor".
- "getColor" devuelve el valor de la variable "color".
- "getMarca" devuelve el valor de la variable "marca".
- "getDorsal" devuelve el valor de la variable "dorsal".
- "getvelocidad_max" devuelve el valor de la variable "velocidad_max".

5. Hay varios métodos de modificación (setters) definidos en la clase:
- "setMotor" acepta un parámetro de tipo String llamado "valor" y asigna su valor a la variable "motor".
- "setColor" acepta un parámetro de tipo String llamado "valor" y asigna su valor a la variable "color".
- "setvelocidad_max" acepta un parámetro de tipo int llamado "valor" y asigna su valor a la variable "velocidad_max".
- "setdorsal" acepta un parámetro de tipo String llamado "valor" y asigna su valor a la variable "dorsal".

6. El método "correr" devuelve un número entero que representa una velocidad aleatoria dentro del rango de 0 a la velocidad máxima del coche. 
Esto se logra utilizando la función "Math.random()" que genera un número aleatorio entre 0 y 1, 
y luego se multiplica por la velocidad máxima y se convierte a un entero.

7. Los métodos "frenar" y "averiarse" están declarados pero no tienen ninguna implementación. 
Estos métodos deberían ser definidos para realizar acciones específicas, 
pero no se ha proporcionado la implementación en el código dado.

En resumen, esta clase "Coches" representa un coche con propiedades como motor, color, marca, velocidad máxima y número de dorsal. 
Proporciona métodos para acceder y modificar estas propiedades, 
así como para correr a una velocidad aleatoria. Sin embargo, los métodos "frenar" y "averiarse" deben ser implementados por separado.  */