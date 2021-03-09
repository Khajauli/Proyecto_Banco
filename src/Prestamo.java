/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonif
 */
public class Prestamo {

    private double montoPrestamo;
    private double montoPagar;
    private double interesAnual;
    private double cuotaMensual;
    private int tiempoPago;
 
    public Prestamo(double montoPrestamo, int tiempoPago){
        this.montoPrestamo=montoPrestamo;
        this.tiempoPago=tiempoPago;
    }
    public void calcularPrestamo() {
        this.montoPagar = (this.montoPrestamo * this.interesAnual) + this.montoPrestamo;
        this.cuotaMensual = this.montoPagar / tiempoPago;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public double getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoPagar = montoPagar;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public int getTiempoPago() {
        return tiempoPago;
    }

    public void setTiempoPago(int tiempoPago) {
        this.tiempoPago = tiempoPago;
    }

}
