/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class PromedioEstudiante {

    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public PromedioEstudiante() {
        nombre = "Maria Jumbo";
        materia1 = 7.50;
        materia2 = 8.02;
        materia3 = 9.00;

    }

    public PromedioEstudiante(String nombre, double materia1, double materia2, double materia3) {
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerMateria1(double c) {
        materia1 = c;
    }

    public void establecerMateria2(double c) {
        materia2 = c;
    }

    public void establecerMateria3(double c) {
        materia3 = c;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String toString() {
        String cadena = String.format(
                "Nombre del estudiante: %s\n"
                + "Calificación Materia 1: %.2f\n"
                + "Calificación Materia 2: %.2f\n"
                + "Calificación Materia 3: %.2f\n"
                + "Promedio de las calificaciones: %.2f\n",
                obtenerNombre(), obtenerMateria1(), obtenerMateria2(), obtenerMateria3(), obtenerPromedio());

        return cadena;
    }

}
