/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outraatv;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, End endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\nPessoa juridica: " +
                super.toString() +
                "\nCNPJ: " + cnpj + 
                "\nInscrição estadual: " + inscricaoEstadual;
    }

          
}
