/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public class Med extends Func{
    private String crm;

    public Med(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, End endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    @Override
    public String toString() {
        return "\nMedédico: " + 
                super.toString() +
                "\nCRM: " + crm ;
    }

    
    
}
