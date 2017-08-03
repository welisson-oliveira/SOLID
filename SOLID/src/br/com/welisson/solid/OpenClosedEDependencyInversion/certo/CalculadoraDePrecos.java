package br.com.welisson.solid.OpenClosedEDependencyInversion.certo;

public class CalculadoraDePrecos {
	
	private PrecoPadrao precoPadrao;
	private PrecoFrete frete;

	public CalculadoraDePrecos(PrecoPadrao precoPadrao, PrecoFrete frete) {
		this.precoPadrao = precoPadrao;
		this.frete = frete;
	}
	
	public double calcula(Compra produto) {
        
        double desconto = precoPadrao.descontoPara(produto.getValor());
        double valorFrete = frete.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + valorFrete;
    }
}
