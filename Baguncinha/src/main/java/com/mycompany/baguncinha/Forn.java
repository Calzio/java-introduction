/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public class Forn extends Juridica{
    private String produto;

    public Forn(String produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, End endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProduto: " + produto ;
    }
    
    
}
