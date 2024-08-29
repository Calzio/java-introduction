/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public enum BN {
    GERENTE(0.35),
    DIRETOR(0.45);
    
    private double valor;

    private BN(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }

    
    
}
