package com.helpdelas.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdelas.domain.Cliente;
import com.helpdelas.domain.Colaboradora;
import com.helpdelas.domain.OrdemServico;
import com.helpdelas.domain.enuns.Prioridade;
import com.helpdelas.domain.enuns.Status;
import com.helpdelas.repositories.ClienteRepository;
import com.helpdelas.repositories.ColaboradoraRepository;
import com.helpdelas.repositories.OrdemServicoRepository;

@Service
public class DBService {

	@Autowired
	private ColaboradoraRepository colaboradoraRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	
	public void instanciaBD() {
		
Colaboradora co = new Colaboradora(null, "joelma Bittencourt", "12306593825", "(11) 71234-5678");
		
		Cliente cl= new Cliente(null, "joelma", "46039145803","(11)920025585");
						
		OrdemServico os= new OrdemServico(null, Prioridade.ALTA,"teste create OD", Status.ANDAMENTO, co, cl);
		
		colaboradoraRepository.saveAll(Arrays.asList(co));
		clienteRepository.saveAll(Arrays.asList(cl));
		ordemServicoRepository.saveAll(Arrays.asList(os));
}
}