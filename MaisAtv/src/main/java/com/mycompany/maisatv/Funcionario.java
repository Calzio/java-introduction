/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    
    protected String nome; 
    protected String cpf; 
    protected String rg; 
    protected Endereco endereco;
    protected ST setor;
    protected SX sexo;
    protected double salario;
    protected String dataNascimento; 

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, ST setor, SX sexo, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ST getSetor() {
        return setor;
    }

    public void setSetor(ST setor) {
        this.setor = setor;
    }

    public SX getSexo() {
        return sexo;
    }

    public void setSexo(SX sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return  "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nSetor: " + setor.getNome() +
                "\nSexo: " + sexo.getTexto() + "/" + sexo.getCaractere() +
                "\nSalário: " + salario +
                "\nData de nascimento: " + dataNascimento +
                "\n\nEndereço: " + endereco;
    }
    
    
}
