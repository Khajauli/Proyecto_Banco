/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivann
 */
public class Transferencias implements Cajero{
    private int receptorCuenta;
    private String mensaje;
    private String receptorNombre;
    private double montoT;
    private double saldo;
     @Override
     public double calcularTransferencia(){
    this.saldo=this.saldo-this.montoT;
    return this.saldo;
    }

    public int getReceptorCuenta() {
        return receptorCuenta;
    }

    public void setReceptorCuenta(int receptorCuenta) {
        this.receptorCuenta = receptorCuenta;
    }

    public String getRazon() {
        return mensaje;
    }

    public void setRazon(String razon) {
        this.mensaje = razon;
    }

    public String getReceptorNombre() {
        return receptorNombre;
    }

    public void setReceptorNombre(String receptorNombre) {
        this.receptorNombre = receptorNombre;
    }

    public double getMontoT() {
        return montoT;
    }

    public void setMontoT(double montoT) {
        this.montoT = montoT;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
}
