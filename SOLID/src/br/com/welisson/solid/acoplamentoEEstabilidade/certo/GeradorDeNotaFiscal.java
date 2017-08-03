package br.com.welisson.solid.acoplamentoEEstabilidade.certo;

import java.util.List;

public class GeradorDeNotaFiscal {

	private final List<Acao> acoes;

	public GeradorDeNotaFiscal(final List<Acao> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for(Acao action : acoes){
			action.execute(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
