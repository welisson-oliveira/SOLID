package br.com.welisson.solid.srp;

public class CalculadoraDeSalario {

	public double calcula(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calcula(funcionario);
	}

}
