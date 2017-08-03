package br.com.welisson.solid.HerancaELiskovSubstitutivePrinciple.certo;

public class ContaDeEstudante {
	private final Operacao oper;
	private int milhas;
	
	public ContaDeEstudante() {
		oper = new Operacao();
	}

    public void deposita(double valor) {
        oper.deposita(valor);
        this.milhas += (int)valor;
    }

    public int getMilhas() {
        return milhas;
    }
    
    public double getSaldo(){
    	return oper.getSaldo();
    }

}
