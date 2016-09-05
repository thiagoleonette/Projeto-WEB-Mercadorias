package com.teste.mercadoria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.teste.mercadoria.model.Mercadoria;
import com.teste.mercadoria.repository.MercadoriaRepository;

@Service
public class CadastroMercadoriaService {

	@Autowired
	private MercadoriaRepository mercadoriaRepository;
	
	public void salvar(Mercadoria mercadoria){
		
		this.mercadoriaRepository.save(mercadoria);
		
		
	}
	
	
	
}
