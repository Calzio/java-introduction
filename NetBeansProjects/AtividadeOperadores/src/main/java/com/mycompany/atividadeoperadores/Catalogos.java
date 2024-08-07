/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeoperadores;

/**
 *
 * @author Aluno
 */
public class Catalogos {
    private String titulo;
    private String autor;
    private int numPag;
    private double preco;

    public Catalogos(String titulo, String autor, int numPag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.preco = preco;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
