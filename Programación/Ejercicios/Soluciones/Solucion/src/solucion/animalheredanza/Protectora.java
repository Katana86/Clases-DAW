/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion.animalheredanza;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import solucion.animais.*;
import static solucion.animalheredanza.Protectora.paisProcedencia;
import solucion.interfaces.Horario;
import solucion.interfaces.Pais;
import solucion.persoas.*;

/**
 *
 * @author Alumno avanzado
 */
public class Protectora {
    
    public static Scanner sc = new Scanner(System.in);
    public static Traballadores[] listaTraballadores = new Traballadores[5];
    public static Animal[] listaAnimais = new Animal[3];
    public static Adopcion[] listaAdopcions = new Adopcion[3];
    
    public static void main(String[] args) {
        Animal animal;
        Traballadores traballador;
        int opcion;
        do{
            boolean okAlta = false;
            amosarMenu();
            try{
                System.out.println("Escolle unha opcion:");
                opcion = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Opcion invalida, ten que ser un numero entre 1 e 5, intentao de novo.");
                break;
            }
            switch (opcion) {
                case 1 -> {
                    System.out.println("Queres dar de alta un can ou un gato???");
                    if (sc.next().equalsIgnoreCase("Can")) animal = new Can();
                    else animal = new Gato();
                    
                    for (int i = 0; i < listaAnimais.length; i++) {
                        if (listaAnimais[i] == null) {
                            if (animal instanceof Can) listaAnimais[i] = (Can) animal;
                            else listaAnimais[i] = (Gato) animal;    
                            
                            okAlta = true;
                            crearAnimal(listaAnimais[i]);
                            break;
                        }   
                       
                    }
                    System.out.println((okAlta) ? "Alta realizada correctamente." : "Sen prazas dispnibles.");
                }
                case 2 -> {
                    System.out.println("---------");
                    System.out.println("ANIMAIS:");
                    System.out.println(Arrays.toString(listaAnimais));
                    System.out.println("Indica o animal que queres dar de baixa(0-3).");
                    int numAnimal = sc.nextInt();
                    if (listaAnimais[numAnimal] != null) listaAnimais[numAnimal] = null;
                    else System.out.println("Ese animal non existe, intenteo de novo.");
                }
                case 3 -> {
                    System.out.println("Queres dar de alta un cuidador ou un voluntario???");
                    if (sc.next().equalsIgnoreCase("Cuidador")) traballador = new Cuidadores();
                    else traballador = new Voluntarios();
                        
                    for (int i = 0; i < listaTraballadores.length; i++) {
                        if (listaTraballadores[i] == null) {
                            if (traballador instanceof Cuidadores cuidadores) listaTraballadores[i] = cuidadores;
                            else listaTraballadores[i] = (Voluntarios) traballador;
                            okAlta = true;
                            crearPersoa(listaTraballadores[i]);
                            crearTraballador(listaTraballadores[i]);
                            break;
                        }
                    }
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7  -> {System.out.println("Ata outra!!!!");}
                default -> 
            }
        } while(opcion != 7);
    }
    
    public static void amosarMenu(){
        System.out.println("\n____________________\n");
        System.out.println("APLICACION PROTECTORA.");
        System.out.println("1. Dar de alta un animal.");
        System.out.println("2. Dar de baixa un animal.");
        System.out.println("3. Dar de alta un trabaxador.");
        System.out.println("4. Dar de baixa un trabaxador.");
        System.out.println("5. Facer unha adopcion.");
        System.out.println("6. Amosar informacion da protectora.");
        System.out.println("7. Sair.");
    }
    
    public static String paisProcedencia(String pais){
        switch (pais.toUpperCase()) {
            case "ESP" -> {return Pais.ESP;}
            case "CHE" -> {return Pais.CHE;}
            case "FRA" -> {return Pais.FRA;}
            case "MAR" -> {return Pais.MAR;}
            case "ITA" -> {return Pais.ITA;}
            case "POR" -> {return Pais.POR;}
            default ->{
                try{
                    throw new AssertionError();
                }catch (AssertionError e){
                    System.out.println("Opcion ivalida, o numero ten que ser un pais valido.");
                }
            }
        }
        return "";
    }
    
    public static void crearAnimal(Animal animal){
        System.out.println("Escribe a raza do animal:");
        animal.setRaza(sc.next());
        System.out.println("Escribe o peso do animal:");
        animal.setPeso(sc.nextDouble());
        System.out.println("Escribe o pais de procedencia do animal.");
        System.out.println("Valores posibles: ESP, ITA, FRA, CHE, MAR ou POR. ");
        animal.setPaisProcedencia(paisProcedencia(sc.next()));
        System.out.println("Escribe a data de nacemento do animal (YYYY-MM-DD):");
        animal.setDataNac(sc.next());
    }
    
    public static void crearPersoa(Persoa persoa){
        System.out.println("Escribe o DNI:");
        persoa.setDNI(sc.next());
        System.out.println("Escribe o nome:");
        persoa.setNome(sc.next());
        System.out.println("Escribe o telefono:");
        persoa.setTelefono(sc.next());
        System.out.println("Escribe a data de nacemento (YYYY-MM-DD):");
        persoa.setDataNac(sc.next());
    }
    
    public static void crearTraballador(Traballadores traballador){
        int horario;
        do{
            System.out.println("Escribe o horario do traballador (1-MAÑA, 2-TARDE, 3-PARTIDO):");
            horario = sc.nextInt();
            switch (horario) {
                case 1 -> {
                    traballador.setHorario(Horario.MAÑA);
                }
                case 2 -> {
                    traballador.setHorario(Horario.TARDE);
                }
                case 3 -> {
                    traballador.setHorario(Horario.PARTIDO);
                }
                default -> {
                    try{
                        throw new AssertionError();
                    }catch (AssertionError e){
                        System.out.println("Opcion invalida, o numero ten que ser entre 1 e 3, intenteo de novo.");
                    }
                }
            }
        } while(horario < 1 || horario > 3);
        if (traballador instanceof Cuidadores) {
            System.out.println("Indica o soldo");
            ((Cuidadores) traballador).setSoldo(sc.nextDouble());
        }
    }
    
    public void crearAdopcion(Adopcion adopcion){
        Clientes cliente = new Clientes();
        System.out.println("Datos do cliente que quere adoptar");
        crearPersoa(cliente);
        System.out.println("Escriba a direccion");
        cliente.setDireccion(sc.next());
        adopcion.setCliente(cliente);
        System.out.println("------");
        System.out.println("Animais disponibles.");
        System.out.println(Arrays.toString(listaAnimais));
        System.out.println("Escolle o animal que queres adoptar (0-3)");
        adopcion.setAnimal(listaAnimais[sc.nextInt()]);
        adopcion.setDataAdopcion(LocalDate.now());
        System.out.println("Adopcion rematada.");
    }
}
