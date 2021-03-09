/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Recarga {
    private double telefonoR;
    private double monto;
    private boolean esVerdadero;
    private String operadora;
    
    public Recarga(double telefono,double monto,String operadora){
        this.telefonoR=telefono;
        this.monto=monto;
        this.operadora=operadora;
    }

    public boolean isEsVerdadero() {
        return esVerdadero;
    }

    public void setEsVerdadero(boolean esVerdadero) {
        this.esVerdadero = esVerdadero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    

    public double getTelefonoR() {
        return telefonoR;
    }

    public void setTelefonoR(double telefonoR) {
        this.telefonoR = telefonoR;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public boolean verificarCelular(double telefono){
        int aux1;
        int aux2;
        String telefonoAuxiliar;
        telefonoAuxiliar=Double.toString(telefono);
        if(telefonoAuxiliar.length()==10){
            aux1 = telefonoAuxiliar.charAt(0);
            aux2 = telefonoAuxiliar.charAt(1);
            if(aux1==0 && aux2==9){
                esVerdadero=true;
            }else{
                esVerdadero=false;
            }
        }
        return esVerdadero;
}

    public Recarga(double telefonoR, double monto) {
        this.telefonoR = telefonoR;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Factura de la Recarga:\n" + "Número de Teléfono: " + telefonoR + ", Monto de la Recarga: $" + monto + ", El número celular se verificó como: " + esVerdadero;
    }
    
    
   
   
    
    
    
}
