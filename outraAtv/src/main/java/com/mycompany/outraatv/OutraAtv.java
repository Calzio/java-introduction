/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.outraatv;

/**
 *
 * @author Aluno
 */
public class OutraAtv {

    public static void main(String[] args) {
        Juridica jur = new Juridica("4091824", "41u4019", "Alan", "2814092481", "toinhodelas", 
        new End("Zimbambua", 29, "Arvóre azul", "18240192", "Portumalia", UF.BAHIA));
        Fisica fis = new Fisica(Sexo.MASCULINO, "06/19/2006", "Luciano", "89142109", "Cappuccinhomafioso", 
        new End("Copa Cabana", 91, "É alí tá ligado?", "984102941", "Copa Cabana", UF.RIO_DE_JANEIRO));
        
        System.out.println(jur.toString());
        System.out.println(fis.toString());
    
    }
}
