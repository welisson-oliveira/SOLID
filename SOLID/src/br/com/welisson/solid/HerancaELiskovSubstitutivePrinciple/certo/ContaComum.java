package br.com.welisson.solid.HerancaELiskovSubstitutivePrinciple.certo;

public class ContaComum {
	private final Operacao oper;

    public ContaComum() {
        oper = new Operacao();
    }

    public void deposita(double valor) {
        oper.deposita(valor);
    }

    public void saca(double valor) {
        oper.saca(valor);
    }

    public void rende() {
        oper.rende(1.1);
    }

    public double getSaldo() {
        return oper.getSaldo();
    }
}
