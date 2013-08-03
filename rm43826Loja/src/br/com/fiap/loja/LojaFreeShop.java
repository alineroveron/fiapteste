package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	/**
	 *Free Shop
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite o valor em dolar: ");
		Scanner teclado = new Scanner(System.in);
		int valorDolar = teclado.nextInt();
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		
		int valorReal = converter.converteDolar(valorDolar);
		
		System.out.println("Valor em real: " + valorReal);
	}
	
	

}
