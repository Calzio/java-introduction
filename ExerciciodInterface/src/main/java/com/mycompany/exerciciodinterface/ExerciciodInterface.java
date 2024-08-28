/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciodinterface;

/**
 *
 * @author Aluno
 */
public class ExerciciodInterface {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Galo rooster = new Galo();
        Pato duck = new Pato();
        
        System.out.println(dog.emitirSom());
        System.out.println(dog.comer());
        
        System.out.println(cat.emitirSom());
        System.out.println(cat.comer());
        
        System.out.println(rooster.emitirSom());
        System.out.println(rooster.comer());
        
        System.out.println(duck.emitirSom());
        System.out.println(duck.comer());
        
    }
}
