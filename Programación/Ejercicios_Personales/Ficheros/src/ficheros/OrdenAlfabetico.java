/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros.Ejercicio2;

import java.util.Comparator;

/**
 *
 * @author ivanpa
 */
public class OrdenAlfabetico implements Comparator <Empregado>{
    @Override
    public int compare(Empregado e1, Empregado e2) {
        return e1.nome.compareToIgnoreCase(e2.nome);
    }
}