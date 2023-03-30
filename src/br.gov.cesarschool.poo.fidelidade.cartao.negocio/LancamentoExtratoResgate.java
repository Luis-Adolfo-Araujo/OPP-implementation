/* herda de LancamentoExtrato
 * Pacote: br.gov.cesarschool.poo.fidelidade.cartao.negocio
Atributos: os herdados e...
• tipoResgate – br.gov.cesarschool.poo.fidelidade.cartao.negocio.TipoResgate
Construtor: deve inicializar todos os atributos.
Métodos: get público para tipoResgate.
 * 
 * */

package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.DateTime;

class LancamentoExtratoResgate extends LancamentoExtrato{
	br.gov.cesarschool.poo.fidelidade.cartao.negocio.TipoResgate tipoResgate;
}
	
public LancamentoExtratoResgate(long numeroCartao, int quantidadePontos, DateTime dataHoraLancamento, br.gov.cesarschool.poo.fidelidade.cartao.negocio.TipoResgate tipoResgate ){
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
		this.tipoResgate = tipoResgate;
	}

public br.gov.cesarschool.poo.fidelidade.cartao.negocio.TipoResgate getTipoResgate(){
	return tipoResgate;
}



