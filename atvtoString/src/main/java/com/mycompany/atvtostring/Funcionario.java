/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvtostring;

/**
 *
 * @author Aluno
 */
public class Funcionario {
        
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNasc;
    private Sexo sex;
    private Setor sector;
    private double salario;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Funcionario(int id, String nome, String cpf, String rg, String matricula, String dataNasc, Sexo sex, Setor sector, double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.sex = sex;
        this.sector = sector;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Sexo getSex() {
        return sex;
    }

    public void setSex(Sexo sex) {
        this.sex = sex;
    }

    public Setor getSector() {
        return sector;
    }

    public void setSector(Setor sector) {
        this.sector = sector;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dados do funcionário: " +
                "\nid: " + id +
                "\nNome: " + nome + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nMatricula: " + matricula + 
                "\nData de Nascimento: " + dataNasc + 
                "\nSexo: " + sex.getTexto() + "/" + sex.getCaracter() + 
                "\nSetor: " + sector.getTexto()+  
                "\nSalario: " + salario + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\n\nEndereco: " + endereco;
    }

    
    
}
