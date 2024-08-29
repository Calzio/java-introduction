/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maisatv;

/**
 *
 * @author Aluno
 */
public class MaisAtv {

    public static void main(String[] args) {
        //dá pra criar um endereço separado tipo Dndereco end = new Endereco que será universal
        Advogado adv = new Advogado("Sim", "Paulinho gogó", "0481948201", "180941024i", new Endereco("Fenda do biquíni", "99", "Do lado de uma casa com cabeça de lula", "1874109241", "Fossa das Marianas", UF.BAHIA), ST.JURIDICO, SX.MASCULINO, 10000, "01/01/0001");
        
        System.out.println(adv.toString());
    }
}
