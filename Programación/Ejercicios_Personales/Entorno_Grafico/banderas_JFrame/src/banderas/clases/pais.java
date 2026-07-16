/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banderas.clases;

import javax.swing.ImageIcon;

/**
 *
 * @author Alumno avanzado
 */
public class pais {
    private String nombre;
    private ImageIcon icono;
    
    public pais(String nombre, ImageIcon icono) {
        this.nombre = nombre;
        this.icono = icono;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public ImageIcon getIcono() {
        return icono;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
