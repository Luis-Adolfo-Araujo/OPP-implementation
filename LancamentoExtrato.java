/*
 * Pacote: br.gov.cesarschool.poo.fidelidade.cartao.negocio
Atributos: devem ser privados
• numeroCartao - long
• quantidadePontos – int
• dataHoraLancamento – java.util.DateTime
Construtor: deve inicializar todos os atributos.
Métodos:
• gets públicos para todos os atributos.
 * */

package  br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.DateTime;

public class LancamentoExtrato {
	private long numeroCartao;
	private int quantidadePontos;
	private DateTime dataHoraLancamento;
}
public LancamentoExtrato(long numeroCartao, int quantidadePontos, DateTime dataHoraLancamento) {
	this.numeroCartao = numeroCartao;
	this.quantidadePontos = quantidadePontos;
	this.dataHoraLancamento = dataHoraLancamento;
		
	}
public long getNumeroCartao(){
	return numeroCartao;
}

public int getQuantidadePontos(){
	return quantidadePontos;
}

public DateTime getDataHoraLancamento(){
	return dataHoraLancamento;
}



