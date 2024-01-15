/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays.explicación;

/**
 *
 * @author ivanpa
 */
public class ArrayBidimensional {
    public static void main(String[] args) {
        // TODO code application logic here
        double[][]valor = new double[4][5];
        for (int i=0; i < valor.length; i++){
            for (int j=0; j < valor[i].length; j++){
               valor[i][j]=Math.random();
            }
        }
        for (int i=0; i < valor.length; i++){
            for (int j=0; j < valor[i].length; j++){
               System.out.printf("%.2f ",valor[i][j]);
            }
            System.out.println();
        }
    }
}
