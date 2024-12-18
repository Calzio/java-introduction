/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baguncinha;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    private String protocoloAtendimento;

    public Cliente(String protocoloAtendimento, Sexo sexo, EstCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, End endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    
    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
    
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }

}
