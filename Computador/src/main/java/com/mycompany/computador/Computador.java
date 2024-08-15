/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class Computador {

    public static void main(String[] args) {
        Processador processador = new Processador(60, "Kingston", "IXF4564");
        Memoria mem = new Memoria(512, "Anatel", "IX8455");
        PlacaMae placaMae = new PlacaMae("LGA 115", "Intel", "Intel core-i5");
        DispdArmazenamento ssd = new DispdArmazenamento("NVMe", "Snapdragon", "Esseaí");
        
        System.out.println("\nDados do processador: " + processador.getFrequencia());
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        
        System.out.println("\nDados do memória: " + mem.getCapacidadeDeArmazenamento());
        System.out.println("Marca: " + mem.getMarca());
        System.out.println("Modelo: " + mem.getModelo());
        
        System.out.println("\nDados do placa mãe: " + placaMae.getSoquete());
        System.out.println("Marca: " + placaMae.getMarca());
        System.out.println("Modelo: " + placaMae.getModelo());
        
        System.out.println("\nDados do ssd: " + ssd.getTipoDeConexao());
        System.out.println("Marca: " + ssd.getMarca());
        System.out.println("Modelo: " + ssd.getModelo());
        
    }
}
