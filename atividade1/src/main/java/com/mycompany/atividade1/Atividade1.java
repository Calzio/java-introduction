/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1;

import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class Atividade1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Digite o valor da compra: ");
        double valorcompra = teclado.nextDouble();
        
        double valortotal = valorcompra / 5;
        
        System.out.println("Mercado mamão com açucar");
        System.out.println("O comprador é: " + nome);
        System.out.println("O valor inicial é: " + valorcompra + " R$");
        System.out.println("O valor total é: " + valortotal + " R$");
       
        //além de diminuir o uso da memoria, significa que o usupario não utilizará mais o teclado
        teclado.close();
    }
}
