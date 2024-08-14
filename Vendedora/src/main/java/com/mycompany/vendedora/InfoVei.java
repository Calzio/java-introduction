/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedora;

/**
 *
 * @author Aluno
 */
public class InfoVei {
    
    private String placa;
    private String cor;
    private int numPassageiros;
    private double capTank;
    private double velMax;
    private double consumoMed;

    public InfoVei(String placa, String cor, int numPassageiros, double capTank, double velMax, double consumoMed) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        this.capTank = capTank;
        this.velMax = velMax;
        this.consumoMed = consumoMed;
    }

    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapTank() {
        return capTank;
    }

    public void setCapTank(double capTank) {
        this.capTank = capTank;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getConsumoMed() {
        return consumoMed;
    }

    public void setConsumoMed(double consumoMed) {
        this.consumoMed = consumoMed;
    }
    
           
}
