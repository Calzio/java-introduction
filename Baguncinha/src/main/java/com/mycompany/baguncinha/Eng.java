/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public class Eng extends Func{
    private String crea;

    public Eng(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Sexo sexo, EstCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, End endereco) {
        super(cpf, rg, matricula, setor, salario, sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
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
        return "\nEngenheiro: " +
                super.toString() +
                "crea=" + crea;
    }
    
    
}
