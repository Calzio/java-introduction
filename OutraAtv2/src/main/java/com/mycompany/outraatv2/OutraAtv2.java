/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outraatv2;

/**
 *
 * @author Aluno
 */
public class OutraAtv2 {

    public static void main(String[] args) {
        Cliente client = new Cliente("Atendido", Sexo.MASCULINO, EstCivil.CASADO, "20/05/1992", "José Alencar", "14840921", "Josebalonga", 
        new End("Malviba", 73, "Não sei", "148091284", "Salvador", UF.BAHIA));
        PrestacaoServico prest = new PrestacaoServico("01/01/0001", "É isso aí", "412948114", "Pra amanhã", "Jon", "8190491284'", "yutaokkotsu69", 
        new End("Rua Augista", 6969, "É um puteiro se pá", "89178241284", "São Paulo", UF.SAO_PAULO));
        
        System.out.println(client.toString());
        System.out.println(prest.toString());
    }
}
