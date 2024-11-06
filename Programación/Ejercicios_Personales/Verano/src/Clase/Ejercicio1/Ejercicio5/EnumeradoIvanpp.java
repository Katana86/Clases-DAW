package Clase.Ejercicio1.Ejercicio5;

/**
 *
 * @author ivanpp
 * @version 1.00
 */
//CLASE
public class EnumeradoIvanpp {
    //MAIN
    public static void main(String[] args) {
        //IVÁN PIÑEIRO PASTORIZA
        //CON UN ENUM ALMACENO LOS MESES
        enum meses {Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre}
        //GUARDO LA ELECCION DEL MESES = MARZO COMO M
        meses m = meses.Marzo;
        //RESULTADO
        System.out.println(m);
    }//FIN MAIN
}//FIN CLASE