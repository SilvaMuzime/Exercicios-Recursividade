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
public class OcorrenciaNumero {
    private static int numeroOcorrencias(int numero, int ocorrencias,int numeroPesquisado){
        if(numero==0)
            return ocorrencias;
        if(numero%10==numeroPesquisado)
            ++ocorrencias;
        return numeroOcorrencias(numero/10, ocorrencias,numeroPesquisado);
    }
    
    public static void main(String[] args) {
        System.out.println(numeroOcorrencias(1555878781, 0, 8));
    }
    
}
