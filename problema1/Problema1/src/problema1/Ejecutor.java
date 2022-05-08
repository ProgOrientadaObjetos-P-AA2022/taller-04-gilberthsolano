/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PromedioEstudiante p1 = new PromedioEstudiante();
        p1.calcularPromedio();

        PromedioEstudiante p2 = new PromedioEstudiante("Mercedes Vivanco", 9.80, 8.88, 7.00);
        p2.calcularPromedio();

        System.out.printf("Notas estudiante 1 %s\n", p1);
        System.out.println("****************************");
        System.out.printf("Notas estudiante 2 %s\n", p2);

    }

}
