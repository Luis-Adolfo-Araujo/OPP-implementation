package br.gov.cesarschool.poo.fidelidade.cartao.negocio;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import br.gov.cesarschool.poo.fidelidade.cartao.dao.CartaoFidelidadeDAO;
import br.gov.cesarschool.poo.fidelidade.cartao.dao.LancamentoExtratoDAO;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;
import br.gov.cesarschool.poo.fidelidade.cartao.entidade.CartaoFidelidade;
import br.gov.cesarschool.poo.fidelidade.cartao.entidade.LancamentoExtratoPontuacao;
import br.gov.cesarschool.poo.fidelidade.cartao.entidade.LancamentoExtratoResgate;
import br.gov.cesarschool.poo.fidelidade.cartao.entidade.TipoResgate;

public class CartaoFidelidadeMediator {
	private static CartaoFidelidadeMediator instance = null;
	private CartaoFidelidadeDAO repositorioCartao;
	private LancamentoExtratoDAO repositorioLancamento;
	
	private CartaoFidelidadeMediator() {
		this.repositorioCartao = new CartaoFidelidadeDAO();
		this.repositorioLancamento = new LancamentoExtratoDAO();
	}
	public static CartaoFidelidadeMediator getInstance() {
		if (instance == null) {
			instance = new CartaoFidelidadeMediator();
		}
		return instance;
	}
	public long gerarCartao(Cliente cliente) {
        LocalDateTime dataAtual = LocalDateTime.now();
        String numeroCartao = cliente.getCpf() + dataAtual.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        CartaoFidelidade cartao = new CartaoFidelidade(numeroCartao, cliente);
        this.repositorioCartao.incluir(cartao);
        return cartao.getNumero();
    }
	
	public String pontuar (long numeroCartao, double quantidadePontos) {
		if(quantidadePontos <= 0) {
			System.out.println("Quantidade de Pontos invalida!!");
		}
		CartaoFidelidade cartao = repositorioCartao.buscar(numeroCartao);
        if (cartao == null) {
            return "Cartão não encontrado";
        }
        if (cartao.getSaldo() < quantidadePontos) {
            return "Saldo insuficiente para realizar o resgate";
        }
        cartao.debitar(quantidadePontos);
        repositorioCartao.alterar(cartao);
        
        LancamentoExtratoPontuacao lancamento = new LancamentoExtratoPontuacao(cartao.getNumero(), quantidadePontos, new Date());
        repositorioLancamento.incluir(lancamento);
        
        return null;
    }
	
	public String resgatar(long numeroCartao, double quantidadePontos, TipoResgate tipo) {
        if (quantidadePontos <= 0) {
            return "A quantidade de pontos deve ser maior que zero";
        }

        CartaoFidelidade cartao = this.repositorioCartao.buscar(numeroCartao);
        if (cartao == null) {
            return "Cartão não encontrado";
        }

        if (cartao.getSaldo() < quantidadePontos) {
            return "Saldo insuficiente para realizar o resgate";
        }

        cartao.debitar(quantidadePontos);
        this.repositorioCartao.alterar(cartao);
        LancamentoExtratoResgate lancamento = new LancamentoExtratoResgate(cartao, quantidadePontos);
        this.repositorioLancamento.incluir(lancamento);

        return null;
    }
		
}
	

