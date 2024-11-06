/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

/**
 *
 * @author Alumno avanzado
 */
public class carga {

    int carga;
    int maxima_carga;
    int maximos_bultos;
    int bultos;

    public void añadir(int carga) {
        if (this.carga+carga > maxima_carga || bultos >= maximos_bultos) {
            System.out.println("Se ha superado la carga maxima");
            System.out.println("Se ha superado el numero de bultos maximos");
            //System.out.println("this.carga= "+this.carga+" "+"carga= "+carga);
        }else{
            this.carga = this.carga + carga;
            this.bultos++;
            //System.out.println("this.carga= "+this.carga+" "+"carga= "+carga);
        }
            
    }

    public void maxima_carga(int maxima) {
        this.maxima_carga = maxima;
    }
    
    public void maximos_bultos(int maximos){
        this.maximos_bultos = maximos;
    }

    @Override
    public String toString() {
        return "La carga es: " + carga;
    }
    
    public String ver_bultos(){
        return "Los bultos que hay son: " + bultos;
    }
}
