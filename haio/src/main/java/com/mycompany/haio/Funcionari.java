/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haio;

/**
 *
 * @author Aluno
 */
public class Funcionari extends Pessoa{
    
    private String matricula;
    private String cargo;
    private double salario;

    public Funcionari(String matricula, String cargo, double salario, String nome, int idade, String endereco, String telefone) {
        super(nome, idade, endereco, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

      
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
