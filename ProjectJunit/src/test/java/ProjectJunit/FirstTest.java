package ProjectJunit;

import org.junit.Test;

public class FirstTest {
	
	//A anoção deve ser pública e não pode ter retorno.
	
	//@Test
	public void primeiroMetodoDeExemplodeTesteValido() {
		
	}
	
	//@Test
	public void segundoMetodoDeExemplodeTesteValido() {
	
	}
	
	//@Test
	public String terceirooMetodoDeExemplodeTesteReturnString () {
		return "";
	}
	
	//@Test
	private void quartoMetodoDeExemplodeTesteInvalidoPrivado () {
		
	}
	
	@Test
	public void quintoMetodoDeExemploImpressaoNaTela () {
		System.out.println("Teste 1 executado");
	}
	
	@Test
	public void sextoMetodoDeExemploImpressaoNaTela () {
		System.out.println("Teste 2 executado");
	}
	
	//@Test
	public void metodoNaoTesteDeImpressao () {
		System.out.println("Essa msg não será executada!");
	}
}	


