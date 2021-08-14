package com.helpdelas.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

	@Entity
	public class Cliente extends Pessoa implements Serializable{ //extender pessoa
	
		private static final long serialVersionUID =1L;

	

		@OneToMany(mappedBy = "cliente")
		private List<OrdemServico> List= new ArrayList<>();//lista de ordem de serviço	
//constructor da super clsse
	//generate from superclass
		
	public Cliente() {
		super();
		
	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}
//getter e setter da list
	public List<OrdemServico> getList() {
		return List;
	}

	public void setList(List<OrdemServico> list) {
		List = list;
	}

	
}
