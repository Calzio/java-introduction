/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public enum ST {
    ENGENHARIA("Engenharia"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("Recursos humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    private String nome;

    private ST(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
