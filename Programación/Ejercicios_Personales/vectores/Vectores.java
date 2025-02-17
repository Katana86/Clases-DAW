/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumno avanzado
 */
public class Vectores {

    static int vec1[] = {8, 5, 4, 6, 3};
    static int vec2[] = {3, 5, 2};

    static Scanner usu = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //vec1=llenarVector(3);
        //vec2=llenarVector(3);
        //System.out.println("CREANDO VECTOR SUMA");
        //int []vs=sumarVec(vec1,vec2);
        //verVector(vs);
        //mayorVector(vec1,vec2);
        //int []co=concatenarVector(vec1, vec2);
        //int mu = multipicarVectores(vec1, vec2);
        //int r = restaVectores(vec1, vec2);
        int[] ar = parVectores(vec1);
        verVector(ar);
    }

    public static int[] sumarVec(int[] vec1, int[] vec2) {
        int vec3[] = new int[vec1.length];
        for (int i = 0; i < vec3.length; i++) {
            vec3[i] = (vec1[i] + vec2[i]);
        }
        return vec3;
    }

    public static int[] verVector(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
        return vec;
    }

    public static int[] llenarVector(int n) {
        int vec[] = new int[n];
        System.out.println("[VECTOR]");
        for (int i = 0; i < vec.length; i++) {
            vec[i] = usu.nextInt();
        }
        return vec;
    }

    public static int[] mayorVector(int[] vec, int[] vec2) {
        int vec3[] = new int[vec.length];
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] > vec2[i]) {
                vec3[i] = vec[i];
            } else {
                vec3[i] = vec2[i];
            }
        }
        return vec3;
    }

    public static int[] concatenarVector(int[] vec, int[] vec2) {
        int length = (vec.length + vec2.length);
        int vec3[] = new int[length];
        for (int i = 0; i < vec.length; i++) {
            vec3[i] = vec[i];
        }
        for (int i = 0; i < vec2.length; i++) {
            vec3[vec.length + i] = vec2[i];
        }
        return vec3;
    }

    public static int multipicarVectores(int[] vec, int[] vec2) {
        int resultado = 0;
        if (vec.length == vec2.length) {
            for (int i = 0; i < vec.length; i++) {
                int prod = vec[i] * vec2[i];
                System.out.println(prod);
                resultado += prod;
            }
        } else {
            System.out.println("Vector con una longitud mayor. Deben ser de la misma longitud");
        }
        return resultado;
    }

    public static int sumaVectores(int[] vec) {
        int sumaVec = 0;
        for (int i = 0; i < vec.length; i++) {
            sumaVec += vec[i];
        }
        return sumaVec;
    }

    public static int restaVectores(int[] vec, int[] vec2) {
        int Svec = sumaVectores(vec);
        int Svec2 = sumaVectores(vec2);
        return Svec - Svec2;
    }

    public static int sumaParVectores(int[] vec) {
        int sumaPar = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] % 2 == 0) {
                sumaPar += vec[i];
            }
        }
        return sumaPar;
    }

    public static int contarPares(int[] vec) {
        int pares = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
    
    
    public static int sumaImparVectores(int[] vec) {
        int sumaImpar = 0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] % 2 != 0) {
                sumaImpar += vec[i];
            }
        }
        return sumaImpar;
//        return sumaVectores(vec)-sumaParVectores(vec);
    }

    public static int restaParImparVectores(int[] vec) {
        int sumaPar = sumaParVectores(vec);
        int sumaImpar = sumaImparVectores(vec);
        return sumaPar - sumaImpar;
    }

    public static int[] parVectores(int[] vec) {
        int par[] = new int[contarPares(vec)];
        
        for (int i = 0,j=0; i < vec.length; i++) {
            if (vec[i] % 2 == 0) {
                par[j] = vec[i];
                j++;
            }
        }
        return par;
    }
}
