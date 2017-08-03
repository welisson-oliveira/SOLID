package br.com.welisson.solid.acoplamentoEEstabilidade.certo;

public class EnviadorDeEmail implements Acao {

    public void execute(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
