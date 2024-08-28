/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author Aluno
 */
public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos humanos"),
    OPERACOES("Operações");

private String sector;

    private Setor(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }
    
}
