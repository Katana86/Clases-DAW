/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Areas {

    static String Bienvenida() {
        String Biv;
        Biv = "Hola,que operacion desea realizar";
        return Biv;
    }

    static int Calculo(int diametro) {
        int r;
        r = diametro / 2;
        return r;
    }

    static float Area_Circulo(int radio) {
        float a;
        int r;
        r = radio;
        a = (float) 3.14 * r * r;
        return a;
    }

    static int Area_triangulo(int base,int altura){
        int a;
        int p;
        p = base * altura;
        a = p / 2;
        return a;
    }
    
    static int Area_rectangulo(int base,int altura){
        int a;
        a = base * altura;
        return a;
    }
    
    static float Area_Arandela(int radio,int radio2) {
        float a1,a2,a;
        
        a1 = Area_Circulo(radio);
        a2 = Area_Circulo(radio2);
        a = a1-a2;
        return  a;
    }
    
    static float Perimetro_Circulo(int radio){
        float p;
        p = (float) (2 * 3.14 * radio);
        return p;
    }
    
    static float Perimetro_Rectangulo(int base,int altura){
        float pr;
        pr = (base + altura)*2;
        return pr;
    }
    
    static float Area_Arandela_cuadrada(int base){
        float pr,pc,ar,d,r;
        pr = base * base;
        d = base/2;
        r = d/2;
        pc = (float) (2 * 3.14 * r);
        ar = pr-pc;
        return ar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int diametro;
        int radio;
        int radio2;
        int base;
        int altura;
        int eleccion;
        String[] menu = {"1. Calcular el radio de un circulo",
            "2. Calcular el area de un circulo",
            "3 .Calcular el area de un triangulo",
            "4 .Calcular el area de un rectangulo",
            "5. Calcular el area de una arandela",
            "6. Calcular el perimetro de un circulo",
            "7. Calcular el perimetro de un rectangulo"};
        String Biv = Areas.Bienvenida();
        System.out.println(Biv);
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        eleccion = s.nextInt();
        if (eleccion == 1) {
            System.out.println("Introduzca el diametro para hayar el radio");
            radio = s.nextInt();
            int ar = Areas.Calculo(radio);
            System.out.println("El radio calculado es de: " + ar);
        }else if(eleccion == 2){
            System.out.println("Introduzca el diametro para hayar el area");
            diametro = s.nextInt();
            float ac = Areas.Area_Circulo(diametro);
            System.out.println("El area calculada es de: "+ac);
        }else if (eleccion == 3){
            System.out.println("Introduzca la base del triangulo");
            base = s.nextInt();
            System.out.println("Introduzca la altura del triangulo");
            altura = s.nextInt();
            int at = Areas.Area_triangulo(base, altura);
            System.out.println("El area calculada es de: "+at);
        }else if (eleccion == 4){
            System.out.println("Introduce la base del rectangulo");
            base = s.nextInt();
            System.out.println("Introduce la altura del rectangulo");
            altura = s.nextInt();
            int ar = Areas.Area_rectangulo(base, altura);
            System.out.println("El area calculada es de: "+ar);
        }else if (eleccion == 5){
            System.out.println("Introduce el radio del circulo 1");
            radio = s.nextInt();
            System.out.println("Introduce el radio del circulo 2");
            radio2 = s.nextInt();
            float aa = Areas.Area_Arandela(radio, radio2);
            System.out.println("El area calculada es de: "+aa);
        }else if (eleccion == 6){
            System.out.println("Introduce el perimetro del circulo");
            radio = s.nextInt();
            float pc = Areas.Perimetro_Circulo(radio);
            System.out.println("El perimetro calculado es de: "+pc);
        }else if (eleccion == 7){
            System.out.println("Introduce la anchura de la base");
            base = s.nextInt();
            System.out.println("Introduce la altura del rectangulo");
            altura = s.nextInt();
            float pr = Areas.Perimetro_Rectangulo(base,altura);
            System.out.println("El perimetro calculado es de: "+pr);
        }else if (eleccion == 8){
            System.out.println("Introduce el base del rectangulo");
            base = s.nextInt();
            float ar = Areas.Area_Arandela_cuadrada(base);
            System.out.println(ar);
        }
    }
}
