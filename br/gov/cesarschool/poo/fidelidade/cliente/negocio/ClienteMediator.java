package br.gov.cesarschool.poo.fidelidade.cliente.negocio;

import java.time.LocalDateTime;
import br.gov.cesarschool.poo.fidelidade.cliente.dao.ClienteDAO;
import br.gov.cesarschool.poo.fidelidade.cliente.entidade.Cliente;
import br.gov.cesarschool.poo.fidelidade.cartao.negocio.CartaoFidelidadeMediator;

public class ClienteMediator {
	
	private static ClienteMediator instance;
	private ClienteDAO repositorioCliente;
	private CartaoFidelidadeMediator cartaoMediator;
	
	private ClienteMediator(){
		// NOVA INSTANCIA
		this.repositorioCliente = new ClienteDAO();
		// COM INSTANCIA UNICA
		this.cartaoMediator =  CartaoFidelidadeMediator.getInstance();
	}
	public static ClienteMediator getInstance() {
		if(instance == null) {
			instance = new ClienteMediator();
		}
		return instance;
	}
	public ResultadoInclusaoCliente incluir(Cliente cliente) {
		
	}
	
	public String alterar (Cliente cliente) {
		
	}
	
	private String validar(Cliente cliente) {
		
	}
}
