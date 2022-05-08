/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class EntidadFinanciera {
    private String cliente;
    private String banco;
    private double valorCheque;
    private double comisionBanco;
    
    public EntidadFinanciera(){
        this.cliente="Rigoberto Sotomayor Burneo";
        this.banco="Banco de Loja";
        this.valorCheque=24000;
        
    }
    public EntidadFinanciera(String cliente, String banco, double valorCheque){
        this.cliente=cliente;
        this.banco=banco;
        this.valorCheque=valorCheque;
    }
    public void establecerCliente(String c){
        cliente=c;
    }
    public void establecerBanco(String c){
        banco=c;
    }
    public void establecerValorCheque(double c){
        valorCheque=c;
    }
    public void calcularComisionBanco(){
        comisionBanco=(valorCheque*0.003/100);
    }
    public String obtenerCliente(){
        return cliente;
        
    }
    public String obtenerBanco(){
        return banco;
    }
    public double obtenerValorCheque(){
        return valorCheque;
    }
    public double obtenerComisionBanco(){
        return comisionBanco;
    }
      public String toString() {
        String cadena = String.format("Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Valor de la comisión que cobra el banco: %.2f\n" ,
                obtenerCliente (),
                obtenerBanco (),
                obtenerValorCheque (),
                obtenerComisionBanco ());
        return cadena;
    }
    
    
    
}
