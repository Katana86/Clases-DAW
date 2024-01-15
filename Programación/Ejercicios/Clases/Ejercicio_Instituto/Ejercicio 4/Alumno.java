package Ejercicio_Instituto;

/*
 *  Clase Alumno representa a un alumno de un instituto
 *  Variables
 *  dni String almacena el dni del alumno
 *  nombre String almacena el nombre del alumno
 *  apellido1 String almacena el 1º apellido del alumno
 *  apellido2 String almacena el 2º apellido del alumno
 *  asignaturas     almacena las asignaturas cursadas por el alumno
 */
public class Alumno{
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    //asignatura

    public Alumno(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = "";
    }
    
    public String getDni(){
        return this.dni;
    }

     public String getNombre(){
        return this.nombre;
    }

    public String getApellido1(){
        return this.apellido1;
    }

    public String getApellido2(){
        return this.apellido2;
    }

    public void setDni(String valor){
        this.dni = valor;
    }

    public void setNombre(String valor){
        this.dni = valor;
    }

    public void setApellido1(String valor){
        this.apellido1 = valor;
    }

    public void setApellido2(String valor){
        this.apellido2 = valor;
    }
}