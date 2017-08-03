package br.com.welisson.solid.srp;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new QuinzeOuVinteECincoPorCento()),
	TESTER(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra(){
		return regra;
	}
}
