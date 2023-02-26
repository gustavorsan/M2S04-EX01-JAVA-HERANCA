package com.devinhouse.ex1;

public class Conta {
    private double saldo;

    Conta(double saldo){
        this.saldo = saldo;
    }

    protected double obterSaldoAtual(){
        return  this.saldo;
    }

    protected void setSaldo(double valor){
        this.saldo = valor;
    }
}
