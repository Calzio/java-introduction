/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a nota da primeira prova: ");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = teclado.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        String status;
        
        
        if (media >= 7) {
            System.out.println("Média: " + media);
            status = "aprovado";
            System.out.println("status: " + status);
            
        } else if (media < 7 && media >= 5){
            System.out.println("Média: " + media);
            status = "verificação suplementar";
            System.out.println("status: " + status);
            
        } else if (media < 5){
            System.out.println("Média: " + media);
            status = "reprovado";
            System.out.println("status: " + status);
        }
    }
}
