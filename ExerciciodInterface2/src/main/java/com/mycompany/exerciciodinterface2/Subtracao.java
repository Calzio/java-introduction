/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciodinterface2;

/**
 *
 * @author Aluno
 */
public class Subtracao implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
    
}