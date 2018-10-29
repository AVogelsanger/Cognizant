package br.com.cognizant.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.cognizant.spring.dao.EquipeDAO;
import br.com.cognizant.spring.dao.ProjetoDAO;
import br.com.cognizant.spring.model.Equipe;

@Controller
@RequestMapping("equipe")
public class EquipeController {

	@Autowired
	private ProjetoDAO dao;
	
	@Autowired
	private EquipeDAO equipeDao;
	
	@GetMapping("listar")
	public ModelAndView Listar() {
		return new ModelAndView("projeto/lista").addObject("projetos", dao.listar());
	}
	
	@GetMapping("cadastrar")
	public ModelAndView cadastrar(Equipe equipe) {
		return new ModelAndView("equipe/cadastro").addObject("equipes", equipeDao.listar());
	}
	

	@PostMapping("cadastrar")
	@Transactional
	public ModelAndView cadastrar(@Valid Equipe equipe, BindingResult result, RedirectAttributes r) {
		
		if (result.hasErrors()){
			return cadastrar(equipe);
			}
		
		equipeDao.cadastrar(equipe);
		r.addFlashAttribute("msg","Prova cadastrada!");
		
		return new ModelAndView ("redirect:/prova/cadastrar");
	}
}
