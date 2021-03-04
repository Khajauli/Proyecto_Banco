
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Luz extends ServiciosBasicos {
    private double numeroMedidorL;

    public double getNumeroMedidorL() {
        return numeroMedidorL;
    }

    public void setNumeroMedidorL(double numeroMedidorL) {
        this.numeroMedidorL = numeroMedidorL;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public Luz(double numeroMedidorL) {
        this.numeroMedidorL = numeroMedidorL;
    }
    public void planillaL(){
        Random miAleatorio=new Random();
        this.valorAPagar = miAleatorio.nextInt(35);
    }

    @Override
    public String toString() {
        return "Planilla de la Luz:\n" + "Numero De Medidor = " + numeroMedidorL + ", Y el valor a pagar es de: $"+this.valorAPagar;
    }
    
}
