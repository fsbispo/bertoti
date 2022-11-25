/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.cidade;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Cidade {
    
    private List<Pessoa> pessoas = new LinkedList<Pessoa>();
    
    public void registerPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    /**
     */
    public List<Pessoa>findToResidencia(Residencia residencia){
        List<Pessoa> foundPessoas = new LinkedList<Pessoa>();
        for(Pessoa pessoa: pessoas){
            if(pessoa.getResidencia().compare(residencia)){
                foundPessoas.add(pessoa);
            }
        }   
        return foundPessoas;
    }
    
    public Pessoa findToCpf(String cpf){
        for(Pessoa pessoa: pessoas){
            if(pessoa.getCpf().equals(cpf)){
                return pessoa;
            }
        }
        return null;
    }
    
    public List<Pessoa> getPessoas(){
        return pessoas;
    }        
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
