package com.helpdelas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HelpdelasApplication {// implements CommandLineRunner {

public static void main(String[] args) {
	SpringApplication.run(HelpdelasApplication.class, args);
}
}
//NAO E UMA BOA PRATICA=
/*	@Autowired
	private ColaboradoraRepository colaboradoraRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdelasApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {

Colaboradora co = new Colaboradora(null, "joelma Bittencourt", "12306593825", "(11) 71234-5678");
				
Cliente cl= new Cliente(null, "joelma", "46039145803","(11)920025585");
				
OrdemServico os= new OrdemServico(null, Prioridade.ALTA,"teste create OD", Status.ANDAMENTO, co, cl);

co.getList().add(os);
cl.getList().add(os);

colaboradoraRepository.saveAll(Arrays.asList(co));
clienteRepository.saveAll(Arrays.asList(cl));
ordemServicoRepository.saveAll(Arrays.asList(os));
	}*/

