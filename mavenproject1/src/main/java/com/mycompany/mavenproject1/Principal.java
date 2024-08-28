/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println(toto.emitirSom());
        System.out.println(gato.emitirSom());
    }
}
