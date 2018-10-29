package br.com.cognizant.spring.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.cognizant.spring.dao.ProjetoDAO;
import br.com.cognizant.spring.model.Projeto;

@Repository
public class ProjetoDAOImpl extends GenericDAOImpl<Projeto, Integer> implements ProjetoDAO{

}
