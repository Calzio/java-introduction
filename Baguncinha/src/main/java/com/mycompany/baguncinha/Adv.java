/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public class Adv extends Func{
    private String oab;

    public Adv(String oab, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, End endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.oab = oab;
    }

    
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\nAdvogado: " +
                super.toString() +
                "\nOAB: " + oab;
    }

    
    
}
