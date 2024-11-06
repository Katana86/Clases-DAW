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
public class Dibujos_OG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        linea(10);
//        rectangulo(10);
//        linea_hueca(10);
//        rectangulo_hueco(10);
//        escalera(10);
//        escalera_invertida(10);
//        escalera_centrada(10);
//        triangulo(10);
//        rayo(10);
//        diamante(10);
//        simbolo_mas(10);
//        letra_h(10);
//        letra_a(10);
//        letra_b(10);
//        reloj_arena(10);
//        letra_x(10);
//        letra_z(10);
//        barras(10);
//        letra_a_and(10);
//        letra_b_and(10);
//        tablero(10);
//        multiplo(10);
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
