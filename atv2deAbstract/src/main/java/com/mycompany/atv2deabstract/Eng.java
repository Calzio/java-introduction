/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv2deabstract;

/**
 *
 * @author Aluno
 */
public class Eng extends Func{

    private String crea;

    public Eng(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\nPerfil do engenheiro: " + 
                super.toString() +
                "\nCREA: " + crea ;
    }
    
}
