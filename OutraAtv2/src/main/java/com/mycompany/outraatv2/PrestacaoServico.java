/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outraatv2;

/**
 *
 * @author Aluno
 */
public class PrestacaoServico extends Juridica{
    private String contratoInicio;
    private String contratoFim;

    public PrestacaoServico(String contratoInicio, String contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, End endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public String getContratoInicio() {
        return contratoInicio;
    }

    public String getContratoFim() {
        return contratoFim;
    }

    @Override
    public String toString() {
        return "\n Prestação de servico: " +
                super.toString() +
               "\nInício do contrato: " + contratoInicio + 
               "\nFim do contrato: " + contratoFim;
    }
}
