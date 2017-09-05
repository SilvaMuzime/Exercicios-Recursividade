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
public class SomaDigitos {
    private static int somaDigitos(int numero){
        if(numero==0)
            return 0;
        return numero%10 + somaDigitos(numero/10);
    }
    public static void main(String[] args) {
        System.out.println(somaDigitos(9001));
    }
}
