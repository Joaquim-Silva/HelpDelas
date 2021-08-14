package com.helpdelas.domain.enuns;

public enum Prioridade {

	//CRIANDO PRIORIDADES
		BAIXA(0, "BAIXA"), // VALORES FIXOS CASO CRIE NOVAS PRIORIDADES
		MEDIA(1, "MEDIA"), 
		ALTA(2, "ALTA");

		// POR ACUSAR A FALTA DE CONSTRUTORES TERA QUE CRIAR ATRIBUTOS
		// adicionando construtor-using fields
		private Integer cod;
		private String descricao;// descricao da prioridade

		private Prioridade(Integer cod, String descricao) {
			this.cod = cod;
			this.descricao = descricao;

			// cria apenas getter
		}

		public Integer getCod() {
			return cod;
		}

		public String getDescricao() {
			return descricao;
		}
		//criar um metodo static,static pra nao precisar instanciapra usar
		public static Prioridade toEnum(Integer cod) {
		if (cod==null)	{//se o codigo for=null
			return null;//retorne null
		}
		for(Prioridade x: Prioridade.values()) {
			if(cod.equals(x.getCod())) {
				return x;
				//ate aqui vai receber a ordem e verificar se entra em alguma prioridade,se nao entrar
				
				}
		}//dessa forma ira retornar=
		throw new IllegalArgumentException("Prioridade invalida"+ cod);
		}
	}
		
	

