package br.gov.cesarschool.poo.fidelidade.geral.negocio;

public enum Sexo {
	
	MASCULINO(1, "Masculino"), FEMININO(2, "Feminino");
	
	private int valor;
	private String descricao;
	
	Sexo(int valor, String descricao){
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

}