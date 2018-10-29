package br.com.cognizant.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cognizant.spring.dao.ProjetoDAO;
import br.com.cognizant.spring.model.Projeto;

@Controller
@RequestMapping("projeto")
public class ProjetoController {

	@Autowired
	private ProjetoDAO dao;
	
	@GetMapping("cadastrar")
	public String cadastrar(Projeto projeto) {
		return "projeto/cadastro";
	} 
	
	@PostMapping("cadastrar")
	@Transactional
	public String cadastrar(@Valid Projeto projeto, BindingResult result,
															RedirectAttributes redirectAttributes) {
		if (result.hasErrors()){
			return cadastrar(projeto);
		}
		
		dao.cadastrar(projeto);
		redirectAttributes.addFlashAttribute("msg", "Disciplina cadastrada!");
		
		return "redirect:/disciplina/cadastrar";
	}
}
