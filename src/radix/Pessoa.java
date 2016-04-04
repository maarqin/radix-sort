/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author thomaz
 */
public class Pessoa {

    public static List<Pessoa> construir(int qtde){
        final String[] nomes = {"Nome 1", "Nome 2", "Nome 3"};
        final String[] sobrenomes = {"Sobrenome 1", "Sobrenome 2", "Sobrenome 3",
        "Sobrenome 4", "Sobrenome 5", "Sobrenome 6", "Sobrenome 7"};
        final Integer[] idades = {16, 18, 22, 26};
        
        ArrayList<Pessoa> al = new ArrayList();
        Random r = new Random(qtde);
        
        do {            
            
            
            String nome = nomes[ r.nextInt(nomes.length) ];
            String sobrenome = sobrenomes[ r.nextInt(nomes.length) ];
            Integer idade = idades[ r.nextInt(nomes.length) ];

            
            al.add(new Pessoa(nome + " " +sobrenome, idade));
            qtde--;
        } while (qtde > 0);
        
        return al;
    }
    
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + "}";
    }
    
    public String nome;
    public Integer idade;
}
