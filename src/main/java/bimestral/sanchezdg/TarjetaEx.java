/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bimestral.sanchezdg;

/**
 *
 * @author T-107
 */
public class TarjetaEx {
    
    private String tipo;
    private float saldo;
    private String fechaCorte;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public TarjetaEx(String tipo, float saldo, String fechaCorte) {
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechaCorte = fechaCorte;
    }

    public TarjetaEx() {
    }

    @Override
    public String toString() {
        return "TarjetaEx{" + "tipo=" + tipo + ", saldo=" + saldo + ", fechaCorte=" + fechaCorte + '}';
    }
    
    
    
}
