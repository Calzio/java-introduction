/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosstring;

/**
 *
 * @author Aluno
 */
public class MetodosString {

    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        //Exibindo a quantia de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Exibir nome completo usando métodos Strings - Maiúsculas
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        //Com minúsculo
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
