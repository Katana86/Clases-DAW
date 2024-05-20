package ficheros.Ejercicio2;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivanpa
 */
public class OrdenDepartamento implements Comparator <Empregado>{
    @Override
    public int compare(Empregado e1, Empregado e2) {
        int valor;
        if (e1.departamento.equalsIgnoreCase(e2.departamento)) {
            valor = e1.nome.compareToIgnoreCase(e2.nome);
        } else {
            valor = e1.departamento.compareToIgnoreCase(e2.departamento);
        }
        return valor;
    }
}
