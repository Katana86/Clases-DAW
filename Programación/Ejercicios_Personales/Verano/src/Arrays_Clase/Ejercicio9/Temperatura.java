/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_Clase.Ejercicio9;

/**
 *
 * @author Alumno avanzado
 */
public class Temperatura {
    private float tem_max;
    private float tem_min;
    private float tem_media;

    public float getTem_max() {
        return tem_max;
    }

    public void setTem_max(float tem_max) {
        this.tem_max = tem_max;
    }

    public float getTem_min() {
        return tem_min;
    }

    public void setTem_min(float tem_min) {
        this.tem_min = tem_min;
    }
    
    public float temperatura_Media() {
            tem_media = (getTem_max() + getTem_min()) / 2;
            return tem_media;
    }
  
}
