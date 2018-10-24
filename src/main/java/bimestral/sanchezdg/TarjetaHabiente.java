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
public class TarjetaHabiente {
    @Id
    private String id;
    private String nombre;
    private String email;
    private Tarjeta tarjeta;

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

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaHabiente(String id, String nombre, String email, Tarjeta tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tarjeta = tarjeta;
    }

    public TarjetaHabiente() {
    }

    @Override
    public String toString() {
        return "TarjetaHabiente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", tarjeta=" + tarjeta + '}';
    }
    
    
}
