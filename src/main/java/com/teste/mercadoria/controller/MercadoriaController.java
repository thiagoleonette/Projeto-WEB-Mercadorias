package com.teste.mercadoria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teste.mercadoria.model.TipoMercadoria;
import com.teste.mercadoria.model.Mercadoria;
import com.teste.mercadoria.repository.MercadoriaRepository;
import com.teste.mercadoria.service.CadastroMercadoriaService;

@Controller
@RequestMapping("/mercadoria")
public class MercadoriaController {
	
	@Autowired
	private MercadoriaRepository MercadoriaRepository;
	
	@Autowired
	private CadastroMercadoriaService cadastroMercadoriaService;
	
	@RequestMapping
	public ModelAndView pesquisa() {
		ModelAndView mv = new ModelAndView("/mercadoria/ListagemMercadorias");
		mv.addObject("mercadorias", MercadoriaRepository.findAll());
		
		return mv;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo(Mercadoria mercadoria) {
		ModelAndView mv = new ModelAndView("/mercadoria/CadastroMercadoria");
		mv.addObject("tipos", TipoMercadoria.values());
		return mv;
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Mercadoria mercadoria, BindingResult result){
		if(result.hasErrors()){
			return novo(mercadoria);
		}
		cadastroMercadoriaService.salvar(mercadoria);
		return new ModelAndView("redirect:/mercadoria/novo");
		
	}
}
