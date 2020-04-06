//Ra : 18.01353-8
//Nome : Guilherme Ballardini

package com.company;

public class Conta {
    private Usuario user;
    private int idConta;
    private double saldo;
    private static int totalDeContas;



    public double getSaldo() {
        return saldo;
    }


    public Conta(Usuario user, double saldo) {
        this.user = user;
        this.saldo = saldo;
        totalDeContas = totalDeContas + 1;
        idConta = totalDeContas;
    }

    public Usuario getUser() {
        return user;
    }

    public int getIdConta() {
        return idConta;
    }

    public double pagarConta(double valor) {
        return (this.saldo -= valor);
    }
    public double receberConta(double valor) {
        return (this.saldo += valor);
    }


}
