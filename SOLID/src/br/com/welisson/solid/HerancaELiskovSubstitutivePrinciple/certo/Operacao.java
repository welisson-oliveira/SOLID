package br.com.welisson.solid.HerancaELiskovSubstitutivePrinciple.certo;

public class Operacao {
	private double saldo;
	
	public Operacao() {
		this.saldo = 0;
	}
	
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void rende(double rende) {
        this.saldo += this.saldo * rende;
    }

    public double getSaldo() {
        return saldo;
    }
}
