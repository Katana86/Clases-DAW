/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces.Ejercicio1;

/**
 *
 * @author ivanpp
 */
public class chamadaIvanPP {
    LlamadaProvincial lp = new LlamadaProvincial();
    LlamadaLocal ll = new LlamadaLocal();
    private double costeTotal = (lp.costeLlamada()+ll.costeLlamada());
    private int NumLlamadas;
    
    public double getCosteTotal() {
        return costeTotal;
    }

    public int getNumLlamadas() {
        return NumLlamadas;
    }
    
    public Llamada aceptarLlamada(Llamada llamada){
        return llamada;
    }
    
    public String informeCentralita(){
        return "Llamadas: "+NumLlamadas+"Facturacion: "+costeTotal;
    }
}
