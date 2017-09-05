/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade.poo;

import java.io.File;

/**
 *
 * @author silva-muzime
 */
public class ListaFicheiros {
    private static void listaFicheiros(String directorio,int contador){
        File file=new File(directorio);
        File ficheiros []= file.listFiles();
        if(contador<ficheiros.length){
            System.out.println(ficheiros[contador].getName());
            listaFicheiros(directorio, contador+1);
            
        }
    }
    
    public static void main(String[] args) {
        listaFicheiros("/home/silva-muzime/Google Nexus 4 - 5.0.0 - API 21 - 768x1280/", 0);
    }
    
}
