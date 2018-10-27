/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestral.sanchezdg;

import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Cliente {
    
    @Id
    private String id;
    private String nombre;
    private String email;
    private TarjetaEx tarjetaEx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TarjetaEx getTarjetaEx() {
        return tarjetaEx;
    }

    public void setTarjetaEx(TarjetaEx tarjetaEx) {
        this.tarjetaEx = tarjetaEx;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String email, TarjetaEx tarjetaEx) {
        this.nombre = nombre;
        this.email = email;
        this.tarjetaEx = tarjetaEx;
    }

    public Cliente(String id, String nombre, String email, TarjetaEx tarjetaEx) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tarjetaEx = tarjetaEx;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", tarjetaEx=" + tarjetaEx + '}';
    }

    

    
    
    
    
}
