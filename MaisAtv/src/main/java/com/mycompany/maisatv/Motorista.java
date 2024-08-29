/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public class Motorista extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motorista(String carteiraDeHabilitacao, String nome, String cpf, String rg, Endereco endereco, ST setor, SX sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motorista: " +
                super.toString() +
               "\nCarteira de habilitação: " + carteiraDeHabilitacao;
    }
    
    
}
