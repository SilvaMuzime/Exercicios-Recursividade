/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.poo;

/**
 *
 * @author silva-muzime
 */
public class ConversorBinario {
    
    /**
     * Metodo que converte um numero decimal para binario
     * @param numero
     * @param binario
     * @return numero invertido em String
     */
    private static String converteDecimal(int numero, String binario){
        if(numero==0)
            return binario;       
            
        return converteDecimal(numero/2, numero%2+binario);
    }
    
    
    /**
     * Metodo que converte um numero decimal para binario
     * @param numero
     * @return numero binario inteiro
     */
    private  static int converteDecimal(int numero){
        if(numero==0)
            return 0;
        return  converteDecimal(numero/2)*10+ numero%2;
    }
    
    
    /**
     * Metodo que converte um numero binario para decimal
     * @param numero
     * @return numero decimal inteiro
     */
    private static int converteBinario(int numero){
        if(numero==0)
            return 0;
        return converteBinario(numero/10)*2 +numero%10;
    }
    
    
    
    
    public static void main(String[] args) {
        System.out.println(converteDecimal(10));
    }
    
}
