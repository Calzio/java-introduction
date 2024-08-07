/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadoreslogicos;

/**
 *
 * @author Aluno
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        //declaração de variáveis
        boolean temSol = true;
        boolean folga = false;
        
        //Só irá passear se as duas condições forem verdadeiras.
        if (temSol && folga) {
            System.out.println("Irei passear hoje! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }
    }
}
