/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        
        //cliente.nome = "Marta";
        //cliente.idade = 20;
        cliente.setNome("Marta");
        cliente.setIdade(20);
        
        //Primeiro é set depois get
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
