/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ditie o primero número: ");
        int a = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int b = teclado.nextInt();
        
        int menor;
        
        if (a < b) {
            menor = a;
        } else {
            menor = b;
        }
        
        System.out.println("O menor número é: " + menor);
    }
}
