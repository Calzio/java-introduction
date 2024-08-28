/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    protected Sexo sexo;
    protected EstCivil estadoCivil;
    protected String dataNascimento;

    public Fisica(Sexo sexo, EstCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, End endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public EstCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
