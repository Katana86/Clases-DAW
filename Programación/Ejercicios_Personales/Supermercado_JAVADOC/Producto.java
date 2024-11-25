/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supermercado_JAVADOC;

/**
 *
 * @author Alumno avanzado
 */
public class Producto {

    int unidades;
    int precio;

    Producto(int unidades, int precio) {
        this.unidades = unidades;
        this.precio = precio;
    }

    public int precioSinDescuento() {
        int suma = unidades * precio;
        return suma;
    }
/**
 * Returns the {@code char} value at the
 * specified index. An index ranges from {@code 0} to
 * {@code length() - 1}. The first {@code char} value of the sequence
 * is at index {@code 0}, the next at index {@code 1},
 * and so on, as for array indexing.
 *
 * <p>If the {@code char} value specified by the index is a
 * <a href="Character.html#unicode">surrogate</a>, the surrogate
 * value is returned.
 *
 * @author Iván
 * @version 1.00
 * @param       
 * @return      total sin descuento
 * 
 */
    public int pagar() {
            int UD_descontar = unidades / 3;
            int ud = unidades-UD_descontar;
            int precioT = ud * precio;
            return precioT;
             }

    public String toString() {
        return   "Se ha aplicado" + " " + unidades + "x2 solo paga 2 unidades\nEl precio sin descuento : " + precioSinDescuento()+"\nEl precio con descuento es : "+pagar();
    }
}
