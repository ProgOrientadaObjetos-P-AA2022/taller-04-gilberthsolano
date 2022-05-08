/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

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

        AutoMotor au1 = new AutoMotor();
        au1.calcularValorMatricula();

        AutoMotor au2 = new AutoMotor("1102929922", "BMW", 2007, 23090);
        au2.calcularValorMatricula();

        System.out.printf("Automotor 1: %s\n", au1);
        System.out.println("****************************");
        System.out.printf("Automotor 2:   %s\n", au2);

    }

}
