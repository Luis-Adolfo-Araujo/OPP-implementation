package br.gov.cesarschool.poo.fidelidade.util;

public class ValidadorCPF {
	
	private ValidadorCPF() {
		
	}
	
	public static boolean ehCpfValido(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			return false;
		}
		
		 for (int i = 0; i < cpf.length(); i++) {
		        if (cpf.charAt(i) < '1' || cpf.charAt(i) > '9') {
		            return false;
		        }
		    }
		
		int soma = 0 ; 
		int primeiroDigitoVerificador;
		int segundoDigitoVerificador;
		
		for(int i = 0; i < 9;i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i); //pega o caractere do indice i e soma 
		}
		
		int resto = soma % 11 ;
		if(resto < 2) {
			primeiroDigitoVerificador = 0;
		}
		
		else {
			primeiroDigitoVerificador = (11 - resto);
		}
		
		soma = 0;
		for(int i = 0; i < 10;i++) {
			soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i); //pega o caractere do indice i e soma 
		}
		
		resto = soma % 11 ;
		if(resto < 2) {
			segundoDigitoVerificador = 0;
		}
		
		else {
			segundoDigitoVerificador = (11 - resto);
		}
		
	    if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigitoVerificador && Character.getNumericValue(cpf.charAt(10)) != segundoDigitoVerificador) {
	    	return false;
	    }
	    
		return true;
	}
}