/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv2deabstract;

/**
 *
 * @author Aluno
 */
public class Medico extends Func{
    
    private String crn;

    public Medico(String crn, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crn = crn;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    @Override
    public String toString() {
        return "\nPerfil do médico: " + 
                super.toString() +
                "\nCRN: " + crn ;
    }
    
    
}
