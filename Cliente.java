package br.gov.cesarschool.poo.fidelidade.cliente.negocio;

import java.util.Date;

public class Cliente{
	private String cpf;
	private String nomeCompleto;
	private br.gov.cesarschool.poo.fidelidade.geral.Sexo sexo;
	private Date dataNascimento;
	private double renda;
	private br.gov.cesarschool.poo.fidelidade.geral.negocio.Endereco endereço;
}
public Cliente (String cpf, String nomeCompleto, br.gov.cesarschool.poo.fidelidade.geral.Sexo sexo , Date dataNascimento,double renda, br.gov.cesarschool.poo.fidelidade.geral.negocio.Endereco endereço){
	this.cpf = cpf ;
	this.nomeCompleto = nomeCompleto;
	this.sexo = sexo;
	this.dataNascimento = dataNascimento;
	this.renda = renda;
	this.endereço = endereço; 
}

public String getCpf(){
return cpf; 
}

public String getNomeCompleto(){
return nomeCompleto; 
}

public br.gov.cesarschool.poo.fidelidade.geral.Sexo  getSexo(){
return sexo; 
}

public Date getDataNascimento(){
return dataNascimento; 
}

public double getRenda(){
return renda; 
}

public br.gov.cesarschool.poo.fidelidade.geral.negocio.Endereco getEndereco(){
return endereço;
}

public void setNomeCompleto(String NomeCompleto){
this.nomeCompleto = nomeCompleto ;
}

public void setSexo(br.gov.cesarschool.poo.fidelidade.geral.Sexo sexo){
this.sexo  = sexo ;
}

public void setDataNascimento(Date dataNascimento){
this.dataNascimento = dataNascimento;
}

public void setRenda(double renda ){
this.renda = renda ;
}

public void setEndereço(br.gov.cesarschool.poo.fidelidade.geral.negocio.Endereco endereço ){
this.endereço = endereço ;
}

public int obterIdade(){
Date dataAtual = new Date(); // outra forma de fazer
int idade = (dataAtual.getYear() - dataNascimento.getYear()) + 1900; //pegando a diferenca de anos entre o Date atual e o dataNascimento
return idade ;

}


}