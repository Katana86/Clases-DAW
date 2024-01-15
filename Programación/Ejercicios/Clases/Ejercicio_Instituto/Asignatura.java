package Ejercicio_Instituto;

public class Asignatura{
    private String nombre;
    private String profesor;
    private int horasSemanales;

    public Asignatura(String nombre){
        this.nombre = nombre;
        this.profesor = "";
        this.horasSemanales = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getProfesor(){
        return this.profesor;
    }

    public int gethorasSemanales(){
        return this.horasSemanales;
    }

    public void setNombre(String valor){
        this.nombre = valor;
    }

    public void setProfesor(String valor){
        this.profesor = valor;
    }

    public void sethorasSemanales(int valor){
        this.horasSemanales = valor;
    }

    public String mostrar(){
        String cadena = "";
        
        cadena = "Nombre" + this.nombre + "\nProfesor: " + this.profesor + 
                  "\nHoras semanales: " + this.horasSemanales;
        return cadena;
    }
}
