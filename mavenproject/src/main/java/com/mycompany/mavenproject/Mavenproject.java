/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject;

/**
 *
 * @author Aluno
 */
public class Mavenproject {

    public static void main(String[] args) {
        Client cliente = new Client("Aldair", 25, "19/04", "Débito");
        Funcionario funcionario1 = new Funcionario("Aruan", 26, "23890", "Macumbeiro", 2800);
        
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Forma de pagamento: " + cliente.getFormaDePagamento());
        
        System.out.println("Nome do funcionario: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Matrícula: " + funcionario1.getMatricula());
        System.out.println("Cargo: ");
        
    }
}
