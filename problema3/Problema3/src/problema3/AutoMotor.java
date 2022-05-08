/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class AutoMotor {

    private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public AutoMotor() {
        cedula = "1109094456";
        marcaVehiculo = "Mazda";
        anioFabricacion = 2014;
        valorVehiculo = 12000;

    }

    public AutoMotor(String cedula, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedula = cedula;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarcaVehiculo(String c) {
        marcaVehiculo = c;
    }

    public void establecerAnioFabricacion(int c) {
        anioFabricacion = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = anioFabricacion * ((valorVehiculo * 0.002) / 100);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        String cadena = String.format("Cédula: %s\n"
                + "Marca del vehículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula: %.2f\n", obtenerCedula(), obtenerMarcaVehiculo(),
                obtenerAnioFabricacion(), obtenerValorVehiculo(), obtenerValorMatricula());
        return cadena;
    }
}
