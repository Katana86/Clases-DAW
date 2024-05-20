package ficheros.Ejercicio2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public class EmpleadoMain {
    public static void main(String[] args) {
        String linha = "";
        ArrayList<Empregado> empregados = new ArrayList<>();
        Iterator it;
        try (BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\ivanpa\\Desktop\\Ejercicios Programación\\Java\\Ficheros\\archivos\\cesta\\cesta1.prp"))){
            linha = buffer.readLine();
            while (linha != null) {
                engadirLinha(empregados, linha);
                linha = buffer.readLine();
            }
            System.out.println("Empregados ordenados por orde alfabética:");
            empregados.sort(new OrdenAlfabetico());
            it = empregados.iterator();
            while (it.hasNext()) {
                Empregado emp = (Empregado)it.next();
                System.out.println(emp);
            }
            System.out.println("Empregados ordenados por departamento e por orde "
                    + "alfabética :");
            empregados.sort(new OrdenDepartamento());
            it = empregados.iterator();
            while (it.hasNext()) {
                Empregado emp = (Empregado)it.next();
                System.out.println(emp);
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.out.println("ERRO: O ficheiro é un directorio ou ben non existe.");
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
        }
    }    
    
    public static void engadirLinha(ArrayList<Empregado> lista, String lin) {
        String[] valores = lin.split(";");
        lista.add(new Empregado(valores[0],valores[1],Integer.valueOf(valores[2]),
                valores[3]));
    }
}
