/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bah;

/**
 *
 * @author Aluno
 */

//ctrl + R renomeia
public class Principal2 {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios("Calcio", 18, 8000);
        
        //caso seja algo novo utiliza constructor se não, usa set
        //funcionario.setNome("Calcio");
        //funcionario.setIdade(18);
        //funcionario.setSalario(8000);
        
        System.out.println("O nome do usuário é: " + funcionario.getNome());
        System.out.println("A idade d usuário é: " + funcionario.getIdade());
        System.out.println("O salario é: " + funcionario.getSalario());
    }
}
