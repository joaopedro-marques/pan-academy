package com.joao.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.joao.microcalculadora.model.Calculadora;
import com.joao.microcalculadora.model.Tabela;

@Service
public class CalculadoraService {
	
	@Value("${micro_tabela.host}")
	private String microTabela;

	@Autowired
	private RestTemplate restTemplate;

	// na calculadora deste projeto, passa duas variáveis
	public Calculadora getCalculo(long tabelaId, int dias) {

		// crio u hash e nele passo um parametro la para o controller como string
		Map<String, String> urlParametros = new HashMap<>();

		// a variavel id, vira um paramtero
		urlParametros.put("id", "" + tabelaId);
		// Pegue os dados reltlativos a outra aplicação
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}", Tabela.class, urlParametros);
		return new Calculadora(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}

}
