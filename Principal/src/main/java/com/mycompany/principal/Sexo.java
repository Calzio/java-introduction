/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private String texto;
    private char charactere;

    private Sexo(String texto, char charactere) {
        this.texto = texto;
        this.charactere = charactere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCharactere() {
        return charactere;
    }
    
    
    
}
