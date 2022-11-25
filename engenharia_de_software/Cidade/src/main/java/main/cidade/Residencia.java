/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.cidade;

/**
 *
 * @author Aluno
 */
public class Residencia {
    private String bairro;
    private String rua;
    private String numero;

    public Residencia(String bairro, String rua, String numero){
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }
    
    public String getBairroResidencia() {
        return bairro;
    }
    public void setBairroResidencia(String newBairro) {
        bairro = newBairro;
    }


    public String getRuaResidencia() {
        return rua;
    }
    public void setRuaResidencia(String newRua) {
        rua = newRua;
    }


    public String getNumeroResidencia() {
        return numero;
    }
    public void setNumeroResidencia(String newNumero) {
        numero = newNumero;
    }
    
    
    public boolean compare(Residencia residencia) {
        return this.bairro.equals(residencia.bairro) &&
                this.rua.equals(residencia.rua) &&
                this.numero.equals(residencia.numero);
    }
}
