/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaotipos;

/**
 *
 * @author Aluno
 */
public class Comparacaotipos {

    public static void main(String[] args) {
        String nomeUsuario = "Marta";
        int senha = 123;
        
        //Comparação de strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
