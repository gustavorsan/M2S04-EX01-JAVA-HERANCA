package com.devinhouse.ex1;

public class ContaCorrente extends Conta implements Operavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(this.obterSaldoAtual() + valor);
        System.out.println("Saldo atual: "+obterSaldoAtual());
    }

    @Override
    public void sacar(double valor) {
        double saldo = obterSaldoAtual();
        if (saldo < valor) {
            System.out.println("saldo insuficiente");
            return;
        }
        setSaldo(saldo - valor);
        System.out.println("Saldo atual: "+obterSaldoAtual());
    }

}


