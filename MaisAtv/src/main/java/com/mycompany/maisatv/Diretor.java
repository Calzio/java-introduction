/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
    
    private final double PREMIO = 0.5;
    
    
    public double getSalarioF() {
        double salarioF = super.salario + PREMIO;
        salarioF += super.salario;
        return salarioF;
    }
    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("--- Admitido ---");
        System.out.println("Dados funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("--- Demitido ---");
        System.out.println("Dados funcionário: ");
        System.out.println(funcionario.toString());
    }

    public Diretor(BN bonificacao, String nome, String cpf, String rg, Endereco endereco, ST setor, SX sexo, double salario, String dataNascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor: " +
                super.toString() +
                "\nPrêmio: " + PREMIO ;
    }

    
    }
