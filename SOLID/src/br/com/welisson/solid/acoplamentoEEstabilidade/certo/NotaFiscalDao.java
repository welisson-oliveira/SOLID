package br.com.welisson.solid.acoplamentoEEstabilidade.certo;

public class NotaFiscalDao implements Acao {

    public void execute(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
