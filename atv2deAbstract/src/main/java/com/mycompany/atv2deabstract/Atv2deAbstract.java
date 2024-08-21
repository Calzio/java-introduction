/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2deabstract;

/**
 *
 * @author Aluno
 */
public class Atv2deAbstract {

    public static void main(String[] args) {
        Motoboy moto = new Motoboy("01498192", "Lucio", "984172001", "01294810",156.20);
        Eng engenheiro = new Eng("1094812-14", "Rubinho", "129408192", "4182409121", 1248.10);
        Medico med = new Medico("14280192", "Alcemar", "35218043918", "9821741282", 5182.41);
        
        System.out.println(moto);
        System.out.println(engenheiro);
        System.out.println(med);
    }
}
