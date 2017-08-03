package br.com.welisson.solid.OpenClosedEDependencyInversion.certo;

public class Frete implements PrecoFrete{
	
	public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
