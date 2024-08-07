/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeoperadores;

/**
 *
 * @author Aluno
 */
public class AtividadeOperadores {

    public static void main(String[] args) {
       Catalogos catalogo1 = new Catalogos("Memórias postumas de Brás Cubas", "Machado de Assis", 200, 120.50);
       Catalogos catalogo2 = new Catalogos("Hamlet", "William Shakespeare", 340, 215.60);
       
       
        System.out.println("O título é: " + catalogo1.getTitulo());
        System.out.println("O título é: " + catalogo2.getTitulo());
        
        System.out.println("O nome do autor é: " + catalogo1.getAutor());
        System.out.println("O nome do autor é: " + catalogo2.getAutor());
        
        System.out.println("O número de páginas do livro é: " + catalogo1.getNumPag());
        System.out.println("O número de páginas do livro é: " + catalogo2.getNumPag());
        
        System.out.println("O preço do livro é: " + catalogo1.getPreco() + "R$");
        System.out.println("O preço do livro é: " + catalogo2.getPreco() + "R$");
    }
}
