package com.helpdelas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Colaboradora extends Pessoa implements Serializable{
		private static final long seriaVersionUID=1L;

	
//gerando os atributos da superclasse-
	//constructor from superclass
		@OneToMany(mappedBy = "colaboradora")
	private List<OrdemServico> List= new ArrayList<>();//lista de ordem de serviço
	public Colaboradora() {
		super();
		
	}

	public Colaboradora(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}//getter e setter da list

	public List<OrdemServico> getList() {
		return List;
	}

	public void setList(List<OrdemServico> list) {
		List = list;
	}

	
}
