/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivann
 */
public class Deposito implements Cajero {
    private double montoD;
    private double saldo;
    @Override
    public double calcularTransferencia(){
    this.saldo=this.saldo+this.montoD;
    return this.saldo;
    }

    public double getMonto() {
        return montoD;
    }

    public void setMonto(double monto) {
        this.montoD = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
