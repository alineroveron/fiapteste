package br.com.fiap.loja;

public class MoedaEstrangeira {

	/**
	 * Convers�o de Moeda Estrangeira
	 */
	public int converteDolar (int valorDolar){
		
	if(valorDolar < 0) return 0;
		
	return valorDolar * 2;
	}

}
