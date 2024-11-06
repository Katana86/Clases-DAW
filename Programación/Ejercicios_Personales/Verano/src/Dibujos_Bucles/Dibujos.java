package Dibujos_Bucles;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Alumno avanzado
 */
public class Dibujos {

    /**
     * @param args the command line arguments
     */

    public static void dibujo(int eleccion,int tamaño) {
        switch (eleccion) {
            case 1:
                linea(tamaño);
                System.out.println("Figura: "+"linea");
                break;
            case 2:
                rectangulo(tamaño);
                System.out.println("Figura: "+"rectangulo");
                break;
            case 3:
                linea_hueca(tamaño);
                System.out.println("Figura: "+"linea_hueca");
                break;
            case 4:
                rectangulo_hueco(tamaño);
                System.out.println("Figura: "+"rectangulo_hueco");
                break;
            case 5:
                escalera(tamaño);
                System.out.println("Figura: "+"escalera");
                break;
            case 6:
                escalera_invertida(tamaño);
                System.out.println("Figura: "+"escalera_invertida");
                break;
            case 7:
                escalera_centrada(tamaño);
                System.out.println("Figura: "+"escalera_centrada");
                break;
            case 8:
                triangulo(tamaño);
                System.out.println("Figura: "+"triangulo");
                break;
            case 9:
                rayo(tamaño);
                System.out.println("Figura: "+"rayo");
                break;
            case 10:
                diamante(tamaño);
                System.out.println("Figura: "+"diamante");
                break;
            case 11:
                simbolo_mas(tamaño);
                System.out.println("Figura: "+"simbolo_mas");
                break;
            case 12:
                letra_h(tamaño);
                System.out.println("Figura: "+"letra_h");
                break;
            case 13:
                letra_a(tamaño);
                System.out.println("Figura: "+"letra_a");
                break;
            case 14:
                letra_b(tamaño);
                System.out.println("Figura: "+"letra_b");
                break;
            case 15:
                reloj_arena(tamaño);
                System.out.println("Figura: "+"reloj_arena");
                break;
            case 16:
                letra_x(tamaño);
                System.out.println("Figura: "+"letra_x");
                break;
            case 17:
                letra_z(tamaño);
                System.out.println("Figura: "+"letra_z");
                break;
            case 18:
                barras(tamaño);
                System.out.println("Figura: "+"barras");
                break;
            case 19:
                letra_a_and(tamaño);
                System.out.println("Figura: "+"letra_a_and");
                break;
            case 20:
                letra_b_and(tamaño);
                System.out.println("Figura: "+"letra_b_and");
                break;
            case 21:
                tablero(tamaño);
                System.out.println("Figura: "+"tablero");
                break;
            case 22:
                multiplo(tamaño);
                System.out.println("");
                System.out.println("Figura: "+"multiplo");
                break;
            default:
                break;
        }
    }

    public static void linea(int tamaño) {

        char asterisco = '*';
        for (int i = 0; i < tamaño; i++) {
            System.out.print(asterisco);
        }
        System.out.println("");
    }

    public static void linea_hueca(int tamaño) {

        char asterisco = '*';
        String hueco = " ";
        System.out.print(asterisco);
        for (int i = 0; i < tamaño - 2; i++) {
            System.out.print(hueco);
        }
        System.out.print(asterisco);
        System.out.println("");
    }

    public static void hueco(int tamaño) {
        String hueco = " ";
        for (int i = 0; i < tamaño; i++) {
            System.out.print(hueco);
        }
        //System.out.println("");
    }

    public static void rectangulo(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            linea(tamaño);
        }
    }

    public static void reloj_arena(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i + j == tamaño - 1 || i == 0 || i == tamaño - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void rectangulo_hueco(int tamaño) {
        linea(tamaño);
        for (int i = 0; i < tamaño - 2; i++) {
            //linea(tamaño);
            linea_hueca(tamaño);
        }
        linea(tamaño);
    }

    public static void escalera(int tamaño) {
        for (int i = 1; i <= tamaño; i++) {
            linea(i);
        }
    }

    public static void escalera_invertida(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            linea(tamaño - i);
        }
    }

    public static void escalera_centrada(int tamaño) {
        for (int i = 1; i <= tamaño; i++) {
            hueco(tamaño - i);
            linea(i);
        }
    }

    public static void triangulo(int tamaño) {
        for (int i = 0; i <= tamaño; i++) {
            hueco(tamaño - i);
            linea(i * 2 + 1);
        }
    }

    public static void rayo(int tamaño) {
        for (int i = 1; i <= tamaño; i++) {
            hueco(tamaño - i);
            linea(i);
        }
        for (int i = 0; i < tamaño; i++) {
            hueco(tamaño);
            linea(tamaño - i);
        }
    }

    public static void diamante(int tamaño) {
        //Triangulo_Superior
        for (int i = 0; i <= tamaño; i++) {
            hueco(tamaño - i);
            linea(i * 2 + 1);
        }
        //Triangulo_Inferior
        for (int i = tamaño; i >= 0; i--) {
            hueco(tamaño - i);
            //linea(tamaño - i);
            linea(i * 2 + 1);
        }
    }

    public static void simbolo_mas(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            hueco(tamaño / 2);
            linea(1);
            if (i == tamaño / 2) {
                linea(tamaño);
            }
        }
    }

    public static void letra_h(int tamaño) {
        for (int i = 1; i < tamaño; i++) {
            linea_hueca(tamaño);
            if (i == tamaño / 2) {
                linea(tamaño);
            }
        }
    }

    public static void letra_a(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i == 0 || i == tamaño / 2) {
                linea(tamaño);
            } else {
                linea_hueca(tamaño);
            }
        }
    }

    public static void letra_b(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i == 0 || i == tamaño / 2 || i == tamaño - 1) {
                //System.out.print(i);
                linea(tamaño);
            } else {
                //System.out.print(i);
                linea_hueca(tamaño);
            }
        }
        //linea(tamaño);
    }

    public static void letra_x(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i + j == tamaño - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void letra_z(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i + j == tamaño - 1 || i == 0 || i == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void barras(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j != 0 && j != tamaño - 1) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void letra_a_and(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i != 0 && i != tamaño / 2) {
                linea_hueca(tamaño);
            } else {
                linea(tamaño);
            }
        }
    }

    public static void letra_b_and(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i != 0 && i != tamaño / 2 && i != tamaño - 1) {
                //System.out.print(i);
                linea_hueca(tamaño);
            } else {
                //System.out.print(i);
                linea(tamaño);
            }
        }
        //linea(tamaño);
    }

    public static void tablero(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void multiplo(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            if (i % 3 == 0) {
                System.out.print("+");
            } else {
                System.out.print("*");
            }
        }
    }

    /*public static void anillo(int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            hueco(tamaño / 2);
            if (i == 0) {
                linea(tamaño + 1);
            }
        }
    }*/
}
