/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = teclado.next();
        
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7) {
            System.out.println("Nome do aluno: " + nomeAluno);
            System.out.println("Média: " + media);
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nome do aluno: " + nomeAluno);
            System.out.println("Média: " + media);
            System.out.println("Reprovado.");
        }
        
    }
}
