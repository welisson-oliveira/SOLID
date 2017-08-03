package br.com.welisson.solid.encapsulamento.certo;

import java.util.List;

public class ProcessadorDeBoletos {
	public void processa(List<Boleto> boletos, Fatura fatura) {
        for(Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(),   
        MeioDePagamento.BOLETO);
            fatura.addPagamento(pagamento);
        }
        
        fatura.finalizarFatura();
    }
}
