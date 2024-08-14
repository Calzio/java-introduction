/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.princip;

/**
 *
 * @author Aluno
 */
public class Princip {

    public static void main(String[] args) {
       // Peto pet = new Peto("Iggy", 10, "boston terrier ");
       //Client cliente = new Client("Polnareff", 36, pet);
       
       Client cliente = new Client("Polnareff", 32, 
               new Peto("Iggy", 10, "boston terrier"));
        
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Nome do pet: " + cliente.getPet().getNome());
        System.out.println("Idade do pet: " + cliente.getPet().getIdade());
        System.out.println("Raça do pet: " + cliente.getPet().getRaca());
        
    }
}
