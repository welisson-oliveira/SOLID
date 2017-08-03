package br.com.welisson.solid.encapsulamento.errado;

public class Boleto {
	private double valor;


    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
