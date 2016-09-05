package com.teste.mercadoria.model;

public enum TipoMercadoria {

	PADARIA("Padaria"), ACOUGUE("Açougue"), PEIXARIA("Peixaria"), MERCEARIA("Mercearia"), 
	HIGIENEPESSOAL("Higiene Pessoal"), LIMPEZA("Limpeza"), BEBIDAS("Bebidas"), 
	HORTIFRUTI("Hortifruti"),BAZAR("Bazar"),ELETRODOMÉSTICOS("Eletrodomésticos"), 
	CAMAMESABANHO("Cama mesa e banho"), OUTROS("outros");
	
	private String descricao;
	
	TipoMercadoria(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
