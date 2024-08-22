/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outraatv2;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected String nome;
    protected String telefone;
    protected String email;
    protected End endereco;

    public Pessoa(String nome, String telefone, String email, End endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public End getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nE-mail: " + email + "@gmail.com" +
                "\n\nEndereço: " + endereco ;
    }
    
}
