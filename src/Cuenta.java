
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonif
 */
public class Cuenta {

    private String nombre;
    private String apellido;
    private int cedula;
    private String tipoCuenta;
    private String telefono;
    private String direccion;
    private double capital;
    private float numeroTargeta;
    private String fechaNacimiento;

    public boolean verificarCedula(int cedula) {

        int contador = 0;
        int bandera;
        int[] num = new int[10];

        bandera = cedula;

        do {
            bandera /= 10;
            contador++;
        } while (bandera >= 1);

        if (contador == 10) {
            num[9] = (int) (cedula % 10);
            num[8] = (int) (cedula % 100) / 10;
            num[7] = (int) (cedula % 1000) / 100;
            num[6] = (int) (cedula % 10000) / 1000;
            num[5] = (int) (cedula % 100000) / 10000;
            num[4] = (int) (cedula % 1000000) / 100000;
            num[3] = (int) (cedula % 10000000) / 1000000;
            num[2] = (int) (cedula % 100000000) / 10000000;
            num[1] = (int) (cedula % 1000000000) / 100000000;
            num[0] = (int) (cedula / 1000000000);

            bandera = 0;

            for (int i = 0; i < 9; i += 2) {
                if (i == 8) {
                    if (num[i] * 2 > 9) {
                        bandera += ((num[i] * 2) - 9);
                    } else {
                        bandera += (num[i] * 2);
                    }
                } else {
                    if (num[i] * 2 > 9) {
                        bandera += ((num[i] * 2) - 9) + num[i + 1];
                    } else {
                        bandera += (num[i] * 2) + num[i + 1];
                    }
                }
            }
        }
        return ((bandera % 10) == num[9]) || (10 - (bandera % 10) == num[9]);
    }

    public boolean validarFecha(String fechaNacimineto) {
        boolean validacion = true;

        String[] fechaN = fechaNacimineto.split("/");
        int dia = Integer.parseInt(fechaN[0]);
        int mes = Integer.parseInt(fechaN[1]) - 1;
        int anio = Integer.parseInt(fechaN[2]);

        if (anio % 4 == 0) {
            // bisiesto
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                validacion = true;
            }
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                validacion = true;
            }
            if (mes == 2 && dia <= 29) {
                validacion = true;
            }
        } else {
            //normalon
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                validacion = true;
            }
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                validacion = true;
            }
            if (mes == 2 && dia <= 28) {
                validacion = true;
            }
        }

        return validacion;
    }

    public boolean verificarEdad(String fechaNacimineto) {
        boolean validacion;

        Calendar fecha = Calendar.getInstance();
        int diaA = fecha.get(Calendar.DATE);
        int mesA = fecha.get(Calendar.MONTH);
        int anioA = fecha.get(Calendar.YEAR);

        String[] fechaN = fechaNacimineto.split("/");
        int diaN = Integer.parseInt(fechaN[0]);
        int mesN = Integer.parseInt(fechaN[1]) - 1;
        int anioN = Integer.parseInt(fechaN[2]);

        if ((anioA - anioN) < 18) {
            validacion = false;
        } else if ((anioA - anioN) > 18) {
            validacion = true;
        } else {
            if (mesA < mesN) {
                validacion = false;
            } else if (mesA > mesN) {
                validacion = true;
            } else {
                if (diaA < diaN) {
                    validacion = false;
                } else {
                    validacion = true;
                }
            }
        }
        return validacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public float getNumeroTargeta() {
        return numeroTargeta;
    }

    public void setNumeroTargeta(float numeroTargeta) {
        this.numeroTargeta = numeroTargeta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
