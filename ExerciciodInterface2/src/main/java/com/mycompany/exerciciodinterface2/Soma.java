package com.mycompany.exerciciodinterface2;


import com.mycompany.exerciciodinterface2.OperacaoMatematica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Soma implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
    
    
    
}
