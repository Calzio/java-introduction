/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvtostring;

/**
 *
 * @author Aluno
 */
public class AtvtoString {

    public static void main(String[] args) {
        
        //Poderia apagar o endereço que está em Funcionario e começar com new Endereco normalmente
        Funcionario funcionario = new Funcionario(1233, "Caio", "1938100224", "213870218491", "329185721", "19/06/2006", Sexo.MASCULINO, Setor.ENGENHARIA, 24309.41, "103901941", "Caoba@gmail.com",
        new Endereco("Brasilia", 56, "Amaral Silveira", "198410901", "Barragram", UnidadeFederativa.BAHIA));
       
/* 
        System.out.println("Dados do funcionário: \n");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("RG: " + funcionario.getRg());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Data de nascimento: " + funcionario.getDataNasc());
        System.out.println("Sexo: " + funcionario.getSex().getTexto());
        System.out.println("Setor: " + funcionario.getSector().getTexto());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Lagradouro: " + funcionario.getEndereco().getLagradouro());
        System.out.println("Número: " + funcionario.getEndereco().getNumero());
        System.out.println("Complemento: " + funcionario.getEndereco().getComplemento());
        System.out.println("CEP: " + funcionario.getEndereco().getCep());
        System.out.println("Cidade: " + funcionario.getEndereco().getCidade());
        System.out.println("Unidade federativa: " + funcionario.getEndereco().getUf().getSigla());
        ctrl + ? funciona pra fazer comentário tbm
 */       

        System.out.println(funcionario.toString());
    } 
    
}
