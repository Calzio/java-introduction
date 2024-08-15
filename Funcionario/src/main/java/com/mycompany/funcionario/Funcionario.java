/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author Aluno
 */
public class Funcionario {

    public static void main(String[] args) {
        Func funcionarios = new Func(12389, "Luan", 4122, Setor.FINANCEIRO, Sexo.MASCULINO, 32);
        
        System.out.println("\nInformações do funcionário: ");
        System.out.println("Id: " + funcionarios.getId());
        System.out.println("Nome: " + funcionarios.getNome());
        System.out.println("Salário: R$" + funcionarios.getSalario());
        System.out.println("Setor: " + funcionarios.getSetor().getSector());
        System.out.println("Sexo: " + funcionarios.getSexo().getTexto());
        System.out.println("Sexo: " + funcionarios.getSexo().getCaractere());
        System.out.println("Idade: " + funcionarios.getIdade());
    }
}
