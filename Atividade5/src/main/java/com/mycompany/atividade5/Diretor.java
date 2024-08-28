/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    
    private final double PREMIO = 0.2; //isso é uma constante;
    
    @Override
    public double getSalarioFinal() {
        double salarioFinal = super.salarioBase + PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
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

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor: " +
                "\nPrêmio: " + PREMIO ;
    }
    
     
}
