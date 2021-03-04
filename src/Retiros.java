/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivann
 */
public class Retiros implements Cajero{
    private double montoR;
    private double saldo;
     @Override
     public double calcularTransferencia(){
    this.saldo=this.saldo-this.montoR;
    return this.saldo;
    }

    public double getMontoR() {
        return montoR;
    }

    public void setMontoR(double montoR) {
        this.montoR = montoR;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
     
}
