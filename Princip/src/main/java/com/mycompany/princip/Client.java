/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.princip;

/**
 *
 * @author Aluno
 */
public class Client {
    
    private String nome;
    private int idade;
    private Peto pet;

    public Client(String nome, int idade, Peto pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public Peto getPet() {
        return pet;
    }

    public void setPet(Peto pet) {
        this.pet = pet;
    }
    
    
    
}
