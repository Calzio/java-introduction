/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haio;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    private String dataCompra;
    private String formaDePagamento;

    public Cliente(String dataCompra, String formaDePagamento, String nome, int idade, String endereco, String telefone) {
        super(nome, idade, endereco, telefone);
        this.dataCompra = dataCompra;
        this.formaDePagamento = formaDePagamento;
    }

        
    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
}
