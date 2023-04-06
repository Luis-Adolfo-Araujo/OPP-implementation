package br.gov.cesarschool.poo.fidelidade.util;

public class StringUtil {
	
	private StringUtil(){
		
	}
	
	public static boolean ehNuloOuBranco(String str){
		if(str == null) {
			return true;
		}
		String strVazia = str.trim();
		return strVazia.isEmpty();
	
	}
}