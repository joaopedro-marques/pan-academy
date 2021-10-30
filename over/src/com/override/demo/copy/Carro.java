package com.override.demo.copy;

public class Carro extends Veiculo{
	public void iniciar() {
		System.out.println("Ligando carro");
	}
	
	@Override
	public void iniciarCaminho() {
		System.out.println("Ligando carro");
	}
	
	
	
	public void frear() {
		System.out.println("Freando o carro");
	}
}
