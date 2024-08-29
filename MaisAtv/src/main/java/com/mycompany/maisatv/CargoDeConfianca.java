/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario{
    
    protected BN bonificacao;

    public CargoDeConfianca(BN bonificacao, String nome, String cpf, String rg, Endereco endereco, ST setor, SX sexo, double salario, String dataNascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public BN getBonificacao() {
        return bonificacao;
    }
    
    
}
