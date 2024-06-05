/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_ListaMultimedia;

/**
 *
 * @author ivanpa
 */
public class ListaMultimedia {
    private int contador;
    private Multimedia[] lista;

    public ListaMultimedia(int capacidad) {
        lista = new Multimedia[capacidad];
        contador = 0;
    }
    
    public int size(){
        return contador;
    }
    
    public boolean add(Multimedia m){
        if (contador < lista.length) {
            lista[contador++] = m;
            return true;
        }else{
            return false;
        }
    }
    
    public Multimedia get(int position){
        if (position <= contador) {
            return lista[position];
        }else{
            return null;
        }
    }
    
    @Override
    public String toString(){
        String salida = "";
        for(int i = 0; i < contador; i++){
            salida += lista[i]+"\n";
        }
        return salida;
    }
}
