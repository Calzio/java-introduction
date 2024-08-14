/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private EnderecoP endereco;

    public Cliente(String nome, int idade, EnderecoP endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public EnderecoP getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoP endereco) {
        this.endereco = endereco;
    }
    
    
    
}
