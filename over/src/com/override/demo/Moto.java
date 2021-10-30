package com.override.demo;

public class Moto extends Veiculo{
	
	public void iniciar() {
		System.out.println("Ligando a moto");
	}
	
	public void andar() {
		System.out.println("Acelerando a moto");
	}
	
	public void frear() {
		System.out.println("Freando a moto");
	}
}
