/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciodinterface2;

/**
 *
 * @author Aluno
 */
public class ExerciciodInterface2 {

    public static void main(String[] args) {
        Soma somar = new Soma();
        Subtracao subrtrair = new Subtracao();
        
        System.out.println("Somar: " + somar.calcular(8, 4));
        System.out.println("Subtrair: " + subrtrair.calcular(4, 2));    }
}
