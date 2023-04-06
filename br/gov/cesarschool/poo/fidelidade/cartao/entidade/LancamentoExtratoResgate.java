package br.gov.cesarschool.poo.fidelidade.cartao.entidade;

import java.time.LocalDateTime;

public class LancamentoExtratoResgate extends LancamentoExtrato{
	br.gov.cesarschool.poo.fidelidade.cartao.entidade.TipoResgate tipoResgate;

	
public LancamentoExtratoResgate(long numeroCartao, int quantidadePontos, LocalDateTime dataHoraLancamento, br.gov.cesarschool.poo.fidelidade.cartao.entidade.TipoResgate tipoResgate ){
		super(numeroCartao, quantidadePontos, dataHoraLancamento);
		this.tipoResgate = tipoResgate;
	}

public br.gov.cesarschool.poo.fidelidade.cartao.entidade.TipoResgate getTipoResgate(){
	return tipoResgate;
}

}

