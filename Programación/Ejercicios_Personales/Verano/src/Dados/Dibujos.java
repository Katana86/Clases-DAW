/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Alumno avanzado
 */
public class Dibujos {

    public void dibuja(int dado) {
        if (dado == 1) {
            uno();
        } else if (dado == 2) {
            dos();
        } else if (dado == 3) {
            tres();
        } else if (dado == 4) {
            cuatro();
        } else if (dado == 5) {
            cinco();
        } else if (dado == 6) {
            seis();
        }
    }

    public void uno() {
        System.out.println("         ");
        System.out.println("    *    ");
        System.out.println("         ");
    }

    public void dos() {
        System.out.println("         ");
        System.out.println("  *      ");
        System.out.println("     *   ");
        System.out.println("         ");
    }

    public void tres() {
        System.out.println("         ");
        System.out.println("  *      ");
        System.out.println("    *    ");
        System.out.println("      *  ");
        System.out.println("         ");
    }

    public void cuatro() {
        System.out.println("         ");
        System.out.println("  *   *  ");
        System.out.println("  *   *  ");
        System.out.println("         ");
    }

    public void cinco() {
        System.out.println("         ");
        System.out.println("  *   *  ");
        System.out.println("    *    ");
        System.out.println("  *   *  ");
        System.out.println("         ");
    }

    public void seis() {
        System.out.println("         ");
        System.out.println("  *   *  ");
        System.out.println("  *   *  ");
        System.out.println("  *   *  ");
        System.out.println("         ");
    }
    /*public void dibujo(int dado) {
        if (dado == 1) {
            for (int i = 0; i < dado; i++) {
                System.out.println("*");
            }
        } else if (dado == 2) {
            for (int i = 0; i < dado; i++) {
                System.out.println("*");
            }
        } else if (dado == 3) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } else if (dado == 4) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } else if (dado == 5) {
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
            System.out.println("*");
        } else if (dado == 6) {
            char punto = '*';
            char hueco = ' ';
            for (int i = 0; i < dado; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(hueco);
                }
                System.out.println(punto);
            }
        }*/
}
