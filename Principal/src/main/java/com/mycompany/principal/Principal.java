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
        Cliente cliente1 = new Cliente("Marta", 18, Sexo.FEMININO);
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Sexo: " + cliente1.getSexo().getTexto());
        System.out.println("Sexo: " + cliente1.getSexo().getCharactere());
    }
}
