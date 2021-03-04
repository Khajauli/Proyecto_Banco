
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Telefono extends ServiciosBasicos {
    private String nombre;
    private double telefono;
    private boolean esVerdadero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public boolean isEsVerdadero() {
        return esVerdadero;
    }

    public void setEsVerdadero(boolean esVerdadero) {
        this.esVerdadero = esVerdadero;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    @Override
    public double getValorAPagar() {
        return valorAPagar;
    }

    @Override
    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    
    public boolean verificarTelefono(double telefono){
        int aux1;
        int aux2;
        String telefonoAux = Double.toString(telefono);
        if(telefonoAux.length()==9){
            /*aux1 = telefonoAux.charAt(0);
            aux2 = telefonoAux.charAt(1);*/
            
            return esVerdadero=true;
        }else{
            //JOptionPane.showMessageDialog(rootPane, "Debe ingresar un numero");
            JOptionPane.showMessageDialog(null,"No puede ingresar un número de Teléfono convencional que no tenga 9 dígitos","Teléfono Convencional", JOptionPane.ERROR_MESSAGE);
            return esVerdadero=false;
        }
    
    }
    public void planillaT(){
        Random miAleatorio=new Random();
        this.valorAPagar = miAleatorio.nextInt(45);
    }

    @Override
    public String toString() {
        return "Planilla de Teléfono Convencional:\n" + "Nombre del Usuario: " + nombre + ", Número de Teléfono: " + telefono + ", Se verificó el teléfono como: " + esVerdadero + ", Y el valor a pagar es: $"+this.valorAPagar;
    }
    
    
    
}
