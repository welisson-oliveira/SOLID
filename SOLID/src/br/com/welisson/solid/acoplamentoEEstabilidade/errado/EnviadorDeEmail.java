package br.com.welisson.solid.acoplamentoEEstabilidade.errado;

public class EnviadorDeEmail {

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}
