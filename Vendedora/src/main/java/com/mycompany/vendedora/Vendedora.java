/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vendedora;

/**
 *
 * @author Aluno
 */
public class Vendedora {

    public static void main(String[] args) {
        InfoVei carro = new InfoVei("JOJ-095", "azul", 6, 60, 300, 20);
        InfoCliente cliente = new InfoCliente("Caio", 18, "Rua 20 de Agosto", "1924918249", "9 8196-0191");
        
        System.out.println("Dados do veículo:");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Número de passageiros: " + carro.getNumPassageiros());
        System.out.println("Capacidade do tanque: " + carro.getCapTank() + "Litros");
        System.out.println("Velocidade máxima: " + carro.getVelMax() + "Km/h");
        System.out.println("Consumo médio: " + carro.getConsumoMed() + "Litros");
        
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Edereço: " + cliente.getEndereco());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
