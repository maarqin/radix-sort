/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;

import java.util.List;

/**
 *
 * @author thomaz
 */
public class Radix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Pessoa> p = Pessoa.construir(100);
        imprimir(p);
        
        ordenarPorNomes(p);
        imprimir(p);
        
        ordenarPorIdade(p);
        imprimir(p);
        
    }

    /**
     *
     * @param pessoas
     */
    public static void ordenarPorNomes(List<Pessoa> pessoas){
        
        int menor = 0;
        for (int i = 0; i < pessoas.size() - 1; i++) {
            
            for (int j = i + 1; j < pessoas.size(); j++) {
                
                String nome1 = pessoas.get(menor).nome;
                String nome2 = pessoas.get(j).nome;
                if( nome1.compareTo(nome2) > 0 ){
                    menor = j;
                }
            }
            
            Pessoa p = pessoas.get(i);
            pessoas.set(i, pessoas.get(menor));
            pessoas.set(menor, p);
        }

        
    }
    
    /**
     *
     * @param pessoas
     */
    public static void ordenarPorIdade(List<Pessoa> pessoas){
        int menor = 0;
        for (int i = 0; i < pessoas.size() - 1; i++) {
            
            for (int j = i + 1; j < pessoas.size(); j++) {
                
                Integer idade1 = pessoas.get(menor).idade;
                Integer idade2 = pessoas.get(j).idade;
                if( idade1.compareTo(idade2) > 0 ){
                    menor = j;
                }
            }
            
            Pessoa p = pessoas.get(i);
            pessoas.set(i, pessoas.get(menor));
            pessoas.set(menor, p);
        }
        
    }
    
    /**
     *
     * @param pessoas
     */
    public static void imprimir(List<Pessoa> pessoas){
        
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.print("\n");
    }
    
}
