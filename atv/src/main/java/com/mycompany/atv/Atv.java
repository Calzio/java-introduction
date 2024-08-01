/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv;

import java.util.Scanner;
//apertar alt + espaço importa as coisas

/**
 *
 * @author Aluno
 */
public class Atv {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //sout + ctrl + espaço = System.out.println(""); ou aperta tab
    
        System.out.println("Digite seu nome: "); 
        String nome = teclado.next();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite seu peso: ");
        double peso = teclado.nextDouble();
        //botar , ao invés de .
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso:" + peso);
        teclado.close();
        
    }
}
