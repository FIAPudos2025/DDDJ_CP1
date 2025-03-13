package br.com.modelo;

public class ContaBancaria {

    private double saldo = 0.0;

    private String titular;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente, impossível realizar saque");
        } else {
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

}
