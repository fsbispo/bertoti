/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.cidade;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String cpf;
    private Residencia residencia;
    private String nome;
    private String sexo;
    
    public Pessoa(String cpf, Residencia residencia, String nome, String sexo) {
            this.cpf = cpf;
            this.residencia = residencia;
            this.nome = nome;
            this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String newCpf) {
        cpf = newCpf;
    }


    public Residencia getResidencia() {
        return residencia;
    }
    public void setResidencia(Residencia newResidencia) {
        residencia = newResidencia;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String newSexo) {
        sexo = newSexo;
    }
}
