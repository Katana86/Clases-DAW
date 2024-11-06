//Paquetes
package Clase.Ejercicio1.Ejercicio2;
/**
 *
 * @author ivanpp
 * @version 1.00
 */
//CLASES
public class UsoVariables2Ivanpp {
    //MAIN
    public static void main(String[] args) {
        boolean casado;
        final int maximo;
        enum semana {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo};
        semana sem;
        short dia;
        enum sexo {V,M};
        sexo s;
        long milseg;
        double factura;
        double pob;
        System.out.printf("----- EXERCICIO DE VARIABLES E TIPOS DE DATOS -----");
        casado = true;
        System.out.printf("\nCasado: "+casado);
        maximo = 999999;
        System.out.printf("\nMaximo: "+maximo);
        sem = semana.Lunes;
        System.out.printf("\nDia Semana: "+sem);
        dia = 300;
        System.out.printf("\nDia Actual: "+dia);
        milseg = 1298332800000l;
        System.out.printf("\nMilisegundos: "+milseg);
        factura = 10350.677734;
        System.out.printf("\nFactura: %e\n",factura);
        pob = 6775235741d;
        System.out.printf("Poblacion: "+pob);
        s = sexo.M;
        System.out.printf("\nSexo: "+s);
        System.out.printf("\n");
    }//Fin MAIN
}//Fin Clase




        /*System.out.println("----- EXERCICIO DE VARIABLES E TIPOS DE DATOS -----");
        System.out.println("IVAN PINEIRO PASTORIZA");
        casado = true;
        System.out.println("Casado: "+casado);
        maximo = 999999;
        System.out.println("Maximo: "+maximo);
        sem = semana.Lunes;
        System.out.println("Dia: "+sem);
        dia = 300;
        System.out.println("Dia Actual: "+dia);
        milseg = 1298332800000l;
        System.out.println("Milisegundos: "+milseg);
        factura = 10350.678;
        System.out.println("Factura: "+factura);
        pob = 6775235741d;
        System.out.println("Poblacion: "+pob);
        s = sexo.M;
        System.out.println("Sexo: "+s);*/