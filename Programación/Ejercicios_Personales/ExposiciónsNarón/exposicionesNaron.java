/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExposiciónsNarón;

import java.util.Scanner;

/**
 *
 * @author ivanpp
 */
public class exposicionesNaron {
    
    public static void main(String[] args){
        Evento evento = new Evento();
        int opcion = 0;
        boolean comprobar = false;
        
        do{
            opcion = mostrarMenu();
            
            if (comprobar) {
                switch (opcion) {
                    case 1 -> {
                        if (!comprobar) {
                            crearEvento(evento);
                            comprobar = true;
                        }else{
                            System.out.println("El evento " + evento.getNom() + " ya fue creado\n" 
                                    + "Quiere reemplazarlo por un nuevo evento\n(S - Si || Cualquier otra letra -> No)");
                            if (usu.next().toUpperCase().equals("S")) {
                                evento = new Evento();
                                crearEvento(evento);
                            }
                        }
                    }
                    case 2 -> {
                        mostrarEntradas(evento);
                    }
                    case 3,4 -> {
                        cambiarEntradas(evento, opcion);
                    }
                    case 5 -> {
                        System.out.printf("El evento " + evento.getNom() + " ha recaudado: %.2f$\n", evento.getGanancias());
                    }
                    default -> throw new AssertionError();
                }
            }
        }while (opcion != 6);
    }

    static Scanner usu = new Scanner(System.in);

    public static int mostrarMenu() {
        int elec = 0;
        System.out.print("1.- Definir evento.\n"
                + "2.- Amosar entradas dispoñibles.\n"
                + "3.- Venda de entradas.\n"
                + "4.- Devolución de entradas.\n"
                + "5.- Resumo evento.\n"
                + "6.- Saír.");
        elec = usu.nextInt();
        return elec;
    }
    
    public static void crearEvento(Evento evento){
        usu.nextLine();
        System.out.println("Introduzca el nombre del evento: ");
    }
    
    public static void mostrarEntradas(Evento evento){
        System.out.println("Entradas disponibles: ");
        
        
    }
    
    public static void cambiarEntradas(Evento evento, int opcion){
        int temp, entradas, libres;
        boolean limit, loop = false;
        
        System.out.println("Elija una zona:");
        for (int i = 0; i < evento.getZone().length; i++) {
            System.out.println("\t" + (i + 1) + ".- " + evento.getZone()[i].getNome());
        }
        temp = usu.nextInt() - 1;
        
        do{
            if (temp < evento.getZone().length) {
                System.out.println(opcion == 3 ? "Cuantas entradas quiere comprar" : "Cuantas entradas quiere devolver");
                entradas = usu.nextInt();
                
                libres = opcion == 3 ? evento.z.numEntradas - evento.z.getEntradasCompradas() : evento.z.entradasCompradas;
                limit = entradas >= 0 && entradas <= libres;
                
                if (limit) {
                    evento.venta(opcion == 3 ? entradas : -entradas, temp);
                    loop = true;
                }
                
                libres = evento.z.getNumEntradas() - evento.z.getEntradasCompradas();
                
                if (limit) {
                    System.out.println(opcion == 3 ? "Aqui tiene sus entradas, muchas gracias" : "Sentimos que no pueda disfrutar del evento. Hasta luego!");
                }else{
                    System.out.println(opcion == 3 ? "En este momento solo disponemos de " + libres + " en esta zona" : "Entradas falsas");
                }
            }else{
                System.out.println("La zona " + (temp + 1) + " no existe");
            }
        }while (!loop);
    }
}
