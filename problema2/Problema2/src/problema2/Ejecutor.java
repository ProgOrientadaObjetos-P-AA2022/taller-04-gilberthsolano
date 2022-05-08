/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

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
        Profesor prof1 = new Profesor();
        prof1.calcularSueldoTotal();

        Profesor prof2 = new Profesor("Mercedes", "Sarango", "1102938902", 450);
        prof2.calcularSueldoTotal();
        
        
         System.out.printf("Profesor 1 %s\n", prof1);
        System.out.println("****************************");
        System.out.printf("Profesor 2 %s\n", prof2);

    }

}
