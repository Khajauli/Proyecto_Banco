import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Agua extends ServiciosBasicos{
    double numeroMedidorA;

    public double getNumeroMedidorA() {
        return numeroMedidorA;
    }

    public void setNumeroMedidorA(double numeroMedidorA) {
        this.numeroMedidorA = numeroMedidorA;
    }

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    @Override
    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public Agua(double numeroMedidorA) {
        this.numeroMedidorA = numeroMedidorA;
    }
    public void planillaA(){
        Random miAleatorio=new Random();
        this.valorAPagar = miAleatorio.nextInt(50);
    }

    @Override
    public String toString() {
        return "Planilla del Agua:\n" + "Número De Medidor = " + numeroMedidorA + ", y el Valor a pagar por dicha planilla es: $"+this.valorAPagar;
    }
    
}
