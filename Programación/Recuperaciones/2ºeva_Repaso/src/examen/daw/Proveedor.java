/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.daw;

import java.io.Serializable;

/**
 *
 * @author ivanpa
 */
public class Proveedor implements Serializable{
   private int id;
   private String empresa,tipo,direccion,nro_telePrincipal,nro_teleSecundario,email;

    public Proveedor(int id, String empresa, String tipo, String direccion, String nro_telePrincipal, String nro_teleSecundario, String email) {
        this.id = id;
        this.empresa = empresa;
        this.tipo = tipo;
        this.direccion = direccion;
        this.nro_telePrincipal = nro_telePrincipal;
        this.nro_teleSecundario = nro_teleSecundario;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNro_telePrincipal() {
        return nro_telePrincipal;
    }

    public void setNro_telePrincipal(String nro_telePrincipal) {
        this.nro_telePrincipal = nro_telePrincipal;
    }

    public String getNro_teleSecundario() {
        return nro_teleSecundario;
    }

    public void setNro_teleSecundario(String nro_teleSecundario) {
        this.nro_teleSecundario = nro_teleSecundario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
