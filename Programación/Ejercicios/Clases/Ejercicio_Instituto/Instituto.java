package Ejercicio_Instituto;

public class Instituto {
    public static void main(String[] args) {
        Alumno alumno1;
        Alumno alumno2;
        Asignatura asig1;
        Asignatura asig2;

        alumno1 = new Alumno("Carlos","Sarmiento","Perez");
        alumno2 = new Alumno("Sandra","López","López");
        asig1 = new Asignatura("FOL");
        asig2 = new Asignatura("Programación");

        alumno1.setDni("3300111H");
        System.out.println(alumno2.getApellido1());
        asig1.setProfesor("Jose");
        asig1.sethorasSemanales(4);
        asig2.setNombre("Sofia");
        asig2.sethorasSemanales(6);

        System.out.println(asig1.mostrar());
        System.out.println(asig2.mostrar());
    }
}
