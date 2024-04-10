/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Alumno avanzado
 */
public class Cuenta {
    int NumC;
    String titular;
    float saldo;
    boolean nomina;
    
    Cuenta(int NC,String tit){
        this.NumC = NC;
        this.titular = tit;
        saldo=0;
        nomina = true;
    }

   

    

    public int getNumC() {
        return NumC;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void ingreso(float ingreso) {
        saldo= saldo+ingreso;
    }
    
    public void reintegro(float reintegro) {
        if(nomina == false){
            if (reintegro > saldo) {
                System.out.println("ERROR");
            }else{
                saldo = saldo - reintegro;
            }
        }
       else{
            if(reintegro < saldo + 500){
                saldo = saldo - reintegro;
            }else{
                System.out.println("ERROR");
            }
        }
    }
    
    void Comision(){
        if (nomina == false){
        if (saldo > 20000) {
            saldo = saldo;
        }else if(saldo > 10000){
            saldo = saldo - 30;
        }else{
            saldo = saldo - 60;
            }
        }
       
        }
    
    public void setNomina(boolean nomina){
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "NumC=" + NumC + ", titular=" + titular + ", saldo=" + saldo + ", nomina=" + nomina + '}';
    }
}
