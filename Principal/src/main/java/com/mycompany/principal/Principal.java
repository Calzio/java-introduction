/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        EnderecoP endereco = new EnderecoP("Morioh", 22, "Cidade S");
        Cliente clientes = new Cliente("Yoshikage Kira", 33, endereco);
        
        System.out.println("Nome: " + clientes.getNome());
        System.out.println("Idade: " + clientes.getIdade());
        System.out.println("Lagradouro: " + clientes.getEndereco().getLagradouro());
        System.out.println("Número: " + clientes.getEndereco().getNumero());
        System.out.println("Cidade: " + clientes.getEndereco().getCidade());
    }
}
