/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvtostring;

/**
 *
 * @author Aluno
 */
public class Endereco {
    private String lagradouro;
    private int numero;
    private String complemento;
    private String cep; 
    private String cidade;
    private UnidadeFederativa uf;

    public Endereco(String lagradouro, int numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        this.lagradouro = lagradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "\nLagradouro: " + lagradouro + 
                "\nNumero: " + numero + 
                "\nComplemento:" + complemento + 
                "\nCEP: " + cep + 
                "\nCidade: " + cidade + 
                "\nUF: " + uf.getNome()+ "/"+ uf.getSigla();
    }
    
    
}
