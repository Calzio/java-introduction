/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodinterface;

/**
 *
 * @author Aluno
 */
public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "\nQuack";
    }

    @Override
    public String comer() {
        return "Insetos";
    }
    
    
}
