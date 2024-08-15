/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.haio;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("14/03", "Débito", "Miranda", 24, "Aquidaban", "8379-9131");
        
        Funcionari funcionario = new Funcionari("123890", "Cartomante", 19283, "Adilan", 37, "Mauricio", "9131-9232");
        
        System.out.println("Informações do cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Data da compra: " + cliente1.getDataCompra());
        System.out.println("Forma de pagamento: " + cliente1.getFormaDePagamento());
        System.out.println("Telefone: 9" + cliente1.getTelefone());
        
        System.out.println("\nInformações do Funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Matricula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Telefone: 9" + funcionario.getTelefone());
    }
}
