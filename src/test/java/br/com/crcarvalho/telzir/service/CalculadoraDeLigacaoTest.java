package br.com.crcarvalho.telzir.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.crcarvalho.telzir.model.LigacaoComPlano;
import br.com.crcarvalho.telzir.model.LigacaoSemPlano;
import br.com.crcarvalho.telzir.model.entity.Plano;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraDeLigacaoTest {
	
	@Autowired
	private CalculadoraDeLigacao calculadora;
	
	@Test
	public void testCalculaValorDaLigacaoDeOrigem11ParaDestino17PlanoMais30AbaixoDoLimite() {
		
		String origem = "011";
		String destino = "017";
		Integer duracao = 20;		
		Plano plano = new Plano(1L, "FaleMais 30", 30);
		
		assertEquals(BigDecimal.ZERO.setScale(2), calculadora.calcular(origem, destino, duracao, new LigacaoComPlano(plano)));
		assertEquals(new BigDecimal("34.00"), calculadora.calcular(origem, destino, duracao, new LigacaoSemPlano()));
	}
	
	@Test
	public void testCalculaValorDaLigacaoDeOrigem11ParaDestino17PlanoMais30AcimaDoLimite() {
		
		String origem = "011";
		String destino = "017";
		Integer duracao = 40;
		Plano plano = new Plano(1L, "FaleMais 30", 30);
		
		assertEquals(new BigDecimal("18.70"), calculadora.calcular(origem, destino, duracao, new LigacaoComPlano(plano)));
		assertEquals(new BigDecimal("68.00"), calculadora.calcular(origem, destino, duracao, new LigacaoSemPlano()));
	}
	
}
