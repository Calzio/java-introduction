/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Juridica pessoaJuridica = new Juridica("913810930", "2304194i10", "Aruan", "39184u109");
        Fisica pessoaFisica = new Fisica("3018418013", "845301941", "27/05/2006", "Tom", "019524901");
        
        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}
