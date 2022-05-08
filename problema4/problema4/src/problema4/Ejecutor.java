/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

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
        EntidadFinanciera en1 = new EntidadFinanciera();
        en1.calcularComisionBanco();

        EntidadFinanciera en2 = new EntidadFinanciera("Marlon Suquilanda","Banco Internacion",12900);
        en2.calcularComisionBanco();

        System.out.printf("Detalles cheque 1: %s\n", en1);
        System.out.println("****************************");
        System.out.printf("Detalles cheque 2:   %s\n", en2);
    }

}
