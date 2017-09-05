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
public class Multiplicacao {
    private static int multiplicacao(int valor1, int valor2){
        if(valor2==0)
            return 0;
        return valor1 + multiplicacao(valor1, valor2-1);
    }
    public static void main(String[] args) {
        System.out.println(multiplicacao(5, 9));
    }
}
