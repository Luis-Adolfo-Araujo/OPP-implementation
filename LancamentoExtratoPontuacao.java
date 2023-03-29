/*herda de LancamentoExtrato
 * Pacote: br.gov.cesarschool.poo.fidelidade.cartao.negocio
Atributos: apenas os herdados.
Construtor: deve inicializar todos os atributos.
Métodos: apenas os herdados.
 * 
 * */

package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.DateTime;

class LancamentoExtratoPontuacao extends LancamentoExtrato{
	LancamentoExtratoPontuacao(long numeroCartao, int quantidadePontos, DateTime dataHoraLancamento){
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
	}
}
