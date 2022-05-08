/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    Profesor() {
        nombre = "Sandra";
        apellido = "Velez";
        cedula = "1102029383";
        sueldoBasico = 400;

    }

    public Profesor(String nombre, String apellido, String cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + ((sueldoBasico * 20) / 100);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String toString() {
        String cadena = String.format("Nombre del profesor: %s\n"
                + "Apellido del profesor: %s\n"
                + "Cédula: %s\n"
                + "Sueldo basico: %.2f\n"
                + "Sueldo total: %.2f\n", obtenerNombre(), obtenerApellido(), obtenerCedula(), obtenerSueldoBasico(), sueldoTotal);
        return cadena;
    }

}
