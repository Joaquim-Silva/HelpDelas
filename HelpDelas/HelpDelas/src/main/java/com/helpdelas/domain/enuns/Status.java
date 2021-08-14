package com.helpdelas.domain.enuns;

public enum Status {
	//CRIANDO STATUS
			ABERTO(0, "ABERTO"), // VALORES FIXOS CASO CRIE NOVOS STATUS
			ANDAMENTO(1, "ANDAMENTO"), 
			ENCERRADO(2, "ENCERRADO");

			// POR ACUSAR A FALTA DE CONSTRUTORES TERA QUE CRIAR ATRIBUTOS
			// adicionando construtor-using fields
			private Integer cod;
			private String descricao;// descricao da prioridade

			private Status(Integer cod, String descricao) {
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
			public static Status toEnum(Integer cod) {
			if (cod==null)	{//se o codigo for=null
				return null;//retorne null
			}
			for(Status x: Status.values()) {
				if(cod.equals(x.getCod())) {
					return x;
					//ate aqui vai receber a ordem e verificar se entra em alguma prioridade,se nao entrar
					
					}
			}//dessa forma ira retornar=
			throw new IllegalArgumentException("Status invalido"+ cod);
			}//ARGUMENTO ILEGAL,NAO EXISTE
		}
			






